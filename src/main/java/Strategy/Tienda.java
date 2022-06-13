package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private IStrategy strategy;
    private List<Celular> inventario= new ArrayList<>();
    private String nombre;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Celular> getInventario() {
        return inventario;
    }

    public void setInventario(List<Celular> inventario) {
        this.inventario = inventario;
    }

    public void addCel(Celular celular){
        inventario.add(celular);
    }
    public void execute(){
        strategy.execute(inventario);
    }


}
