package Src.Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConection {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DATABASE = "db_secure_wave";
    private static final String USER = "root";  
    private static final String PASSWORD = "";         
    

    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    private Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión establecida con éxito a la base de datos '" + DATABASE + "'!");
            
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el controlador (driver) JDBC de MySQL: " + e.getMessage());
            System.err.println("Asegúrate de agregar la dependencia o el archivo jar de mysql-connector-java al proyecto.");
        } catch (SQLException e) {
            System.err.println("Error al intentar conectar con la base de datos: " + e.getMessage());
        }
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión con la base de datos cerrada correctamente.");
            } catch (SQLException e) {
                System.err.println("Error al intentar cerrar la conexión: " + e.getMessage());
            }
        }
    }
}