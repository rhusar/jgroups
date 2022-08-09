package org.jgroups.util.testng;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener2;
import org.testng.ITestContext;
import org.testng.ITestResult;

/**
 * @author Radoslav Husar
 */
public class LogRunningTestMethodNameListener implements IInvokedMethodListener2 {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        if (method.isTestMethod()) {
            System.out.println("Running: " + method.getTestMethod().getRealClass().getName() + "#" + method.getTestMethod().getMethodName());
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        if (method.isTestMethod()) {
            System.out.println(method.getTestMethod().getRealClass().getName() + "#" + method.getTestMethod().getMethodName() + ": " + (method.getTestResult().isSuccess() ? "PASS" : "FAIL"));
        }
    }
}