package Mediator;

import java.util.List;

public abstract class Persona {

    protected IWhatsapp wpp;

    private int numero;
    private String nombre;


    public Persona(IWhatsapp canalComunicacion) {
        this.wpp = canalComunicacion;
    }

    public int getNumero() {
        return numero;
    }

    public Persona setNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public abstract void send(String msg, List<Integer> listaPersonas);

    public abstract void received(String msg);
}

