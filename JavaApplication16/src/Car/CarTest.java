package car;

public class CarTest {
   
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1= 1999;
        String nickName1 = "Tony", color1="teal";
        int yearsOwned1=8;
        double miles1=18900;
       Car car1= new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear() + ". The car's nickname is " + car1.getNickname() + ". The car  is colored " + car1.getColor() + ". It has been owned for " + car1.getYearsowned()+ ". The car has a mileage of " + car1.getMiles());
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }
    
}

