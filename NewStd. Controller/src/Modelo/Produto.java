/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Gustavo
 */
public class Produto {
    
    private Long prod_id;
    private float prod_desc;
    private float prod_preco;
    private int prod_quant;

    public Produto(){
        
    }
    
    public Produto(Long prod_id, float prod_desc, float prod_preco,
            int prod_quant) {
        this.prod_id = prod_id;
        this.prod_desc = prod_desc;
        this.prod_preco = prod_preco;
        this.prod_quant = prod_quant;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public float getProd_desc() {
        return prod_desc;
    }

    public void setProd_desc(float prod_desc) {
        this.prod_desc = prod_desc;
    }

    public float getProd_preco() {
        return prod_preco;
    }

    public void setProd_preco(float prod_preco) {
        this.prod_preco = prod_preco;
    }

    public int getProd_quant() {
        return prod_quant;
    }

    public void setProd_quant(int prod_quant) {
        this.prod_quant = prod_quant;
    }
    
    
}
