package exam.ch05;

import java.util.Scanner;

public class ExScore {
	public static void main(String[] args) {
		int scores[]=new int[10]; //10명 배열
		
		Scanner scanner = new Scanner(System.in);
		
		int sum=0;
		
		for(int i=0; i<10; i++) {
			System.out.println(i+1+"번째 학생 점수");
				scores[i] = scanner.nextInt();
	}
	
		for(int i=0; i<scores.length;i++) {
			sum=sum+scores[i];
		}
		System.out.println("총점은 "+sum);
		System.out.println("평균은 "+(double) sum/scores.length);
		System.out.println(scores[10]);
		}
}