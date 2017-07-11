package car;


public class Car {
   int year;
   String make, model;
   String nickname, color;
   int yearsowned;
   double miles;

    public int getYearsowned() {
        return yearsowned;
    }

    public void setYearsowned(int yearsowned) {
        this.yearsowned = yearsowned;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
   boolean isOn;
   
   public Car(String newMake, String newModel, int newYear, String newnickName, String newcolor, int newyearsOwned, double newMiles) {
       make=newMake;
       model=newModel;
       year=newYear;
       nickname=newnickName;
       color= newcolor;
       yearsowned=newyearsOwned;
       miles=newMiles;       
       isOn = false;
   }
   
       public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void turnOn() {
        isOn=true;
        System.out.println("The car is now on!");
    }
   
    public void turnOff() {
        if (isOn==true) {
            isOn=false;
            System.out.println("The car is now off!");
        } 
        else {
            System.out.println("The car is already off!");
        }
       
    }
}