package Controller;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionSQLServer {
    static Connection conectar = null;

    String usuario = "jeanSQL";
    String contrasenia = "123";
    String bd = "MarketEjemplo";
    String ip = "localhost";
    String puerto = "1433";

    String cadena2 = "jdbc:sqlserver://localhost:1433;databaseName=MarketEjemplo";

    public Connection establecerConexion(){
        try {
            String cadena2 = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+bd+";encrypt=false;integratedSecurity=false";
            conectar= DriverManager.getConnection(cadena2,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Conexion exitosa a la base de datos");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar a la bdd, el error es: "+ e.toString());
        }
        return conectar;
    }
}
