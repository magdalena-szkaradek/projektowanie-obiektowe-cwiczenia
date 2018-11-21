package wzorce;

public abstract class Baza {
    protected String description;

    public abstract double price();

    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return price() + "(" + getDescription() + ")";
    }
}
