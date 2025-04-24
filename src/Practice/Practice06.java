package Practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("삼각형의 밑변을 입력하세요 : "); 
			int line1 = scanner.nextInt();
			
//			
			System.out.println("삼각형의 높이를 입력하세요 : "); 
			int height = scanner.nextInt();
//		
			double area = (line1 * height)/2.0;
			System.out.printf("삼각형의 넓이는 %d*%d/2=%f \n", line1, height, area);
//				 
		 

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
			
			System.out.println("윗변 길이를 입력하세요 : "); 
			int line4 = scanner.nextInt();
		
			
			System.out.println("밑변 길이를 입력하세요 : "); 
			int line2 = scanner.nextInt();
			
			
			System.out.println("높이 길이를 입력하세요 : "); 
			int height1 = scanner.nextInt();
			
			
			double area2 = (line4 + line2)*height1/2.0;
			System.out.printf("넓이 (%d+%d)*%d/2=%f \n", line4, line2, height1, area2);
        //			 
			
				 

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
//			int cookies =100;
//			int students = 24;
//			
	 		System.out.println("한명당 받는 과자 수 :" + (100/24) );
	 		System.out.println("남는 과자 수 :" + (100%24) );
	
//			
//			//한명이 얻는 과자 수
//			int cookiesPerstudents =(cookies/students);
//			System.out.println(cookiesPerstudents);
//			
//			//남은 과자 수		
//			
//			int cookiesLeft =(cookies%students);
//			System.out.println(cookiesLeft);
//			
//			
////		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
//				int = 158;
//		// 백의자리 : 1
//		// 십의자리 : 5
//		// 일의자리 : 8
//		//	
	 		
	 		System.out.println("세자리의 점수를 입력 : ");
	 		int num = scanner.nextInt();
	 		
	 		System.out.println("백의 자리 : " + (num/100 ));
	 		System.out.println("십의 자리 : " + (num/10%10 ));
	 		System.out.println("일의 자리 : " + (num%10 ));
			
//
//		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
//		//x와 y를 바꾼 작업
		int z = x; //x 값 임시보관
		x = y;
		y = z;
	
		System.out.println("x="+x+ " y="+y);
//		
//		      scanner.close();
		
	}

}
