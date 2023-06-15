package Controller;

import Model.Producto;

import java.util.Scanner;

import static View.Main.productos;

public class MostrarProductos {
    public static void mostrarProductos(){
        for (Producto producto : productos){
            System.out.println("Nombre del producto: "+producto.getNombre() +" Precio: "+ producto.getPrecio());
        }
    }
}
