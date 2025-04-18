package device.iphone;

import device.interfaces.Browser;
import device.interfaces.Phone;
import device.interfaces.ReprodutorMusical;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iphone implements ReprodutorMusical, Browser, Phone {
    private boolean reproduzindoMusica = false;
    private int volumeMusica = 5;
    private boolean emChamada = false;
    private List<String> listaChamada = new ArrayList<>();
    private List<String> listaTelefonica = new ArrayList<>();


    @Override
    public void startReproducao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startReproducao'");
    }

    @Override
    public void aumentaVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aumentaVolume'");
    }

    @Override
    public void diminuirVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'diminuirVolume'");
    }

    @SuppressWarnings("unchecked")
    @Override
    public void iniciarChamada(String numero) {
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
