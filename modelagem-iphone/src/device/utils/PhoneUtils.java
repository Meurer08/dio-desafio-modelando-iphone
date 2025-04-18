package device.utils;

import device.interfaces.Phone;
import java.util.Scanner;

public class PhoneUtils {
    public void options(Phone phone) {
        Scanner scanner = new Scanner(System.in);

        int comando = 0;
        System.out.println("---------Telefone---------");
        
		System.out.println("Digite uma opção:");
		System.out.println("2 - Finalizar Chamada");
        System.out.println("1 - Fazer Ligação");
		System.out.println("0 - Sair");
        do { 
            switch (comando) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite o número: ");
                    String numero = scanner.next();
                    phone.iniciarChamada(numero);
                    break;
                case 2:
                    System.out.println("Finalizar chamada: ");
                    phone.finalizarChamada();
                    break;
                case 3:

                default:
                    throw new AssertionError();
            }
        } while (comando != 0);
    }
}
