package Interpereter;

public class Client {
    public static void main(String[] args) {
        //Represent the expression 5 + 8
        Expression five = new NumberExpression(5);
        Expression eight = new NumberExpression(8);
        Expression add = new AdditionExpression(five, eight);

        //Interpret the expression "5 + 8"
        System.out.println("5 + 8 = " + add.interpret());

        //Represent the expression 5 + 8 - 3
        Expression three = new NumberExpression(3);
        Expression subtract = new SubtractionExpression(add, three);

        //Interpret the expression "5 + 8 - 3"
        System.out.println("5 + 8 - 3 = " + subtract.interpret());

        //Represent the expression 5 + 8 - 3 * 7
        Expression seven = new NumberExpression(7);
        Expression multiply = new MultiplicationExpression(subtract, seven);

        //Interpret the expression "5 + 8 - 3 * 7"
        System.out.println("5 + 8 - 3 * 7 = " + multiply.interpret());

        //Represent the expression 5 + 8 - 3 * 7 / 2
        Expression two = new NumberExpression(2);
        Expression divide = new DivisionExpression(multiply, two);

        //Interpret the expression "5 + 8 - 3 * 7 / 2"
        System.out.println("5 + 8 - 3 * 7 / 2 = " + divide.interpret());
    }
}
