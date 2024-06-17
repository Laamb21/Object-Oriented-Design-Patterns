package Chain_of_Responsibility;

//Concrete Handler
public class Level3SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request){
        if(request.gePriority() == Priority.CRITITCAL){
            System.out.println("Level 3 Support handled the request");
        }
        else{
            nextHandler.handleRequest(request);
        }
    }
}
