package SingletonChangeResp;

public interface IAtencion {

    void setNext(IAtencion handler);//setear al siguiente responsable

    void criteriaHandler(int monto);//el objeto para manejar

    IAtencion next();
}