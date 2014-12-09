package Modelo;

import java.util.Date;

public class Parcela {

   private Long   par_codigo;
   private Date   par_datapgto;
   private int    par_parcela;
   private String par_tipo;
   private float  par_desc;
   private float  par_valor;
   private String par_status;
   private Date   par_datacompra;
   private String par_obs;
   
   public Parcela(){
       
   }

    public Parcela(Long par_codigo, Date par_datapgto, int par_parcela,
            String par_tipo, float par_desc, float par_valor, String par_status, Date par_datacompra, String par_obs) {
        this.par_codigo = par_codigo;
        this.par_datapgto = par_datapgto;
        this.par_parcela = par_parcela;
        this.par_tipo = par_tipo;
        this.par_desc = par_desc;
        this.par_valor = par_valor;
        this.par_status = par_status;
        this.par_datacompra = par_datacompra;
        this.par_obs = par_obs;
    }

    public Long getPar_codigo() {
        return par_codigo;
    }

    public void setPar_codigo(Long par_codigo) {
        this.par_codigo = par_codigo;
    }

    public Date getPar_datapgto() {
        return par_datapgto;
    }

    public void setPar_datapgto(Date par_datapgto) {
        this.par_datapgto = par_datapgto;
    }

    public int getPar_parcela() {
        return par_parcela;
    }

    public void setPar_parcela(int par_parcela) {
        this.par_parcela = par_parcela;
    }

    public String getPar_tipo() {
        return par_tipo;
    }

    public void setPar_tipo(String par_tipo) {
        this.par_tipo = par_tipo;
    }

    public float getPar_desc() {
        return par_desc;
    }

    public void setPar_desc(float par_desc) {
        this.par_desc = par_desc;
    }

    public float getPar_valor() {
        return par_valor;
    }

    public void setPar_valor(float par_valor) {
        this.par_valor = par_valor;
    }

    public String getPar_status() {
        return par_status;
    }

    public void setPar_status(String par_status) {
        this.par_status = par_status;
    }

    public Date getPar_datacompra() {
        return par_datacompra;
    }

    public void setPar_datacompra(Date par_datacompra) {
        this.par_datacompra = par_datacompra;
    }

    public String getPar_obs() {
        return par_obs;
    }

    public void setPar_obs(String par_obs) {
        this.par_obs = par_obs;
    }
   
   
}
