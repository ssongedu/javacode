package exam.operator;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		System.out.println(c1);
		char c2 = 'A';
		System.out.println(c2);
		char c3 = (char) (c2 + 1);
		System.out.println(c3);
	}
}
