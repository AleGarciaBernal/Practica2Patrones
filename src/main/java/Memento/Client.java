package Memento;

public class Client {
    public static void main(String[] ardssd) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        Tesis tes;

        tes= new Tesis("enero", 1);
        //ENERO
        originator.setMemento(tes);
        caretaker.addMemento(tes.getNroVersion(), originator.createMemento());


        //FEBRERO
        tes=new Tesis("febrero",2);

        originator.setMemento(tes);
        caretaker.addMemento(tes.getNroVersion(), originator.createMemento());

        //MARZO
        tes= new Tesis("marzo",3);

        originator.setMemento(tes);
        caretaker.addMemento(tes.getNroVersion(), originator.createMemento());

        //ABRIL
        tes= new Tesis("abril", 4);
        originator.setMemento(tes);
        caretaker.addMemento(tes.getNroVersion(), originator.createMemento());

        //MAYO
        tes= new Tesis("mayo", 5);
        originator.setMemento(tes);
        caretaker.addMemento(tes.getNroVersion(), originator.createMemento());

        tes= originator.restoreMemento(caretaker.getMemento(3));
        tes.showInfo();

    }
}
