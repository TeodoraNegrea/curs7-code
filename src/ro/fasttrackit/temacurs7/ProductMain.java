package ro.fasttrackit.temacurs7;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("paine", 1.50, 30, "Produse de panificatie");
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println(product.getCategory());
        System.out.println(product.hasStock(30));
        System.out.println(product.isCategory("Produse de panificatie"));

    }
}