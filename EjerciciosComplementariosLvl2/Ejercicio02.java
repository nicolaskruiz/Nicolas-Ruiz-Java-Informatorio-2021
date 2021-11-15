import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Agregar 5 numeros enteros: ");
        int agregarNum;
        ArrayList<Integer> listNumerosEnteros = new ArrayList<>();
        ArrayList<Integer> listElementosAlPrincipio = new ArrayList<>();
        for( int i = 1; i <= 5; i++){
            agregarNum = scan.nextInt();
            listNumerosEnteros.add(agregarNum);
            listElementosAlPrincipio.add(agregarNum);
        }

        int listTamaño = listNumerosEnteros.size();
        
        System.out.println("Agregar un numero al principio de la lista: ");
        int agregarP = scan.nextInt();
        listNumerosEnteros.add(0,agregarP);

        System.out.println("Agregar un numero entero al final de la lista: ");
        int agregarF = scan.nextInt();
        listNumerosEnteros.add(agregarF);
        scan.close();

        System.out.println("Elementos de la lista antes de agregar elementos: " + listElementosAlPrincipio);
        System.out.println("Elementos de la lista después de agregar elementos: " + listNumerosEnteros);
        System.out.println("Tamaño de la lista antes de agregar elementos: " + listTamaño);
        System.out.println("Tamaño de la lista después de agregar elementos: " + listNumerosEnteros.size());
    }   
}