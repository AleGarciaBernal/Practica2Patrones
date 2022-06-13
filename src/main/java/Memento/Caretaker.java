package Memento;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

    private Map<Integer, Memento> mapaVersiones =new HashMap<Integer, Memento>();


    public void addMemento(Integer key,Memento m){
        mapaVersiones.put(key,m);
    }

    // forma de obtener objetos de nuestro almacenador de datos ---> LIST
    public Memento getMemento(Integer key){
        return mapaVersiones.get(key);
    }
}
