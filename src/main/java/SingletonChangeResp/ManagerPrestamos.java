package SingletonChangeResp;

public class ManagerPrestamos implements IAtencion{
    private IAtencion next;


    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int monto) {
        int m = ManagerSaldo.getInstance().getAcc() * 100;
        int p = m/ ManagerSaldo.getInstance().getSaldoO();
        if(p == 100){
            System.out.println("El Encargado de prestamos esta recibiendo el pago");
            System.out.println("Devolviendo todos los documentos del cliente");
        }else{
            next.criteriaHandler(monto);
        }
    }

    @Override
    public IAtencion next() {
        return next;
    }
}

