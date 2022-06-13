package ChainResponsability;

public class Teniente implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
         // logica cuando podemos solucionar el problema
         // cuando responsables de solucionar problem
         if (orden.equals("Disciplina")){
             System.out.println("El teniente disciplina");
         } else {
             next.criteriaHandler(orden);
         }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
