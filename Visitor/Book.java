package Visitor;

public class Book implements ItemElement{
    private int price;
    private String isbnNumber;

    public Book(int cost, String ibsn){
        this.price = cost;
        this.isbnNumber = ibsn;
    }

    public int getPrice(){
        return price;
    }

    public String getIbsnNumber(){
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor){
        return visitor.visit(this);
    }
}
