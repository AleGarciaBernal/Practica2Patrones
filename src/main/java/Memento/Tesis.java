package Memento;

public class Tesis {

    private String fecha;
    private int nroVersion;
    private String nroPaginas;

    public Tesis(String fecha, int nroVersion){
        this.fecha=fecha;
        this.nroVersion=nroVersion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNroVersion() {
        return nroVersion;
    }

    public void setNroVersion(int nroVersion) {
        this.nroVersion = nroVersion;
    }
    public void showInfo(){
        System.out.println("Tesis version: "+ nroVersion);
        System.out.println("La fecha es:"+fecha);

    }
}
