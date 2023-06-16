package Controller;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionSQLServer {
    Connection conectar = null;

    String usuario = "jeanSQL";
    String contrasenia = "123";
    String bd = "MarketEjemplo";
    String ip = "localhost";
    String puerto = "1433";

    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;

    public Connection establecerConexion(){
        try {
            String cadena = "jdbc:sqlserver://localhost:"+puerto+":"+"databaseName="+bd;
            conectar= DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Conexion exitosa a la base de datos");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar a la bdd, el error es: "+ e.toString());
        }
        return conectar;
    }
}
