package Practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	           int a =10;
	           a++;
	           
	           a = a +1;
	  
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("국어점수: ");
	        int kor = scanner.nextInt();
	        System.out.print("수학점수: ");
	        int math = scanner.nextInt();
	        System.out.print("영어점수: ");
	        int eng = scanner.nextInt();

	        int total = kor + math + eng;
	        double average = total / 3.0;

	        boolean isPass = (kor >= 40 && math >= 40 && eng >= 40) && (average >= 60);

	        if (isPass) {
	            System.out.println("국어 : " + kor);
	            System.out.println("수학 : " + math);
	            System.out.println("영어 : " + eng);
	            System.out.println("합계 : " + total);
	            System.out.printf("평균 : %.1f\n", average);
	            System.out.println("축하합니다, 합격입니다!");
	        } else {
	            System.out.println("불합격입니다.");
	        }
	    }
	
}
