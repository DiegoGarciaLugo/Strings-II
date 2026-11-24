import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introdueix una cadena: ");
    String cadena = scanner.nextLine();

    String comptats = "";
    String resultat = "{";

    for (int i = 0; i < cadena.length(); i++) {
        char actual = cadena.charAt(i);
        String lletrastr = String.valueOf(actual);

        if (!comptats.contains(lletrastr)) {
            int vegades = 0;

            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(j) == actual) {
                    vegades++;
                }
            }

            comptats += actual;
            if (resultat.length() > 1) {
                resultat += ", ";
            }
            resultat += "'" + actual + "': " + vegades;
        }
    }
    resultat += "}";
    System.out.println(resultat);
    scanner.close();
}