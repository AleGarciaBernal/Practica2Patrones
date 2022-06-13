package Mediator;

import java.util.List;

public class User extends Persona{

    public User(IWhatsapp canalComunicacion) {
        super(canalComunicacion);
    }

    @Override
    public void send(String msg, List<Integer>listaPersonas) {
        wpp.send(msg, this, listaPersonas);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: " + getNombre() + " Y de numero " + getNumero());
        System.out.println("Mensaje Recibido: " + msg);

    }
}