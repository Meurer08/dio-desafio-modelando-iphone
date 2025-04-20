package device.utils;

import java.util.Scanner;

import device.interfaces.ReprodutorMusical;

public class ReprodutorMusicalUtils {
  public static void options(ReprodutorMusical reprodutorMusical) {
    Scanner scanner = new Scanner(System.in);

    int comando = 0;
    do { 
        System.out.println("---------Mídia---------");
        System.out.println("Digite uma opção:");
        System.out.println("3 - Diminuir Volume");
        System.out.println("2 - Aumentar Volume");
        System.out.println("1 - Start/Stop");
        System.out.println("0 - Sair");

        comando = scanner.nextInt();
        scanner.nextLine();
        System.out.println("--------------------------");

        switch (comando) {
            case 0:
                break;
            case 1:
                reprodutorMusical.startStopReproducao();
                break;
            case 2:
                reprodutorMusical.aumentaVolume();
                break;
            case 3:
                reprodutorMusical.diminuirVolume();
                break;
            default:
                throw new AssertionError();
        }
    } while (comando != 0);
  } 
}
