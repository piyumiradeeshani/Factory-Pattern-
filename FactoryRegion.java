//Factory class which returns region oject

public class FactoryRegion 
{
    public GeographicRegions getRegionObject(Region regionName)
	{
        if(regionName.equals(Region.Europe))
		{
            return new Europe();
        }
        else if(regionName.equals(Region.Asia))
		{
            return new Asia();
        }
        else if(regionName.equals(Region.NorthAmerica))
		{
            return new NorthAmerica();
        }
        else
		{
           return null; 
        }  
    }
}
