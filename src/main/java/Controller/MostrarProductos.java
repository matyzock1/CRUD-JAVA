package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class MostrarProductos {

    public static void mostrarProductos(Connection con){
        try {
            String consulta = "SELECT * FROM Productos";
            PreparedStatement declaracion = con.prepareStatement(consulta);
            ResultSet resultados = declaracion.executeQuery();
            while (resultados.next()) {
                // Leer los valores de cada columna
                int id = resultados.getInt("id");
                String nombre = resultados.getString("nombre");
                int cantidad = resultados.getInt("precio");
                // Agregar más columnas según la estructura de tu tabla

                // Imprimir los valores
                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("-----------------------------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
