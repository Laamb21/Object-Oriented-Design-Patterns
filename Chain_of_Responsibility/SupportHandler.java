package Chain_of_Responsibility;

//Handler interface
public interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler nextHandler);
}
