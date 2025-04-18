package device.utils;

import device.interfaces.Browser;
import java.util.Scanner;


public class BrowserUtils {
    public static void options(Browser browser) {
        Scanner scanner = new Scanner(System.in);

        int comando = 0;

        do { 
            System.out.println("---------Navegador---------");
            System.out.println("Digite uma opção:");
            System.out.println("1 - Fazer uma Pesquisa");
            System.out.println("0 - Sair");
            comando = scanner.nextInt();
            scanner.nextLine();
            switch (comando) {
                case 0: 
                    break;
                case 1:
                    System.out.println("Digite o que deseja pesquisar e tecle Enter");
                    String pesquisa = scanner.nextLine();
                    browser.pesquisar(pesquisa);
                    break;
                default:
                    System.out.println("Comando Inválido");
                    comando = -1;
            }
        } while (comando != 0);
    }
}
