package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarProducto {
    public static void eliminarProducto(Scanner scanner, Connection connection){

        System.out.println("Ingrese ID a eliminar");
        int id = scanner.nextInt();

        try (connection){
            String consulta = "DELETE FROM Productos WHERE id = ?";
            PreparedStatement declaracion = connection.prepareStatement(consulta);
            declaracion.setInt(1, id);
            int filasAfectadas = declaracion.executeUpdate();

            if(filasAfectadas > 0){
                System.out.println("Producto borrado correctamente");
            }
            else{
                System.out.println("El id no corresponde.");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
