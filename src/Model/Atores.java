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
public class Atores {
    private String nome_ator;
    private String sexo;
    private String data_nascimento;
    private String codigo;

    public String getNome_ator() {
        return nome_ator;
    }

    public void setNome_ator(String nome_ator) {
        this.nome_ator = nome_ator;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Atores(String nome_ator, String sexo, String data_nascimento) {
        this.nome_ator = nome_ator;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento; // inserir
    }

    public Atores(String nome_ator, String sexo, String data_nascimento, String codigo) {
        this.nome_ator = nome_ator;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.codigo = codigo; // alterar
    }

    public Atores(String codigo) {
        this.codigo = codigo; // deletar
    }

    
    
    


    
    
    
    
}
