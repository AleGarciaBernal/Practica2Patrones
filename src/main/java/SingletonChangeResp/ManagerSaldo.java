package SingletonChangeResp;

public class ManagerSaldo {
    private static ManagerSaldo managerSaldo;
    private int saldo;
    private int saldoO;

    private int acc;
    private ManagerSaldo(){
        this.saldo=1500;
        this.saldoO=1500;
        acc = 0;
        System.out.println("Saldo Inicial: "+saldo);
    }


    private synchronized static void  multiThreadControl(){
        if (managerSaldo== null)
            managerSaldo= new ManagerSaldo();
    }


    public static ManagerSaldo getInstance(){
        if (managerSaldo==null)
            multiThreadControl();
        return managerSaldo;
    }

    public synchronized void depositoDinero(int cantidad){
        if (cantidad<=saldo){
            saldo=saldo-cantidad;
            acc = acc +cantidad;
            System.out.println("Devolucion actual: "+cantidad);
            System.out.println("Saldo por devolver: "+ saldo);
        }else{
            System.out.println("Hora de devolver");
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldoO() {
        return saldoO;
    }

    public void setSaldoO(int saldoO) {
        this.saldoO = saldoO;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }
}