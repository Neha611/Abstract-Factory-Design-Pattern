import java.util.Objects;

public class Biba {
    private Biba(){};
    public static Product getProduct(String name)
    {
        if(Objects.equals(name, "saree"))
            return new Product(name);
        else if(Objects.equals(name, "ethnic-top"))
            return new Product(name);

        return new NullProduct();
    }
}
