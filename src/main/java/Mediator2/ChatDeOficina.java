package Mediator2;

import java.util.ArrayList;
import java.util.List;

public class ChatDeOficina implements Mediator {

    List<User> personasOficinasChat = new ArrayList<>();

    public ChatDeOficina addUsuarios(User usuario) {
        personasOficinasChat.add(usuario);
        return this;
    }

    @Override
    public void send(String msg, Persona persona, String destino) {
        User emisor = (User) persona;
        if (destino.equals("Todos")) {
            for (User usuario : personasOficinasChat) {
                if (emisor.getCi() != usuario.getCi()) {
                    usuario.received(msg);
                }
            }
        } else {
            for (User usuario : personasOficinasChat) {
                if (destino.equals(usuario.getNombre())) {
                    usuario.received(msg);
                }
            }
        }
    }
}
