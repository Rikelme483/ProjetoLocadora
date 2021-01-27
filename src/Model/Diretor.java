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
public class Diretor {
    
    private String codigo;
    private String nome_diretor;
    private String sexo;
    private String nacionalidade;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome_diretor() {
        return nome_diretor;
    }

    public void setNome_diretor(String nome_diretor) {
        this.nome_diretor = nome_diretor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Diretor(String nome_diretor, String sexo, String nacionalidade) {
        this.nome_diretor = nome_diretor;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade; // inserir
    }

    public Diretor(String nome_diretor, String sexo, String nacionalidade, String codigo) {
        this.codigo = codigo;
        this.nome_diretor = nome_diretor;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade; // alterar
    }

    public Diretor(String codigo) {
        this.codigo = codigo; // deletar
    }
    
    
    
}
