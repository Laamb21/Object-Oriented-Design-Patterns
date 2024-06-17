package Chain_of_Responsibility;

//Concrete Handler
public class Level1SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request){
        if(request.gePriority() == Priority.BASIC){
            System.out.println("Level 1 Support handled the request");
        }
        else{
            nextHandler.handleRequest(request);
        }
    }
}
