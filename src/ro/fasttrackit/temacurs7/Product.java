package ro.fasttrackit.temacurs7;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;


    public Product(String name, double price, int quantity, String category){
        this.name = "paine";
        this.price = 1.50;
        this.quantity = 30;
        this.category = "Produse de panificatie";

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
    public boolean hasStock(int quantity) {
        if (quantity > 0) {
            return true;
        } else {
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
