public class Main {
    public static void main(String[] args) {
        Product product=ShoppingStore.getProduct("Nike","shoes");
        product.getDescription();
        System.out.println();
        Product p1=ShoppingStore.getProduct("Biba","shoes");
        p1.getDescription();
    }
}