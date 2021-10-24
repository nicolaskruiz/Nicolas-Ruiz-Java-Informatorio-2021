import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = scan.nextInt();
        System.out.println("Ingrese un numero:");
        int num2 = scan.nextInt();
        scan.close();
        int potencia = 1;
        for(int i = 1; i <= num2; i++){
            potencia = potencia * num;
        }
        System.out.println(num+" elevado a "+num2+" = "+potencia);
    }
}
