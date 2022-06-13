package Strategy;

public class Client {
    public static void main(String[]args){

        Tienda t1=new Tienda("Mi tiendita");

        Celular c1=new Celular("S1", "Samsung","Media",1000);
        Celular c2=new Celular("S2", "Samsung","Media",2000);
        Celular c3=new Celular("S3", "Samsung","Media",3000);
        Celular c4=new Celular("S4", "Samsung","Media",4000);
        Celular c5=new Celular("S1", "Samsung","Media",1000);
        Celular c6=new Celular("S1", "Samsung","Alta",1500);
        Celular c7=new Celular("AX", "Samsung","Media",1000);
        Celular c8=new Celular("Z3", "Samsung","Media",2000);
        Celular c9=new Celular("S1", "Samsung","Media",1000);
        Celular c10=new Celular("A30", "Samsung","Media",2000);
        Celular c11=new Celular("S1", "Samsung","Media",1000);
        Celular c12=new Celular("S1", "Samsung","Media",1000);
        t1.addCel(c1);
        t1.addCel(c2);
        t1.addCel(c3);
        t1.addCel(c4);
        t1.addCel(c5);
        t1.addCel(c6);
        t1.addCel(c7);
        t1.addCel(c8);
        t1.addCel(c9);
        t1.addCel(c10);
        t1.addCel(c11);
        t1.addCel(c12);


        if(t1.getInventario().size()>10){
            System.out.println("*****************POR MODELO***********************");
            t1.setStrategy(new StrategyModeloMuchos("S1"));
            t1.execute();
            System.out.println("*****************POR PRECIO***********************");
            t1.setStrategy(new StrategyPrecioMuchos(1000));
            t1.execute();
            System.out.println("*****************POR AMBOS***********************");
            t1.setStrategy(new StrategyModeloYPrecioMuchos("S1",1000));
            t1.execute();
        }else {
            System.out.println("*****************POR MODELO***********************");
            t1.setStrategy(new StrategyModeloPocos("S1"));
            t1.execute();
            System.out.println("*****************POR PRECIO***********************");
            t1.setStrategy(new StrategyPrecioPocos(1000));
            t1.execute();
            System.out.println("*****************POR AMBOS***********************");
            t1.setStrategy(new StrategyModeloYPrecioPocos("S1",1000));
            t1.execute();

        }





    }
}
