/*********************************************************************
Author : Daniel Queeley
Course : COP4814: Component-Based Software Development
Professor : Caryl Rahn
Program : COP4814 Lab 7
Purpose : Using UML diagram to show the class relationships
Due Date : 11/26/2019
Certification:
I hereby certify that this work is my own and none of it is the work of any other person.
..........{ Daniel Queeley }..........
*********************************************************************/

//class for test the implementation

public class TestFactoryPattern
{
	
    public static void main(String[] args) 
	{
        System.out.println("Luxury car in Europe region");
        Car carWithPackages1 = new BundleFactory().getBundle(CarType.LuxuryCar,Region.Europe);
        carWithPackages1.getFeaturePackage();
        System.out.println("------------------------------");
        
        System.out.println("Luxury car in Asia region");
        Car carWithPackages2 = new BundleFactory().getBundle(CarType.LuxuryCar,Region.Asia);
        carWithPackages2.getFeaturePackage();
        System.out.println("------------------------------");
        
        System.out.println("Luxury car in North America region");
        Car carWithPackages3 = new BundleFactory().getBundle(CarType.LuxuryCar,Region.NorthAmerica);
        carWithPackages3.getFeaturePackage();
        System.out.println("------------------------------");
        
        System.out.println("Performance Car in Europe region");
        Car carWithPackages4 = new BundleFactory().getBundle(CarType.PerformanceCar,Region.Europe);
        carWithPackages4.getFeaturePackage();
        System.out.println("------------------------------");
        
        System.out.println("Performance Car in Asia region");
        Car carWithPackages5 = new BundleFactory().getBundle(CarType.PerformanceCar,Region.Asia);
        carWithPackages5.getFeaturePackage();
        System.out.println("------------------------------");
        
        System.out.println("Performance Car in North America region");
        Car carWithPackages6 = new BundleFactory().getBundle(CarType.PerformanceCar,Region.NorthAmerica);
        carWithPackages6.getFeaturePackage();
        System.out.println("------------------------------");
    }
    
}
