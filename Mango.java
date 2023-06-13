import java.util.Objects;

public class Mango {
    private Mango(){};
    public static Product getProduct(String name)
    {
        if(Objects.equals(name, "dress"))
            return new Product(name);
        else if(Objects.equals(name, "jeans"))
            return new Product(name);

        return new NullProduct();
    }
}
