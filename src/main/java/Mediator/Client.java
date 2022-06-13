package Mediator;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[]args){
        Whatsapp wpp = new Whatsapp();
        List<Integer> l1 = Arrays.asList(2);
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9);

        User u1 = new User(wpp);
        u1.setNombre("Daniel").setNumero(1);
        User u2 = new User(wpp);
        u2.setNombre("Juan").setNumero(2);
        User u3 = new User(wpp);
        u3.setNombre("Heiiky").setNumero(3);
        User u4 = new User(wpp);
        u4.setNombre("Nicole").setNumero(4);
        User u5 = new User(wpp);
        u5.setNombre("Arturo").setNumero(5);
        User u6 = new User(wpp);
        u6.setNombre("Ignacio").setNumero(6);
        User u7 = new User(wpp);
        u7.setNombre("Alvaro").setNumero(7);
        User u8 = new User(wpp);
        u8.setNombre("Luis").setNumero(8);
        User u9 = new User(wpp);
        u9.setNombre("GusGus").setNumero(9);
        User u10 = new User(wpp);
        u10.setNombre("Zamira").setNumero(10);

        wpp.addUsuarios(u1).
                addUsuarios(u2).addUsuarios(u3).addUsuarios(u4).addUsuarios(u5).addUsuarios(u6).
                addUsuarios(u7).addUsuarios(u8).addUsuarios(u9).addUsuarios(u10);


        System.out.println("................Mensaje1 para 2..............");
        u1.send("Esto es para Juan", l1);
        System.out.println("..............Mensaje2 para todes..............");
        u10.send("Esto es para todos los usuarios wpp", l2);
    }
}