/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Pichau
 */
public class Usuario {
    private String codigo;
    private String nome;
    private String telefone;
    private String sexo;
    private String dt_nascimento;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public Usuario(String nome, String sexo, String telefone, String dt_nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dt_nascimento = dt_nascimento;
    }

    public Usuario(String nome, String sexo, String telefone, String dt_nascimento, String codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dt_nascimento = dt_nascimento;
    }

    public Usuario(String codigo) {
        this.codigo = codigo;
    }
            
    
    
    
    
    
    
    
}
