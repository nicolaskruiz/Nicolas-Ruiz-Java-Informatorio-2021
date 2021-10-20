import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Agregar ciudades favoritas: ");
        String ciudadesFav = scan.nextLine();
        scan.close();


        List<String> listaCiudadesFav = new ArrayList<>();
        for(String ciudad : listaCiudadesFav){
            listaCiudadesFav.add(ciudadesFav);
            System.out.println(ciudad);
        }
        
    }
}
