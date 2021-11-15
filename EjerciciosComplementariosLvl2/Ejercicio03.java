// Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.

import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio03 {
    public static void main(String[] args) {
        ArrayList<Integer> barajaFrancesa = new ArrayList<>();
        // agregar los valores
        int cont = 0;
        for( int i = 1; i <= 13; i++){
            cont++;
            barajaFrancesa.add(cont);
        }
        System.out.println(barajaFrancesa);
        // imprimir en orden inverso
        

    }
}
