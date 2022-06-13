package Strategy;

import java.util.List;

public class StrategyModeloPocos implements IStrategy{

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setPrecio(String modelo) {
        this.modelo = modelo;
    }

    public StrategyModeloPocos(String modelo) {
        this.modelo =modelo;
    }

    @Override
    public void execute(List<Celular> celulares) {
        for (Celular celu:celulares) {
            if(modelo.equals(celu.getModelo())){
                celu.showInfo();
            }
        }
    }
}
