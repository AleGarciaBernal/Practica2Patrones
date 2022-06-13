package ChainResponsability;

public class Cabo implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
         // logica cuando podemos solucionar el problema
         // cuando responsables de solucionar problem
         if (orden.equals("Limpiezas")){
             System.out.println("El cabo Limpia!");
         }else if(orden.equals("Manifestaciones")){
            System.out.println("El cabo va a la manifestacion!");

        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
