package ChainResponsability;

public class ManagerHandler implements IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        General resp1= new General();
        this.setNext(resp1);

        Teniente resp2 = new Teniente();
        resp1.setNext(resp2);

        Coronel resp3 = new Coronel();
        resp2.setNext(resp3);

        Cabo respFinal = new Cabo();
        resp3.setNext(respFinal);

        this.next.criteriaHandler(orden);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
