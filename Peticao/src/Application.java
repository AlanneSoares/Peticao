import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        String nomeProc;
        String numGuia;

        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Nome do procurador: ");
            nomeProc = s.next();

            if (s.next().length() < 5) {
                System.out.println("mínimo 5 letras");

                System.out.println("Procurador: " + nomeProc);
            }
        } while (false);
    }
}