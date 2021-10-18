import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // variable para concatenar
        String guion = " - ";

        // pedir valores
        System.out.println("Ingrese su nombre:");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su edad:");
        String edad = scan.nextLine();
        System.out.println("Ingrese su direccion:");
        String direccion = scan.nextLine();
        System.out.println("Ingrese su ciudad:");
        String ciudad = scan.nextLine();

        scan.close();


        // 

        System.out.println(nombre + guion + edad + guion + direccion + guion + ciudad );

    }
}
