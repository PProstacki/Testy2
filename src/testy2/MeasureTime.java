package testy2;

import org.junit.AssumptionViolatedException;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

public class MeasureTime extends Stopwatch{

    private static void logInfo(Description description, String status, long nanoseconds) {
        String testName = description.getMethodName();
        System.out.println("Nazwa testu: " + testName + ", Status: " + status + ", Upłyneło " + nanoseconds + " nanosekund");
    }

    @Override
    protected void succeeded(long nanoseconds, Description description) {
        logInfo(description, "Zakończono pomyślnie", nanoseconds);
    }

    @Override
    protected void failed(long nanoseconds, Throwable e, Description description) {
        logInfo(description, "Błąd", nanoseconds);
    }

    @Override
    protected void skipped(long nanoseconds, AssumptionViolatedException e, Description description) {
        logInfo(description, "Pominięto", nanoseconds);
    }

    @Override
    protected void finished(long nanoseconds, Description description) {
        logInfo(description, "Zakończono", nanoseconds);
    }
}
