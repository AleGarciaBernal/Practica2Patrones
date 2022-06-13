package Mediator2;

public class Client {
    public static void main(String[] args) {
        ChatDeOficina cdof1 = new ChatDeOficina();


        User u1 = new User(cdof1);
        u1.setNombre("Juanito Gutierrze", "6666");
        User u2 = new User(cdof1);
        u2.setNombre("Miriam Garcia", "5555");
        User u3 = new User(cdof1);
        u3.setNombre("Sarah Bernal", "4444");
        User u4 = new User(cdof1);
        u4.setNombre("Byron", "3333");
        User u5 = new User(cdof1);
        u5.setNombre("GusGus", "2222");

        cdof1.addUsuarios(u1).
                addUsuarios(u2).addUsuarios(u3).addUsuarios(u4).addUsuarios(u5);

        System.out.println("..............MENSAJE 1................");
        u5.send("Esto es para Sarah", "Sarah Bernal");
        System.out.println("..............MENSAJE 2................");
        u1.send("Esto es para todos", "Todos");


    }
}
