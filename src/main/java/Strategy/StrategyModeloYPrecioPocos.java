package Strategy;

import java.util.List;

public class StrategyModeloYPrecioPocos implements IStrategy{

    private String modelo;
    private int precio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo, int precio) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public StrategyModeloYPrecioPocos(String modelo, int precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public void execute(List<Celular> celulares) {
        for (Celular celu:celulares) {
            if(celu.getModelo().equals(modelo)&&celu.getPrecio()==precio){
                celu.showInfo();
            }
        }
    }
}
