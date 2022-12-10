// Car.java

public class Car
{
    private int yearModel; 
    private String make; 
    private int speed; 
    
    public Car(int newYearModel, String newMake)
    {
        yearModel = newYearModel;
        make = newMake;    
        speed = 0;
    }

    public int getYearModel()
    {
        return yearModel;
    }

    public String getMake()
    {
        return make;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void accelerate()
    {
        speed = speed + 5;
    }

    public void brake()
    {
        speed = speed - 5;
    }
}


//CarDemo.java

public class CarDemo
{
    public static void main(String[] args)
    {
        Car aCar = new Car(2020, "Hyundai");
        
        System.out.println("Year model of the car: " + aCar.getYearModel());
        System.out.println("Make of the car: " + aCar.getMake());
        System.out.println();
        
        for(int i = 0; i < 5; i++)
        {
            aCar.accelerate();
            System.out.println("Current speed of the car: " + aCar.getSpeed());
        }
        
        for(int i = 0; i < 5; i++)
        {
            aCar.brake();
            System.out.println("Current speed of the car: " + aCar.getSpeed());
        }
        
    } 
} 
