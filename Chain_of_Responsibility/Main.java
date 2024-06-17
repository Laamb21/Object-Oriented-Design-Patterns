package Chain_of_Responsibility;

//Main class
public class Main {
    public static void main(String[] args) {
        //Initialize concrete support handlers
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        //Initalize chain of command between concrete support handlers
        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        //Initalize requests
        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITITCAL);

        //Handle requests with concrete support handlers
        level1Handler.handleRequest(request1);
        level2Handler.handleRequest(request2);
        level3Handler.handleRequest(request3);
    }
}
