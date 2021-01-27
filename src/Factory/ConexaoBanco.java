
package Factory;
import java.sql.Connection; //lib para conectar com banco de dados
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rikelme
 */
public class ConexaoBanco {
    public Connection getConnectionFactory() {
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/locadora2", "root", "");
        } catch (SQLException error) {
            throw new RuntimeException("Ocorreu um erro! " + error);
        }
    }
}

