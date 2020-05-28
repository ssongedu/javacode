package exam.operator;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금  | 2. 출금  | 3. 잔고  | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			int menu=scanner.nextInt();

			switch(menu) {
			case 1:
				System.out.println("1. 예금");
				balance += scanner.nextInt();
				break;
			case 2:


				//		if(scanner.nextInt()<=10000) {
				//			System.out.println("만원 이상만 출금가능합니다");
				//		}else {
				//			System.out.println("2. 출금");
				//			balance -= scanner.nextInt();
				//		}


						if(balance<scanner.nextInt()) {
						System.out.println("잔고가 부족합니다.");
					}else {
						System.out.println("2. 출금");
						balance -= scanner.nextInt();
					}

		
				

				break;
			case 3:
				System.out.println("3. 잔고");
				System.out.println(balance);
				break;
			case 4:
				run=false;
				break;


			}
		}
		System.out.println("프로그램 종료");
	}
}
