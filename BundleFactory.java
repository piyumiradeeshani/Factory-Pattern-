//Factory class for return the featuer package
public class BundleFactory 
{
    public Car getBundle(CarType carType, Region regionName ){
        if(carType.equals(CarType.LuxuryCar))
		{
            return new LuxuryCar(regionName);
        }
        else if(carType.equals(CarType.PerformanceCar))
		{
            return new PerformanceCar(regionName); 
        }
        else
		{
            return null;
        }
    }
}
