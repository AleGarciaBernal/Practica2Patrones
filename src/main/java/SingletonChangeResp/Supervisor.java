package SingletonChangeResp;

public class Supervisor implements IAtencion {


    private IAtencion next;


    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int monto) {
        int m = ManagerSaldo.getInstance().getAcc() * 100;
        int p = m / ManagerSaldo.getInstance().getSaldoO();
        if (p > 50 && p < 100) {
            System.out.println("El Supervisor esta recibiendo el pago");
            System.out.println("No desearia un nuevo prestamo?");
        } else {
            next.criteriaHandler(monto);
        }
    }

    @Override
    public IAtencion next() {
        return next;
    }
}

