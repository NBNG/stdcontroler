package Modelo;

import java.util.Date;
import java.util.List;

public class Cliente {
    
    private Long   cli_codigo;
    private String cli_nome;
    private Date   cli_nascimento;
    private String cli_telefone;
    private String cli_celular;
    private String cli_cpf;
    private String cli_rg;
    private String cli_email;
    private String cli_numero;
    private List<Endereco> cli_endereco;

    public Cliente(){
        
    }
    
    public Cliente(Long cli_codigo, String cli_nome, Date cli_nascimento,
            String cli_telefone, String cli_celular, String cli_cpf, String cli_rg, String cli_email, String cli_numero, List<Endereco> cli_endereco) {
        this.cli_codigo = cli_codigo;
        this.cli_nome = cli_nome;
        this.cli_nascimento = cli_nascimento;
        this.cli_telefone = cli_telefone;
        this.cli_celular = cli_celular;
        this.cli_cpf = cli_cpf;
        this.cli_rg = cli_rg;
        this.cli_email = cli_email;
        this.cli_numero = cli_numero;
        this.cli_endereco = cli_endereco;
    }
    
    /**
     * @return the cli_codigo
     */
    public Long getCli_codigo() {
        return cli_codigo;
    }

    /**
     * @param cli_codigo the cli_codigo to set
     */
    public void setCli_codigo(Long cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    /**
     * @return the cli_nome
     */
    public String getCli_nome() {
        return cli_nome;
    }

    /**
     * @param cli_nome the cli_nome to set
     */
    public void setCli_nome(String cli_nome) {
        this.cli_nome = cli_nome;
    }

    /**
     * @return the cli_nascimento
     */
    public Date getCli_nascimento() {
        return cli_nascimento;
    }

    /**
     * @param cli_nascimento the cli_nascimento to set
     */
    public void setCli_nascimento(Date cli_nascimento) {
        this.cli_nascimento = cli_nascimento;
    }

    /**
     * @return the cli_telefone
     */
    public String getCli_telefone() {
        return cli_telefone;
    }

    /**
     * @param cli_telefone the cli_telefone to set
     */
    public void setCli_telefone(String cli_telefone) {
        this.cli_telefone = cli_telefone;
    }

    /**
     * @return the cli_celular
     */
    public String getCli_celular() {
        return cli_celular;
    }

    /**
     * @param cli_celular the cli_celular to set
     */
    public void setCli_celular(String cli_celular) {
        this.cli_celular = cli_celular;
    }

    /**
     * @return the cli_cpf
     */
    public String getCli_cpf() {
        return cli_cpf;
    }

    /**
     * @param cli_cpf the cli_cpf to set
     */
    public void setCli_cpf(String cli_cpf) {
        this.cli_cpf = cli_cpf;
    }

    /**
     * @return the cli_rg
     */
    public String getCli_rg() {
        return cli_rg;
    }

    /**
     * @param cli_rg the cli_rg to set
     */
    public void setCli_rg(String cli_rg) {
        this.cli_rg = cli_rg;
    }

    /**
     * @return the cli_email
     */
    public String getCli_email() {
        return cli_email;
    }

    /**
     * @param cli_email the cli_email to set
     */
    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    /**
     * @return the cli_numero
     */
    public String getCli_numero() {
        return cli_numero;
    }

    /**
     * @param cli_numero the cli_numero to set
     */
    public void setCli_numero(String cli_numero) {
        this.cli_numero = cli_numero;
    }

    /**
     * @return the cli_endereco
     */
    public List<Endereco> getCli_endereco() {
        return cli_endereco;
    }

    /**
     * @param cli_endereco the cli_endereco to set
     */
    public void setCli_endereco(List<Endereco> cli_endereco) {
        this.cli_endereco = cli_endereco;
    }
    
    
    

}
