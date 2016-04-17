public class Comparator2  {

	public int getMax(int n, int m){
		double x = (double) n;
		double y = (double) m;
		return (int) getMax(x, y);
	}

	public double getMax(double d1, double d2){
		if (d1 > d2) {
			return d1;
		}
		else {
			return d2;
		}
	}
	
	
	public String getMax (String number1, String number2) {
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);
		String answer = "" + getMax(n1, n2);
		return answer;
	}
	
}