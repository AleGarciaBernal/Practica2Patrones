package SingletonChangeResp;

public class CreditManager implements IAtencion{
    private IAtencion next;


    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int monto) {
        int m = ManagerSaldo.getInstance().getAcc() * 100;
        int p = m/ ManagerSaldo.getInstance().getSaldoO();
        if(p>=25 && p<50){
            System.out.println("El Agente de credito esta recibiendo el pago");
            System.out.println("El banco estaria muy contento de refinanciar su pago querido cliente");
        }else{
            next.criteriaHandler(monto);
        }
    }

    @Override
    public IAtencion next() {
        return next;
    }

        }
