import device.interfaces.ReprodutorMusical;
import device.iphone.Iphone;
import device.utils.BrowserUtils;
import device.utils.PhoneUtils;
import device.utils.ReprodutorMusicalUtils;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    	int comando; 
    	 
    	do {
    		System.out.println("-----------MENU-----------");
    		System.out.println("Digite uma opção:");
    		System.out.println("3 - Reprodutor de Mídia");
    		System.out.println("2 - Opções de Telefone");
    		System.out.println("1 - Navegador de Internet");
    		System.out.println("0 - Sair");
    		System.out.println("--------------------------");
    		comando = scanner.nextInt();
        scanner.nextLine();
        System.out.println("--------------------------");
			
      switch (comando) {
				case 0:
					break;
				case 1:
					BrowserUtils.options(iphone);
					break;
				case 2:
					PhoneUtils.options(iphone);
					scanner.nextLine();
					break;
				case 3:
					ReprodutorMusicalUtils.options(iphone);
					scanner.nextLine();
					break;
				default:
					System.out.println("Comando Inválido");
					comando = -1;
			}
			System.out.println("Tecle Enter para continuar...");
    		scanner.nextLine();

    	} while (comando != 0);

    }
}
