package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnection {

    // Cambiar los datos de conexión según sea necesario
    String url = "jdbc:mysql://localhost:3306/ejemplo?user=root&password=ClaveTremenda123";
    Connection cn = null;

    public void connect(String sqlCommand, boolean returnGeneratedKeys) {
        PreparedStatement pst = null;
        try {
            // Abre la conexión
            cn = DriverManager.getConnection(url);

            // Prepara el PreparedStatement según el valor de returnGeneratedKeys
            if (returnGeneratedKeys) {
                pst = cn.prepareStatement(sqlCommand, Statement.RETURN_GENERATED_KEYS);
            } else {
                pst = cn.prepareStatement(sqlCommand);
            }

            // Aquí puedes agregar el código para ejecutar el comando SQL o manejar el PreparedStatement
            // Ejemplo:
            if (sqlCommand.trim().toLowerCase().startsWith("select")) {
                ResultSet rs = pst.executeQuery();
                // Procesa el ResultSet si es necesario
            } else {
                int affectedRows = pst.executeUpdate();
                if (returnGeneratedKeys) {
                    ResultSet generatedKeys = pst.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        long id = generatedKeys.getLong(1);
                        System.out.println("ID generado: " + id);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error en la ejecución del comando SQL", e);
        } finally {
            // Cierra el PreparedStatement y la conexión para liberar recursos
            try {
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
