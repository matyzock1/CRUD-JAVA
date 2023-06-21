package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AgregarProducto {
    public static void addProducto(Scanner scanner, Connection connection){

        System.out.println("Ingrese nombre nuevo producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del nuevo producto: ");
        int precio = scanner.nextInt();

        String consulta = "INSERT INTO Productos (nombre, precio) VALUES (?, ?)";

        try {
            PreparedStatement declaracion = connection.prepareStatement(consulta);
            declaracion.setString(1, nombre);
            declaracion.setInt(2, precio);
            declaracion.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}