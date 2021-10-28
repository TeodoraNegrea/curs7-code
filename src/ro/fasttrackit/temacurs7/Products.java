package ro.fasttrackit.temacurs7;

public class Products {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Products(String name, double price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getCategory(){
        return category;
    }
    public boolean hasStock(int quantity){
        if(quantity>0) {
            return true;
        }else{
            return false;
        }

    }
    public boolean isCategory(String category){
        if(name.equals(category)) {
            return true;
        }else {
            return false;
        }
    }

}
