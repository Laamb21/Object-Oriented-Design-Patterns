package Interpereter;

public class NumberExpression implements Expression{
    private int num;

    public NumberExpression(int num){
        this.num = num;
    }

    @Override
    public int interpret(){
        return num;
    }
}

