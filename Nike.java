import java.util.Objects;

public class Nike {
    private Nike(){};
    public static Product getProduct(String name)
    {
        if(Objects.equals(name, "shoes"))
            return new Product(name);
        else if(Objects.equals(name, "track-suit"))
            return new Product(name);

        return new NullProduct();
    }
}
