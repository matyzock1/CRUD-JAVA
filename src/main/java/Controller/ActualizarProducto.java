package Controller;

import java.sql.*;
import java.util.Scanner;

public class ActualizarProducto {
    public static void actualizarProducto(Scanner scanner, Connection con){
        scanner = new Scanner(System.in);

        System.out.println("Ingrese el ID del producto a actualizar:");
        int idProducto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nuevo nombre del producto: ");
        String nom = scanner.nextLine();
        System.out.println("Ingrese el nuevo precio del producto: ");
        int precio = scanner.nextInt();
        scanner.nextLine();
        try{
            String consulta = "UPDATE Productos SET nombre = ?, precio = ? WHERE id = ?";
            PreparedStatement declaracion = con.prepareStatement(consulta);
            declaracion.setString(1, nom);
            declaracion.setInt(2, precio);
            declaracion.setInt(3, idProducto);
            declaracion.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}