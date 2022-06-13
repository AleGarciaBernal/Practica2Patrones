package Strategy;

import java.util.List;

public class StrategyPrecioPocos implements IStrategy{

    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public StrategyPrecioPocos(int precio) {
        this.precio = precio;
    }

    @Override
    public void execute(List<Celular> celulares) {
        for (Celular celu:celulares) {
            if(precio== celu.getPrecio()){
                celu.showInfo();
            }
        }
        }
}
