package device.utils;

import device.interfaces.Phone;
import device.iphone.Iphone;

import java.util.List;
import java.util.Scanner;

public class PhoneUtils {
    public static void options(Phone phone) {
        Scanner scanner = new Scanner(System.in);

        int comando = 0;
        do { 
            System.out.println("---------Telefone---------");
            System.out.println("Digite uma opção:");
            System.out.println("3 - Lista Telefônica");
            System.out.println("2 - Finalizar Chamada");
            System.out.println("1 - Fazer Ligação");
            System.out.println("0 - Sair");

            comando = scanner.nextInt();
            scanner.nextLine();
            System.out.println("--------------------------");

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
                    Iphone iphone = (Iphone) phone;
                    List<String> listaTelefonica = iphone.getListaTelefonica();
                    for (String numeroLista: listaTelefonica) {
                      System.out.println(numeroLista);
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (comando != 0);
    }
}
