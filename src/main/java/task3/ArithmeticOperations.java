package task3;

public class ArithmeticOperations {
	
	public double add(double first,double second) {
		double temp=first+second;
		return temp;
	}
	
	public double subtract(double first,double second) {
		double temp=first-second;
		return temp;
	}
	
	public double multiply(double first,double second) {
		double temp=first*second;
		return temp;
	}
	
	public double divide(double first,double second) {
		if(second!=0) {
			double temp=first/second;
			return temp;
		}
		else {
			System.out.println("Cannot Divide by Zero");
			System.exit(1);
			return -1;
		}
	}
}