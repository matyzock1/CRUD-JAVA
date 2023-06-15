import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("nombre ingresado = " + nombre);

        int resultado = Operaciones.sumar(20, 30);

        System.out.println("resultado = " + resultado);
    }
}