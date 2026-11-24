import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantes paraules vols introduir? ");
    int quantitat = scanner.nextInt();
    scanner.nextLine();

    String mesllarga = "";

    for (int i = 1; i <= quantitat; i++) {
        System.out.print("Paraula " + i + ": ");
        String paraula = scanner.nextLine();

        if (paraula.length() > mesllarga.length()) {
            mesllarga = paraula;
        }
    }
    System.out.println("La paraula més llarga és: " + mesllarga);
    System.out.println("Longitud: " + mesllarga.length());
    scanner.close();
}