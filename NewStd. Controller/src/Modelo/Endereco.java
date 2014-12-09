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
public class Endereco {
   
    private Long   end_id;
    private String end_rua;
    private String end_bairro;
    private String end_cidade;

    public Endereco(){
    
    }
    
    public Endereco(String end_rua, String end_bairro,
            String end_cidade){
        this.end_rua = end_rua;
        this.end_cidade = end_cidade;
        this.end_bairro = end_bairro;
    }
    
    public Long getEnd_id() {
        return end_id;
    }

    public void setEnd_id(Long end_id) {
        this.end_id = end_id;
    }

    
    public String getEnd_rua() {
        return end_rua;
    }


    public void setEnd_rua(String end_rua) {
        this.end_rua = end_rua;
    }


    public String getEnd_bairro() {
        return end_bairro;
    }


    public void setEnd_bairro(String end_bairro) {
        this.end_bairro = end_bairro;
    }


    public String getEnd_cidade() {
        return end_cidade;
    }


    public void setEnd_cidade(String end_cidade) {
        this.end_cidade = end_cidade;
    }
    
    
}