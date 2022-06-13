package Memento;

public class Originator {
    private Tesis version;

    public void setMemento(Tesis version){
        System.out.println("Originator> set state "+version.getNroVersion());
        this.version =version;
    }

    public Memento createMemento(){
        return new Memento(version);
    }

    public Tesis restoreMemento(Memento m){
        this.version = m.getState();
        return this.version;
    }

}
