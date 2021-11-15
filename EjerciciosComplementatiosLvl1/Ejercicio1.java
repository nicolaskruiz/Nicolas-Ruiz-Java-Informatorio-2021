import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception{
        System.out.println("Ingrese su nombre: ");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();
        System.out.println("Hola " + usuario);
        scan.close();
    }
}