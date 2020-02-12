
package school;
public class Vehicle
{
    // instance variables - replace the example below with your own
    public String VIN;
    public int year;
    public String name;

    
    public Vehicle(String thisName, int modelYear, String thisVIN)
    {
       VIN = thisVIN;
       year = modelYear;
       name = thisName;
       getVIN();
       howOld();
       
    }
    public Vehicle(String thisName,int modelYear)
    {
       year = modelYear;
       name = thisName;
    }
    
    
    public static void main(String[] args){
        Truck biggy = new Truck("biggy", 2010, "123456789", true, true);
        SportsCar speedy = new SportsCar("speedy", 2019, 180, "123456789");
        Car car = new Car("classy", 2015, "111223345", 4);
        
    }
    public String getVIN(){
        System.out.println("This vehicles's VIN is " + VIN);
    	return VIN;
    }
    public int howOld(){
        System.out.println("The vehicle is " + (int)(2020-year) + " years old");
        return (int)(2020-year);
    }
}



    