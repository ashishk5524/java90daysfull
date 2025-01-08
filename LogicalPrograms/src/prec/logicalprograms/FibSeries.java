package prec.logicalprograms;

public class FibSeries {
	int limit;
	public FibSeries() {}
	public FibSeries(int limit) {
		this.limit=limit;
	}
	public void setLimit( int limit) {
		this.limit=limit;
	}
	public int getLimit() {
		return limit;
	}
	public void printFibonacciSeries() {
		int number1=0;
		int number2=1;
		int sum=0;
		System.out.println("Fibonacci Series");
		for (int i=0;i<limit;i++) {
			sum=number1+number2;
			System.out.println(sum + " ");
			number1=number2;
			number2=sum;
		}
	}
	
	public void printQubeSquareSeries() {
		System.out.println("QubeSquareSeries");
		for (int i=1;i<limit;i++)
			if(i%2==0)
				System.out.println(i*i + " ");
			else
				System.out.println(i*i*i + "");
	}

}
