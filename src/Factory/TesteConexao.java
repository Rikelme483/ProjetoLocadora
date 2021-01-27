/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import DAO.DAO_Atores;
import DAO.DAO_DVD;
import DAO.DAO_Filmes;
import DAO.DAO_Usuario;
import Model.Atores;
import Model.DVD;
import Model.Filmes;
import Model.Usuario;
import java.sql.Connection;

/**
 *
 * @author Rikelme
 */
public class TesteConexao {
    public static void main(String[] args) {
        Connection minhaConexao = new ConexaoBanco().getConnectionFactory();
        
        //DAO.DAO_Filmes inserir = new DAO_Filmes();
        //Filmes add = new Filmes("A viagem perdida", "Suspense", "1");
        //inserir.adiciona(add);
        
        
        //DAO.DAO_Filmes atualiza = new DAO_Filmes();
        //Filmes alteraFilme = new Filmes("The Walking Dead", "Suspense/Terror", "2", "1");
        //atualiza.altera(alteraFilme);
        
        //DAO.DAO_Filmes deletar = new DAO_Filmes();
        //Filmes deletaFilme = new Filmes("1");
        //deletar.excluir(deletaFilme);
        
        //DAO.DAO_Filmes listar = new DAO_Filmes();
        //System.out.println(listar);
        
        //DAO.DAO_Usuario add = new DAO_Usuario();
        //Usuario usuario = new Usuario("Carlos", "47893652", "", "Rua dos Palmares", "87", "Boa Vista", "06854125", "carlos123");
        //add.adiciona(usuario);
        
        //DAO_Usuario alter = new DAO_Usuario();
        //Usuario atualizarUsuario = new Usuario("Romana Gonçalves", "47849070", "969427541", "Rua Araguaia", "49", "Novo Campo Limpo", "06826450", "2");
        //alter.altera(atualizarUsuario);
        
        //DAO.DAO_Usuario exc = new DAO_Usuario();
        //Usuario deletaUsuario = new Usuario("2");
        //exc.excluir(deletaUsuario);
        
        //DAO.DAO_Atores add = new DAO_Atores();
        //Atores insereAtor = new Atores("Morgan Freeman", "1950/05/10");
        //add.adiciona(insereAtor);
        
        //DAO.DAO_Atores alter = new DAO_Atores();
        //Atores alteraAtor = new Atores("Morgan Freeman", "1960/06/02", "3");
        //alter.altera(alteraAtor);
        
        //DAO.DAO_DVD add = new DAO_DVD();
        //DVD adicionaDVD = new DVD("2");
        //add.adiciona(adicionaDVD);
        
        //DAO.DAO_DVD alter = new DAO_DVD();
        //DVD alteraDVD = new DVD("2", "1");
        //alter.altera(alteraDVD);
        
        //DAO.DAO_Usuario usuario = new DAO_Usuario();
        //Usuario validaLogin = new Usuario("Carlos", "carlos123");
        //usuario.validaLogin(validaLogin);
        
        System.out.println("Conexão bem sucedida!"); //testar conexão com banco
        
    }
}

