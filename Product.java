public class Product {
    String description;
    public Product(String productName)
    {
        this.description=productName;
    }

    public void getDescription() {
        System.out.println(this.description);
    }
}
