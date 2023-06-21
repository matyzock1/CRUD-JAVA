package Controller;

import Model.Producto;

import java.sql.Statement;
import java.util.Scanner;

import static View.Main.productos;

public class ActualizarProducto {
    public static void actualizarProducto(Scanner scanner){
        System.out.println("Ingrese ID a actualizar");
        //comprobar que lo ingresado sea un int
        int id = scanner.nextInt();
        boolean existe = false;

        for(int i = 0; i <= productos.size()-1; i++){

            int productoIdObtenido = productos.get(i).getId();
            if(productoIdObtenido == id){
                existe = true;
            }

        }
        if(existe){
            System.out.println("El nombre actual es = " + productos.get(id-1).getNombre());
            System.out.println("Ingrese nuevo nombre");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            productos.get(id-1).setNombre(nombre);
            System.out.println("El nombre cambio a = " + productos.get(id-1).getNombre());
            System.out.println("El precio actual es = " + productos.get(id-1).getPrecio());
            System.out.println("Ingrese nuevo precio");

            double precio = scanner.nextDouble();
            productos.get(id-1).setPrecio(precio);
            System.out.println("El precio cambio a = " + productos.get(id-1).getPrecio());




        }else{
            System.out.println("Producto no encontrado");
            //falta habilitar posibilidad de volver a ingresar el id
        }

    }
}
