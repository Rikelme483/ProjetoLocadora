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
public class Genero {
    
    private String codigo;
    private String nome_genero;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome_genero() {
        return nome_genero;
    }

    public void setNome_genero(String nome_genero) {
        this.nome_genero = nome_genero;
    }

    public Genero(String nome_genero, String codigo) {
        this.codigo = codigo;
        this.nome_genero = nome_genero; // altera
    }

    public Genero(String nome_genero) {
        this.nome_genero = nome_genero; // inserir
    }
}
