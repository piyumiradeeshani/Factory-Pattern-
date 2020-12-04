import java.util.ArrayList;

// abstract class for car type

public abstract class Car 
{
    public ArrayList<String> features;
    public Region regionName;
    public GeographicRegions featuresOfRegion;
	
	
    Car(Region region)
	{
        this.regionName = region;
        this.featuresOfRegion = new FactoryRegion().getRegionObject(this.regionName);                  
    }
	
	
//method uses to print the results

public void getFeaturePackage()
{
    for(int i=0;i<featuresOfRegion.regionFeatures.size();i++)
	{
        System.out.println(featuresOfRegion.regionFeatures.get(i));
    }
    for(int j=0;j<features.size();j++)
	{
        System.out.println(features.get(j));
    }
        
}

}
