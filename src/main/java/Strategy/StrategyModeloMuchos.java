package Strategy;

import java.util.List;

public class StrategyModeloMuchos implements IStrategy{

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setPrecio(String modelo) {
        this.modelo = modelo;
    }

    public StrategyModeloMuchos(String modelo) {
        this.modelo =modelo;
    }

    @Override
    public void execute(List<Celular> celulares) {
        for (Celular celu:celulares) {
            if(celu.getModelo().equals(modelo)){
                celu.showInfo();
            }
        }
    }
}
