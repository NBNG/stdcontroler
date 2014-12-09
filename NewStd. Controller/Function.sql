
CREATE OR REPLACE FUNCTION listarvalordata()
  RETURNS numeric AS
$BODY$
 DECLARE
 entrada numeric(9,2); -- declaração de variáveis e atribuição dos parâmetros para essas variáveis.
 saida numeric(9,2);
 
 BEGIN
 
 LOCK TABLE "movimentacao"; -- trava a tabela para nenhuma outra instancia da função acessar a tabela e gerar o mesmo numero.
 
 entrada = (SELECT SUM(mov_valor) from (SELECT mov_valor,mov_tipo from movimentacao where mov_data = current_date) as valores where mov_tipo = 'E'); -- pega o numero da tabela
 saida = (SELECT SUM(mov_valor) from (SELECT mov_valor,mov_tipo from movimentacao where mov_data = current_date) as valores where mov_tipo = 'S');
 
 IF entrada is null THEN --caso não tenha registro para a empresa e serie informado, cria um novo.
	entrada = 0.0;
 END IF;
 
 IF saida is null THEN
	saida = 0.0;
 END IF;
 
 RETURN entrada - saida; -- retorna o próximo numero.
  
 END;
 $BODY$
  LANGUAGE plpgsql VOLATILE;

select * from listarvalordata();