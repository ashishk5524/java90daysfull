package prec.logicalprograms.main;

import prec.logicalprograms.FibSeries;

public class FibSeriesMain {
    public static void main(String[] args) {
        FibSeries fibSeries = new FibSeries();

        // Set the limit for Fibonacci series
        fibSeries.setLimit(10);

        // Print the Fibonacci series
        fibSeries.printFibonacciSeries();
        
        fibSeries.printQubeSquareSeries();
    }
}
