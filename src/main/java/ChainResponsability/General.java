package ChainResponsability;

public class General implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
         // logica cuando podemos solucionar el problema
         // cuando responsables de solucionar problem
         if (orden.equals("Entrevistas")){
             System.out.println("El general esta realizando una entrevista");
         } else {
             next.criteriaHandler(orden);
         }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
