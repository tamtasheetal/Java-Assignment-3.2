package Keywords;

public class Vehicle
//Class declaration.
{
	public static void main(String[] args)    
	{
		int bikeSpeed = 200,
		   pulsarSpeed = 180;    
//Declaring two variables to store speed of Bike and Pulsar.
		
		System.out.println("This is a valid info of my vehicle:-");  
		
		Pulsar bikeSpeedTest=new Pulsar(bikeSpeed,pulsarSpeed);    
//Creating the new object of class Pulsar which is inherited by Bike.
		
		bikeSpeedTest.display(); 
  
	}   
}  
