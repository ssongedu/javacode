package exam.operator;

public class InfinityAndNanCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		System.out.println(Double.isInfinite(z));
		double a = z+1;
		System.out.println(Double.isNaN(a));
	}
}
