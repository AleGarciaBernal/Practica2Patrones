package ChainResponsability;

public interface IHandler {

    void setNext(IHandler handler);
    void criteriaHandler(String orden);
    IHandler next();
}
