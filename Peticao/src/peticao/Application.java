/*
 Sistema de Petição
    - campos devem ser obritório;
    - campo Procurador(a) com no mínimo 5 caracteres;
    - campo Nº Guia com no máximo 10 dígitos

*/

/**
 *
 * @author Alanne Soares
 */

package peticao;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        String nomeProc;
        int numGuia = 0;

        Integer guia = new Integer(numGuia);
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Procurador(a): ");
            nomeProc = scanner.nextLine();

            // verifica se o campo está vazio
            while (nomeProc.equals("")) {
                System.out.println("\nCampo obrigatório!\n");
                System.out.print("Procurador(a): ");
                nomeProc = scanner.nextLine();
            }

            // verifica se os dados digitados são menores que 5 caracteres
            while (nomeProc.length() < 5) {
                System.out.println("\nInválido! Mínimo 5 caracteres.\n");
                System.out.print("Procurador(a): ");
                nomeProc = scanner.nextLine();
            }

            System.out.print("Nº da guia: ");
            guia = scanner.nextInt();

            // verifica se o campo está vazio
            while (guia.equals("")) {
                System.out.println("\nCampo obrigatório!\n");
                System.out.print("Nº da guia: ");
                guia = scanner.nextInt();
            }

            // verifica se os dados digitados são menores que 10 dígitos
            while (guia.toString().length() < 10) {
                System.out.print("\nValor digitado menor que o permitido. Máximo 10 dígitos\n");
                System.out.print("\nNº da guia: ");
                guia = scanner.nextInt();
            }

            // verifica se todos os campos estão de acordo
            while (!(nomeProc.length() < 5 || nomeProc.equals("")) || guia.toString().length() < 10 || guia.equals("")) {
                System.out.println("\n-------------------------------------------------");
                System.out.println("                 Resultado                   ");
                System.out.println("-------------------------------------------------");
                System.out.println("\nProcurador(a): " + nomeProc + "\nNº guia: " + guia);
                break;
            }

        } catch (Exception e) {
            System.out.println("\nErro!");
        }
    }
}