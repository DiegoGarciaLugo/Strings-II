import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introdueix una paraula: ");
    String cadena = scanner.nextLine();

    if (cadena.length() >= 3) {
        if (cadena.endsWith("ing")) {
            cadena = cadena + "ly";
        } else {
            cadena = cadena + "ing";
        }
    }

    System.out.println("Resultat: " + cadena);
    scanner.close();
}