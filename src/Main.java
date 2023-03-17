import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //PREPARRAMOS PARA LEER LA CLASE SCANNER
        Scanner teclado = new Scanner(System.in);
        //EL USUARIO INGRESA SU NOMBRE
        System.out.println("Ingrese su nombre :");
        String nombre = teclado.nextLine();
        //HOLA MUNDO PERZONALIZADO
        System.out.println("Hola mundo " + nombre);
        //CERRAMOS LA CLASE SCANNER
        //Scanner.close();
    }
}
