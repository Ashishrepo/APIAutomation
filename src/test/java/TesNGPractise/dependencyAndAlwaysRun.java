package TesNGPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyAndAlwaysRun {


    @Test(priority = 1)
    void startCar(){

        System.out.println("Car started");
        Assert.fail();
    }

    @Test(priority = 2,dependsOnMethods = {"startCar"})
    void DriveCar(){

        System.out.println("Car Drive started");
    }

    @Test(priority = 3,dependsOnMethods = {"DriveCar"})
    void StopCar(){

        System.out.println("Car stopped");
    }

    @Test(priority = 4,dependsOnMethods = {"startCar","StopCar"},alwaysRun = true)
    void ParkCar(){

        System.out.println("Car parked");
    }
}
