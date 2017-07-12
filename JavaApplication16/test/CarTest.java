/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlimited
 */
public class CarTest {
    double e = 0.0000000001;
    Car c = new Car("Toyota", "Camry", 1999, "Stella", "Teal", 8, 189067.9);
    
    @Test
    public void makeGetterTest() {
        assertEquals(c.getMake(), "Toyota");
    }
    @Test
    public void makeSetterTest(){
        c.setMake("Honda");
    }
    public CarTest() {
    }
    
}
