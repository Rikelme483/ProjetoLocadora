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
public class AtorFilme {
    
    private String codigo;
    private String fk_id_ator;
    private String fk_id_filme;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFk_id_ator() {
        return fk_id_ator;
    }

    public void setFk_id_ator(String fk_id_ator) {
        this.fk_id_ator = fk_id_ator;
    }

    public String getFk_id_filme() {
        return fk_id_filme;
    }

    public void setFk_id_filme(String fk_id_filme) {
        this.fk_id_filme = fk_id_filme;
    }

    public AtorFilme(String fk_id_ator, String fk_id_filme) {
        this.fk_id_ator = fk_id_ator;
        this.fk_id_filme = fk_id_filme;
    }

    public AtorFilme(String fk_id_ator, String fk_id_filme, String codigo) {
        this.codigo = codigo;
        this.fk_id_ator = fk_id_ator;
        this.fk_id_filme = fk_id_filme;
    }

    public AtorFilme(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
