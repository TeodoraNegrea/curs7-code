package ro.fasttrackit.temacurs7;

public class ProductsMain {
    public static void main(String[] args) {
        Products products = new Products("carne", 19.5, 50, "carne");
        Products products2 = new Products("lapte", 2.5, 0, "lactate");
        Products products3 = new Products("oua", 1.1, 60, "oua");
        System.out.println(products.getName());
        System.out.println(products2.getName());
        System.out.println(products3.getName());
        System.out.println(products.getPrice());
        System.out.println(products2.getPrice());
        System.out.println(products3.getPrice());
        System.out.println(products.getQuantity());
        System.out.println(products2.getQuantity());
        System.out.println(products3.getQuantity());
        System.out.println(products.getCategory());
        System.out.println(products2.getCategory());
        System.out.println(products3.getCategory());
        System.out.println(products.hasStock(50));
        System.out.println(products2.hasStock(0));
        System.out.println(products3.hasStock(60));
        System.out.println(products.isCategory("carne"));
        System.out.println(products2.isCategory("lactate"));
        System.out.println(products3.isCategory("oua"));









    }
}
