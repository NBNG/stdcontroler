package Modelo;

public class Funcionario {

    private Long   fun_codigo;
    private String fun_nome;
    private String fun_rg;
    private String fun_cpf;
    private String fun_telefone;
    private String fun_numero_residencia;
    private String fun_cargo;
    private String fun_senha;
    private String fun_login;

    public Funcionario(){
        
    }
    
    public Funcionario(Long fun_codigo, String fun_nome, String fun_rg,
            String fun_cpf, String fun_telefone, String fun_numero_residencia, String fun_cargo, String fun_senha, String fun_login) {
        this.fun_codigo = fun_codigo;
        this.fun_nome = fun_nome;
        this.fun_rg = fun_rg;
        this.fun_cpf = fun_cpf;
        this.fun_telefone = fun_telefone;
        this.fun_numero_residencia = fun_numero_residencia;
        this.fun_cargo = fun_cargo;
        this.fun_senha = fun_senha;
        this.fun_login = fun_login;
    }

    public Long getFun_codigo() {
        return fun_codigo;
    }

    public void setFun_codigo(Long fun_codigo) {
        this.fun_codigo = fun_codigo;
    }

    public String getFun_nome() {
        return fun_nome;
    }

    public void setFun_nome(String fun_nome) {
        this.fun_nome = fun_nome;
    }

    public String getFun_rg() {
        return fun_rg;
    }

    public void setFun_rg(String fun_rg) {
        this.fun_rg = fun_rg;
    }

    public String getFun_cpf() {
        return fun_cpf;
    }

    public void setFun_cpf(String fun_cpf) {
        this.fun_cpf = fun_cpf;
    }

    public String getFun_telefone() {
        return fun_telefone;
    }

    public void setFun_telefone(String fun_telefone) {
        this.fun_telefone = fun_telefone;
    }

    public String getFun_numero_residencia() {
        return fun_numero_residencia;
    }

    public void setFun_numero_residencia(String fun_numero_residencia) {
        this.fun_numero_residencia = fun_numero_residencia;
    }

    public String getFun_cargo() {
        return fun_cargo;
    }

    public void setFun_cargo(String fun_cargo) {
        this.fun_cargo = fun_cargo;
    }

    public String getFun_senha() {
        return fun_senha;
    }

    public void setFun_senha(String fun_senha) {
        this.fun_senha = fun_senha;
    }

    public String getFun_login() {
        return fun_login;
    }

    public void setFun_login(String fun_login) {
        this.fun_login = fun_login;
    }
    
    
}
