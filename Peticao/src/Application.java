/*

    Petição de dados

 */

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        String nomeProc;
        int numGuia;

        Scanner s = new Scanner(System.in);
        System.out.print("Nome do procurador: ");
        nomeProc = s.next();

        System.out.print("Nª da guia: ");
        numGuia = s.nextInt();

        System.out.println("\n-----------------------");
        System.out.println("       Resultado       ");
        System.out.println("-----------------------");
        System.out.println("Procurador: " + nomeProc + "\nNº guia: " + numGuia);

    }
}
