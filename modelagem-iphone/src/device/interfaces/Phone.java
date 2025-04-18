package device.interfaces;

import java.util.List;

public interface Phone {
    void iniciarChamada(String numero);

    void finalizarChamada();

    List<String> getListaTelefonica();

}
