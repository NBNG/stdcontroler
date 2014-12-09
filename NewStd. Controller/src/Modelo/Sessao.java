/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Sessao {
    
    private Long          ses_codigo;
    private Cliente       ses_cliente;
    private Funcionario   ses_funcionario;
    private Date          ses_data;
    private String        ses_tipo;
    private String        ses_sinal;
    private String        ses_retoque;
    private String        ses_hora;
    private List<Parcela> ses_parcela;
    
    public Sessao(){
        
    }

    public Sessao(Long ses_codigo, Cliente ses_cliente,
            Funcionario ses_funcionario, Date ses_data, String ses_tipo, String ses_sinal, String ses_retoque, String ses_hora, List<Parcela> ses_parcela) {
        this.ses_codigo = ses_codigo;
        this.ses_cliente = ses_cliente;
        this.ses_funcionario = ses_funcionario;
        this.ses_data = ses_data;
        this.ses_tipo = ses_tipo;
        this.ses_sinal = ses_sinal;
        this.ses_retoque = ses_retoque;
        this.ses_hora = ses_hora;
        this.ses_parcela = ses_parcela;
    }

    public Long getSes_codigo() {
        return ses_codigo;
    }

    public void setSes_codigo(Long ses_codigo) {
        this.ses_codigo = ses_codigo;
    }

    public Cliente getSes_cliente() {
        return ses_cliente;
    }

    public void setSes_cliente(Cliente ses_cliente) {
        this.ses_cliente = ses_cliente;
    }

    public Funcionario getSes_funcionario() {
        return ses_funcionario;
    }

    public void setSes_funcionario(Funcionario ses_funcionario) {
        this.ses_funcionario = ses_funcionario;
    }

    public Date getSes_data() {
        return ses_data;
    }

    public void setSes_data(Date ses_data) {
        this.ses_data = ses_data;
    }

    public String getSes_tipo() {
        return ses_tipo;
    }

    public void setSes_tipo(String ses_tipo) {
        this.ses_tipo = ses_tipo;
    }

    public String getSes_sinal() {
        return ses_sinal;
    }

    public void setSes_sinal(String ses_sinal) {
        this.ses_sinal = ses_sinal;
    }

    public String getSes_retoque() {
        return ses_retoque;
    }

    public void setSes_retoque(String ses_retoque) {
        this.ses_retoque = ses_retoque;
    }

    public String getSes_hora() {
        return ses_hora;
    }

    public void setSes_hora(String ses_hora) {
        this.ses_hora = ses_hora;
    }

    public List<Parcela> getSes_parcela() {
        return ses_parcela;
    }

    public void setSes_parcela(List<Parcela> ses_parcela) {
        this.ses_parcela = ses_parcela;
    }

    
}