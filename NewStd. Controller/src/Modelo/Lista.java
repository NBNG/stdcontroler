/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Lista {
    
    private Long lt_id;
    private List<Produto> lt_prod;
    private int lt_quant;

    public Lista(){
        
    }
    
    public Lista(Long lt_id, List<Produto> lt_prod, int lt_quant) {
        this.lt_id = lt_id;
        this.lt_prod = lt_prod;
        this.lt_quant = lt_quant;
    }

    public Long getLt_id() {
        return lt_id;
    }

    public void setLt_id(Long lt_id) {
        this.lt_id = lt_id;
    }

    public List<Produto> getLt_prod() {
        return lt_prod;
    }

    public void setLt_prod(List<Produto> lt_prod) {
        this.lt_prod = lt_prod;
    }

    public int getLt_quant() {
        return lt_quant;
    }

    public void setLt_quant(int lt_quant) {
        this.lt_quant = lt_quant;
    }
    
    
}
