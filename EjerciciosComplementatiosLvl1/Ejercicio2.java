import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int nro1;
        int nro2;
        String mas = " + ";
        String menos = " - ";
        String multiplicado = " * ";
        String dividido = " / ";
        String modulado = " % ";
        String igual = " = ";

        System.out.println("Ingrese 2 numeros");
        nro1 = scan.nextInt();
        nro2 = scan.nextInt();
        // suma
        int suma = nro1 + nro2;
        System.out.println(nro1 + mas + nro2 + igual + suma);
        // resta
        int resta = nro1 - nro2;
        System.out.println(nro1 + menos + nro2 + igual + resta);
        // multiplicacion
        int multiplicacion = nro1 * nro2;
        System.out.println(nro1 + multiplicado + nro2 + igual + multiplicacion);
        // division
        int division = nro1 / nro2;
        System.out.println(nro1 + dividido + nro2 + igual + division);
        // modulo
        int modulo = nro1 % nro2;
        System.out.println(nro1 + modulado + nro2 + igual + modulo);        
        scan.close();
    }
}