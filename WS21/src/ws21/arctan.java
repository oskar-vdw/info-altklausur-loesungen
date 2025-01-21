package ws21;

public class arctan {
	
	public static double arctan2(double x) {
		int k = 0;
		double value = 0.0;
		double cum_value = 0.0;
		if(x >= -1 && x <= 1) {
		while(value >= 0.000001 || k  == 0) {
			value = (Math.pow(x,(2*k+1))/(2*k+1));
			cum_value += (Math.pow(-1, k)*value);
			k++;
		}}
		else {
			return 0.0;
		}
		
		return cum_value;
	}
	
	public static void main (String[] args ) {
		System.out.println(arctan2(0.5));
	}
}
