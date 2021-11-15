import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio01 {
    public static void main(String[] args){
        List<String> listaCiudadesFav = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Agregar ciudades favoritas de Argentina: ");
        int numRanking = 0;
        for(int i = 1; i <= 3; i++){
            String ciudadesFav = scan.nextLine();
            numRanking++;
            listaCiudadesFav.add("#" + numRanking + " " + ciudadesFav);
        }
        scan.close();
        System.out.println(listaCiudadesFav);
    }
}
