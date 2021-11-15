import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Calcular el factorial de: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int resultado = 1;
        for (int i = 2; i <=num; i++){
            resultado *= i;
        }
        System.out.println("El factorial de " + num + " es: " + resultado);
    }
}
