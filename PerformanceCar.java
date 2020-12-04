import java.util.ArrayList;

//performancr car implementaion

public class PerformanceCar extends Car
{
    public PerformanceCar(Region region) 
	{
        super(region);
        this.features = new ArrayList<>();
        features.add("Aluminum wheels");
    }  
}
