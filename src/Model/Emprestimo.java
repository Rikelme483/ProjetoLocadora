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
public class Emprestimo {
    
    private String fk_id_dvd;
    private String fk_id_usuario;
    private String codigo;

    public String getFk_id_dvd() {
        return fk_id_dvd;
    }

    public void setFk_id_dvd(String fk_id_dvd) {
        this.fk_id_dvd = fk_id_dvd;
    }

    public String getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(String fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Emprestimo(String fk_id_dvd, String fk_id_usuario, String codigo) {
        this.fk_id_dvd = fk_id_dvd;
        this.fk_id_usuario = fk_id_usuario;
        this.codigo = codigo;
    }

    public Emprestimo(String fk_id_dvd, String fk_id_usuario) {
        this.fk_id_dvd = fk_id_dvd;
        this.fk_id_usuario = fk_id_usuario;
    }
    
    public Emprestimo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
