import java.util.ArrayList;

//Luxury car implementation

public class LuxuryCar extends Car 
{
    public LuxuryCar(Region region) 
	{
        super(region);
        this.features = new ArrayList<>();
        features.add("Upgraded radios");
    }   
}
