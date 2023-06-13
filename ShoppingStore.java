import java.util.Objects;

public class ShoppingStore {
    private ShoppingStore()
    {

    }
    public static Product getProduct(String brand,String model)
    {
        if(Objects.equals(brand, "Nike"))
            return Nike.getProduct(model);
        else if(Objects.equals(brand, "Biba"))
            return Biba.getProduct(model);
        else if(Objects.equals(brand, "Mango"))
            return Mango.getProduct(model);
        return new NullProduct();
    }
}
