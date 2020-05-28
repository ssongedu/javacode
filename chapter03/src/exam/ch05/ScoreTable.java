package exam.ch05;

import java.util.Scanner;

public class ScoreTable {
	public static void main(String[] args) {
		
		int[][] score=new int[10][3]; 		
		
		
		Scanner scanner = new Scanner(System.in);
		int kor=0;
		int eng=0;
		int math=0;
		
		int kor_sum=0;
		int eng_sum=0;
		int math_sum=0;
		
		System.out.println("국어   영어   수학");
		System.out.println("----------------");
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
			System.out.println(i+1+"번째 학생 점수");
				kor[i][j] = scanner.nextInt();
				eng[i][j] = scanner.nextInt();
				math[i][j] = scanner.nextInt();
		}
	}
	
		for(int i=0; i<score.length;i++) {
			kor_sum=kor_sum+score[i];
			eng_sum=eng_sum+score[i];
			math_sum=math_sum+score[i];
			
		}
		System.out.println("총점은 "+kor_sum);
		System.out.println("총점은 "+eng_sum);
		System.out.println("총점은 "+math_sum);

		//		System.out.println("평균은 "+(double) sum/score.length);
		
		System.out.println(score[10]);
		
		
		
		
		
		
	}
}
