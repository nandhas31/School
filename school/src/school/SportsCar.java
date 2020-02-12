package school;
public class SportsCar extends Vehicle
{
    int topSpeed;
    public SportsCar(String name, int modelYear, int thisTopSpeed, String VIN)
    {
      super(name, modelYear, VIN);
      topSpeed = thisTopSpeed;
      getTopSpeed();
      isFast();
    }
    public SportsCar(String name, int modelYear, String VIN)
    {
      super(name, modelYear,VIN);
    }
    public int getTopSpeed(){
    	System.out.println("This car can go " + topSpeed + " mph");
    	return (topSpeed);
    			
    }
    public boolean isFast() {
    	if (topSpeed > 150) {
    		System.out.println("This car is fast");
    		return true;
    	}    	
    	System.out.println("This car is not fast");
    	return false;
    }
    

}
