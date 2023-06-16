package View;

import Model.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static Controller.ActualizarProducto.actualizarProducto;
import static Controller.AgregarProducto.addProducto;
import static Controller.EliminarProducto.eliminarProducto;
import static Controller.MostrarProductos.mostrarProductos;

public class Main {
    public static final List<Producto> productos = new ArrayList<Model.Producto>();
    private static int Id = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        boolean opciones = true;

        while(opciones) {
            System.out.println("--------CRUD----------");
            System.out.println("Opción 1: Agregar Producto\n");
            System.out.println("Opción 2: Actualizar Producto\n");
            System.out.println("Opción 3: Eliminar Producto\n");
            System.out.println("Opción 4: Mostrar Producto\n");


            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                addProducto(scanner, Id);
                Id++;
                System.out.println("Desea volver al menú de opciones?(Y/N): ");
                scanner.nextLine();
                String continuar = scanner.nextLine();

                if (!continuar.equals("y")){
                    opciones = false;
                }

            } else if (opcion == 2) {
                actualizarProducto(scanner);
                System.out.println("Desea volver al menú de opciones?(Y/N): ");
                scanner.nextLine();
                String continuar = scanner.nextLine();

                if (!continuar.equals("y")){
                    opciones = false;
                }

            } else if (opcion == 3) {
                eliminarProducto(scanner);
                System.out.println("Desea volver al menú de opciones?(Y/N): ");
                scanner.nextLine();
                String continuar = scanner.nextLine();
                if (!continuar.equals("y")){
                    opciones = false;
                }
            } else if (opcion == 4) {

                mostrarProductos();
                System.out.println("Desea volver al menú de opciones?(Y/N): ");
                scanner.nextLine();
                String continuar = scanner.nextLine();
                if (!continuar.equals("y")){
                    opciones = false;
                }
            }
        }

    }
}
