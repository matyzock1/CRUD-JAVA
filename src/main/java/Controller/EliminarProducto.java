package Controller;

import Model.Producto;

import java.util.Scanner;

import static View.Main.productos;

public class EliminarProducto {
    public static void eliminarProducto(Scanner scanner){

        System.out.println("Ingrese ID a eliminar");
        int id = scanner.nextInt();
        boolean existe = false;

        for (Producto producto : productos){
            if (producto.getId() == id){
                String productoBorrado = producto.getNombre();
                productos.remove(producto);
                System.out.println("El producto "+ productoBorrado + " fue borrado con éxito.");
                existe = true;
                break;
            }
        }
        if(existe){
            System.out.println("Producto eliminado correctamente.");
        }
        else{
            System.out.println("Producto no encontrado");
            //falta habilitar posibilidad de volver a ingresar el id
        }
    }
}
