/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Transacao {
    
    private Long           tran_id;
    private Lista          tran_lista;
    private Date           tran_data;
    private List<Parcela> tran_parcelas;
    
    public Transacao(){
        
    }

    public Transacao(Long tran_id, Lista tran_lista, Date tran_data, 
            List<Parcela> tran_parcelas) {
        this.tran_id = tran_id;
        this.tran_lista = tran_lista;
        this.tran_data = tran_data;
        this.tran_parcelas = tran_parcelas;
    }

    public Long getTran_id() {
        return tran_id;
    }

    public void setTran_id(Long tran_id) {
        this.tran_id = tran_id;
    }

    public Lista getTran_lista() {
        return tran_lista;
    }

    public void setTran_lista(Lista tran_lista) {
        this.tran_lista = tran_lista;
    }

    public Date getTran_data() {
        return tran_data;
    }

    public void setTran_data(Date tran_data) {
        this.tran_data = tran_data;
    }

    public List<Parcela> getTran_parcelas() {
        return tran_parcelas;
    }

    public void setTran_parcelas(List<Parcela> tran_parcelas) {
        this.tran_parcelas = tran_parcelas;
    }
  
    
}
