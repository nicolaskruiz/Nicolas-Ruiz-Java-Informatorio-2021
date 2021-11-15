import java.util.Scanner;

// Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
public class Ejercicio5 {
    public static void main(String[] args) {
        // variables para que el resultado se vea como en el ejemplo
        String simbolMultip = " x ";
        String simbolIgual = " = ";
        // solicitar numeros
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros para multiplicar:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int resultado;
        for(int i = 1; i == num2; i++){
            resultado = num1 + num1;
        }
        System.out.println(num1 + simbolMultip + num2 + simbolIgual + resultado);
    }
}
