package school;
public class Car extends Vehicle
{
   public int numDoors;
    public Car(String name, int modelYear, String VIN, int numOfDoors)
    {
        super(name, modelYear, VIN);
        numDoors = numOfDoors;
        getDoors();
        isFamilyFriendly();
    }
    public Car(String name, int modelYear)
    {
        super(name, modelYear);
    }
    public boolean isFamilyFriendly(){
        if (numDoors >= 4 ) {
        	System.out.println("This car is family friendly");
        	return true;
        }
        System.out.println("This car is not family friendly");
        return false;
    }
   public int getDoors(){
	   System.out.println("This car has " + numDoors + " doors");
	   return numDoors;
	   }	
	}



