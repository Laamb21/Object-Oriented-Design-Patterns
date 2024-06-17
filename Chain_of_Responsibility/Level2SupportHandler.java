package Chain_of_Responsibility;

//Concrete Handler
public class Level2SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request){
        if(request.gePriority() == Priority.INTERMEDIATE){
            System.out.println("Level 2 Support handled the request");
        }
        else{
            nextHandler.handleRequest(request);
        }
    }
}
