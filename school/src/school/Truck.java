package school;

public class Truck extends Vehicle
{
	public boolean extendedBed;
	public boolean fourWheelDrive;
    public Truck(String name, int modelYear, String VIN, boolean isExtendedBed, boolean isFourWheelDrive)
    {
      super(name,modelYear,VIN);
      extendedBed = isExtendedBed;
      fourWheelDrive = isFourWheelDrive;
      isFourWheelDrive();
      isExtendedBed();
    }
    public Truck(String name, int modelYear,boolean isExtendedBed, boolean isFourWheelDrive)
    {
      super(name, modelYear);  
      extendedBed = isExtendedBed;
      fourWheelDrive = isFourWheelDrive;
      isFourWheelDrive();
      isExtendedBed();
    }
    
    
	public boolean isExtendedBed() {
	
		if (extendedBed) 
			System.out.println("This truck has an extended bed");
		else
			System.out.println("This truck does not have an extended bed");
		return (extendedBed);
		}
	public boolean isFourWheelDrive() {
			
		if (fourWheelDrive) 
			System.out.println("This truck has four-wheel drive");
		else
			System.out.println("This truck does not have four-wheel drive");
		return (fourWheelDrive);
			}
}
