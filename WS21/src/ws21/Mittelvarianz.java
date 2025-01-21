package ws21;

public class Mittelvarianz {
	
	public static double mittelwert(double[] x) {
		double result = 0.0;
		int n = x.length;
		if(x.length > 0) {
			
			for(int i = 0; i<x.length; i++) {
				result = result + x[i];
				System.out.println(result);
			}
			System.out.println(result);

			result = Math.pow(n,-1)*result;
			System.out.println(result);
			

			
			return result;


		}
		else {
			return result;
		}
		
		}
	
	public static double varianz(double[] x) {
		if(x.length > 0) {
			
			double mw = mittelwert(x);
			int n = x.length;
			double result = 0.0;
			for(int i= 0; i<n; i++) {
				result += Math.pow((x[i]-mw), 2);
			}
			result = (1.0/n)*result;
			
			return result;
		}
		else {
			return 0.0;
		}
	}
	
	public static void main(String[] args) {
		double[] array = {1.5, 2.4, 3.3};
		
		System.out.println("Mittelwert: " + mittelwert(array));
		System.out.println("Varianz: " + varianz(array));
		
	}
	
}
