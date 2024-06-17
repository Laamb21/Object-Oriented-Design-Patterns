package Chain_of_Responsibility;

public class Request {
    private Priority priority;

    public Request(Priority priority){
        this.priority = priority;
    }

    public Priority gePriority(){
        return priority;
    }
}
