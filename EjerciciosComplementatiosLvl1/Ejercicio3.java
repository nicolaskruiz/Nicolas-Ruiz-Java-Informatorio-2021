import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = scan.nextInt();
        scan.close();
        List<Integer> resultado = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            resultado.add(i);
            System.out.println(resultado);
         }
         
    }
}
