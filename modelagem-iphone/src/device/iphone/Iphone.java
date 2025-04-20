package device.iphone;

import device.interfaces.Browser;
import device.interfaces.Phone;
import device.interfaces.ReprodutorMusical;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iphone implements ReprodutorMusical, Browser, Phone {
    private boolean reproduzindoMusica = false;
    private boolean voltarMusica = false;
    private int volumeMusica = 5;
    private boolean emChamada = false;
    private List<String> listaChamada = new ArrayList<>();
    private static List<String> listaTelefonica = new ArrayList<>();

  /// Exemplo em lista telefonica
  //  public Iphone () {
  //  listaTelefonica.add("40028922");
  //}

    @Override
    public void startStopReproducao() {
        if (reproduzindoMusica == false && emChamada == true) {
          System.out.println("Não pode reproduzir estando em chamada");
        } else if (this.reproduzindoMusica == false) {
          this.reproduzindoMusica = true;
          System.out.println("Reproduzindo Música");
        } else {
          this.reproduzindoMusica = false;
          System.out.println("Música Pausada");
        }
    }

    @Override
    public void aumentaVolume() {
        this.volumeMusica += 1;
        System.out.println("Volume: "+ this.volumeMusica);
    }

    @Override
    public void diminuirVolume() {
      this.volumeMusica -= 1;
      System.out.println("Volume: "+ this.volumeMusica);
    }

    @Override
    public void iniciarChamada(String numero) {
        if (reproduzindoMusica == true) {
          reproduzindoMusica = false;
          voltarMusica = true;
        }
        this.emChamada = true;
        this.listaChamada.add(numero);
        System.out.println("Chamada Iniciada com " + numero);
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Numeros em chamada:");
        for (String numero: listaChamada) {
            int index = this.listaChamada.indexOf(numero);
            System.out.println(index + ": " + numero);
        }
        System.out.println("Digite o index do que deseja finalizar:");

        Scanner scanner = new Scanner(System.in);

        int indexRemove = scanner.nextInt();
        this.listaChamada.remove(indexRemove);
        System.out.println("Chamada Finalizada");
        if (listaChamada.isEmpty()) {
            this.emChamada = false;
            if (this.voltarMusica == true) {
              reproduzindoMusica = true;
            }

        }
    }

    @Override
    public List<String> getListaTelefonica() {
        return this.listaTelefonica;
    }

    @Override
    public String pesquisar (String textoPesquisa) {
        System.out.println("Pesquisando sobre: " + textoPesquisa);
        return "Resultado da Pesquisa";
    }
    
}
