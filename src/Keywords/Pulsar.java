package Keywords;

class Pulsar extends Bike       
//It is Declaring Pulsar class which is the child class of Bike.
{
	int Speed;         
//It is Assigning the variable Speed.
	
	public Pulsar(int Speed1,int Speed2)
	{
		super(Speed1);              
//It is passing the value to the constructor of superclass with 'super' keyword.
		this.Speed=Speed2;       
//It is Assigning the speed variable with the parameter.
		System.out.println("This is the constructor of pulsar class."); 
	}
	
	public void display()
	{
		super.displaySpeed();      
//Here Using 'super' keyword with method.
		this.displaySpeed();       
//Here Using 'this' keyword with method.
	}
	
	public void displaySpeed()
	{
		System.out.println("The speed of the pulsar is "+this.Speed);     
//Here Using 'this' keyword with variable.
	}
	
}

