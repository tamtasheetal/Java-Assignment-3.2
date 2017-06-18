package Keywords;
class Bike
//Declaring the class bike
{
	int Speed;       
//Declaring the Speed.
	
	public Bike(int Speed)      
//Constructor of vehicle class.
	{
		this.Speed=Speed;        
//It is Assigning the speed variable with the parameter.
		
		System.out.println("This is the constructor of Bike class."); 
	}
	
	public void displaySpeed()
	{
		System.out.println("The speed of the Bike is "+this.Speed);      
//Here Using 'this' keyword with variable.
	}
	
}
