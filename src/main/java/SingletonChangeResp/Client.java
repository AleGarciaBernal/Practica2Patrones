package SingletonChangeResp;

public class Client {

    public static void main(String[] args) {

        Manager m = new Manager();

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco = new Banco(new Persona("Ale Garcia"), "BNB", m);
                System.out.println("Hola! "+banco.getPersona().getName());
                banco.depositarDinero(200);
                banco.depositarDinero(100);
                banco.depositarDinero(300);
                banco.depositarDinero(200);
                banco.depositarDinero(300);
            }
        });

        hilo1.start();
    }

}