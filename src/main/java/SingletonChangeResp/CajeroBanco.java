package SingletonChangeResp;

public class CajeroBanco implements IAtencion {


    private IAtencion next;


    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int monto) {
        int m = ManagerSaldo.getInstance().getAcc() * 100;
        int p = m / ManagerSaldo.getInstance().getSaldoO();
        if(p<25){
            System.out.println("El cajero esta recibiendo el pago");
        }else{
            next.criteriaHandler(monto);
        }
    }

    @Override
    public IAtencion next() {
        return next;
    }
}