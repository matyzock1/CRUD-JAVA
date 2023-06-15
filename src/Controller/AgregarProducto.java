package Controller;

import java.util.Scanner;

public class AgregarProducto {
    private static void addProducto(Scanner scanner){
        System.out.println("Ingrese nombre nuevo producto: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del nuevo producto: ");
        double precio = scanner.nextDouble();
    }

}
