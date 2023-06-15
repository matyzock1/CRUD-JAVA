package Controller;

import Model.Producto;

import java.util.Scanner;

import static View.Main.productos;

public class AgregarProducto {
    public static void addProducto(Scanner scanner, int Id){

        System.out.println("Ingrese nombre nuevo producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del nuevo producto: ");
        double precio = scanner.nextDouble();

        Producto producto = new Producto(Id, nombre, precio);

        productos.add(producto);
    }

}
