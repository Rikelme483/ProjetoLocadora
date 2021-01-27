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
public class Filmes {
    private String codigo;
    private String nome_filme;
    private String ano_lancamento;
    private String duracao;
    private String classificacao;
    private String cod_diretor;
    private String cod_genero;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome_filme() {
        return nome_filme;
    }

    public void setNome_filme(String nome_filme) {
        this.nome_filme = nome_filme;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getCod_diretor() {
        return cod_diretor;
    }

    public void setCod_diretor(String cod_diretor) {
        this.cod_diretor = cod_diretor;
    }

    public String getCod_genero() {
        return cod_genero;
    }

    public void setCod_genero(String cod_genero) {
        this.cod_genero = cod_genero;
    }

    public Filmes(String nome_filme, String ano_lancamento, String duracao, String classificacao, String cod_diretor, String cod_genero) {
        this.nome_filme = nome_filme;
        this.ano_lancamento = ano_lancamento;
        this.duracao = duracao;
        this.classificacao = classificacao; // para inserir
        this.cod_diretor = cod_diretor;
        this.cod_genero = cod_genero;
    }

    public Filmes(String nome_filme, String ano_lancamento, String duracao, String classificacao, String cod_diretor, String cod_genero, String codigo) {
        this.codigo = codigo;
        this.nome_filme = nome_filme;
        this.ano_lancamento = ano_lancamento;
        this.duracao = duracao;
        this.classificacao = classificacao; // para alterar
        this.cod_diretor = cod_diretor;
        this.cod_genero = cod_genero;
    }

    public Filmes(String codigo) {
        this.codigo = codigo; // para excluir
    }
    
    
    
    
    
    
}
