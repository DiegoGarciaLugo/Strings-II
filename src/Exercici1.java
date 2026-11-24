import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introdueix un text: ");
    String cadena = scanner.nextLine();
    int longitud = cadena.length();
    System.out.println("La longitud de la cadena es: "+longitud);
    scanner.close();
}