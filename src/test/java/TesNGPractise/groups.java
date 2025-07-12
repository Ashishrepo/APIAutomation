package TesNGPractise;

import org.testng.annotations.Test;

public class groups {

    @Test(groups = {"reg"})
    void regression(){
        System.out.println("Running regression");
    }
    @Test(groups = {"sanity"})
    void sanity(){
        System.out.println("Running sanity");
    }

    @Test(groups = {"smoke"})
    void smoke(){
        System.out.println("Running smoke");
    }

    @Test(groups = {"reg","smoke"})
    void e2e(){
        System.out.println("Running E2E");
    }
}
