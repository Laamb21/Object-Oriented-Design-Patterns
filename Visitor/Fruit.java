package Visitor;

public class Fruit implements ItemElement{
    private int pricePerPound;
    private int weight;
    private String name;

    public Fruit(int priceLbs, int wt, String nm){
        this.pricePerPound = priceLbs;
        this.weight = wt;
        this.name = nm;
    }

    public int getPricePerPound(){
        return pricePerPound;
    }

    public int getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor){
        return visitor.visit(this);
    }
}
