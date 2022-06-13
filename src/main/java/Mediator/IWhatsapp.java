package Mediator;

import java.util.List;

public interface IWhatsapp {

    void send(String msg, Persona persona, List<Integer> personas);

}
