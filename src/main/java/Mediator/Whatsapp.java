package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements IWhatsapp {

    List<User> usersUsandoWpp = new ArrayList<>();

    public Whatsapp addUsuarios(User user) {
        usersUsandoWpp.add(user);
        return this;
    }

    @Override
    public void send(String msg, Persona persona, List<Integer> listaPersonas) {
        User emisor = (User) persona;
        for (Integer numeroP : listaPersonas) {
            for (User usuario : usersUsandoWpp) {
                if (numeroP != emisor.getNumero()) {
                    if (numeroP == usuario.getNumero()) {
                        usuario.received(msg);
                    }
                }
            }
        }
    }
}

