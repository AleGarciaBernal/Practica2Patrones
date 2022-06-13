package Memento;

public class Memento {
    private Tesis t;

    public Memento(Tesis tesis){
        t=tesis;
    }

    public Tesis getState() {
        return t;
    }
}
