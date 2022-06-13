package SingletonChangeResp;

public class Banco {
    private String name;
    private Persona persona;
    private Manager m;

    public Banco(Persona person, String name, Manager m){
        this.persona =person;
        this.name=name;
        this.m = m;
    }

    public void depositarDinero(int cantidad){
        ManagerSaldo.getInstance().depositoDinero(cantidad);
        m.criteriaHandler(cantidad);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Manager getM() {
        return m;
    }

    public void setM(Manager m) {
        this.m = m;
    }
}