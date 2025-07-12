package TesNGPractise.TestNG_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("On test Start ..."+result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("On test Success ..."+result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("On test Fail ..."+result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("On test Skipped ..."+result.getName());
    }

    public void onFinish(ITestContext result) {
        System.out.println("On Finish ..."+result.getName());
    }


}
