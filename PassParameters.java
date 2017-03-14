package seleniumpackage;

public class PassParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassParameters obj = new PassParameters();
		obj.add(100, 150);
		obj.sub(20.5, 50.6);
		

	}
	
	public void add (int a, int b){
		
		int c = a+b;
		System.out.println("The value of c is " +c);
	}
	
	
	public void sub(double x,  double y){
		double result = y-x;
		
	System.out.println("The value of result is " +result);
	}

}
