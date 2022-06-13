package SingletonChangeResp;

public class Manager implements IAtencion{

    private IAtencion next;


    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int monto) {
        CajeroBanco resp1 = new CajeroBanco();
        this.setNext(resp1);

        CreditManager resp2 = new CreditManager();
        resp1.setNext(resp2);

        Supervisor resp3 = new Supervisor();
        resp2.setNext(resp3);

        ManagerPrestamos resp4 = new ManagerPrestamos();
        resp3.setNext(resp4);

        this.next.criteriaHandler(monto);

    }

    @Override
    public IAtencion next() {
        return next;
    }
}
