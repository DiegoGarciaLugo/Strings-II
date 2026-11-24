import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introdueix una cadena: ");
    String cadena = scanner.nextLine();

    String resultat = "";
    if (cadena.length() >= 2) {
        String primers = cadena.substring(0, 2);
        String darrers = cadena.substring(cadena.length() - 2);
        resultat = primers + darrers;
    }

    System.out.println("Resultat: '" + resultat + "'");
    scanner.close();
}