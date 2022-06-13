package Mediator2;

public class User extends Persona{

        public User(Mediator canalComunicacion) {
            super(canalComunicacion);
        }

        @Override
        public void send(String msg, String nombre) {
            oficinasChat.send(msg, this, nombre);
        }

        @Override
        public void received(String msg) {
            System.out.println("Nombre del empleado: " + getNombre());
            System.out.println("Mensaje Recibido: " + msg);

        }
    }
