import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main (String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:POO.db");
            Statement stat = conn.createStatement();

            String sqlUpdate = "update PESSOAS set CPF = '08244455597' where NOME = 'JULIA MIOTTO';)";
            String sqlInsert = "insert into PESSOAS(NOME, CPF, IDADE, ESTADO) values('CLARICE LISPECTOR','09959544877','47','PR')";
            String sqlDelete = "delete from PESSOAS where CPF = '09941536877'";

            stat.execute(sqlUpdate);
            stat.execute(sqlInsert);
            stat.execute(sqlDelete);

            stat.close();
            conn.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
