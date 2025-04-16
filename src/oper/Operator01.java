package oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//연산자
		
		//산술 연산
		System.out.println( 1 + 1);
		System.out.println( 2 - 1);
		System.out.println( 3 * 2);
		System.out.println( 4 / 2);
		System.out.println( 9 % 5); // 9 나머지 연산 5
		
		//부호
		System.out.println(30);
		System.out.println(+30);
		System.out.println(-30);
		System.out.println(-(-30));
		
		//증감 연산
		System.out.println("===증감===");

		int x = 10;
		int y = 20;
		int z = 30;
		
		System.out.println(x--); //x값 10 출력 -> x: 9
		System.out.println( x ); // x:9
		
		System.out.println(++y); //y값 21 출력->
		System.out.println( y ); //y:21
		
		System.out.println(z+1); //z값 31
		System.out.println( z );   //30 
		//========숫자가 있는거면 Z에 기존 출력값 기호가 있으면 출력값도 변경//
		
		int q = 1; // q:2
		int w = 3; // w:2
		int e = 10 + ++q; // 10 + ++e; -> 10+1+1=12 
		int r = 3 + w--;  // 3 + w--; -> 3+3=6
		
		System.out.printf("%d %d %d %d \n", q, w, e, r);
		
		//논리 부정 연산  !  true <-> false
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry); // 그 시점에 연산
		System.out.println(isHungry);  // 원본데이터 변화없음
		
	
		//비교연산
		System.out.println("=====비교연산=====");
		System.out.println( 10 == 10 ); // 같으나
		System.out.println( 5 != 5);    // 다르냐
		System.out.println( 5 > 3 );
		System.out.println( 5 >= 3);
		System.out.println( 5 < 3 );
		System.out.println( 5 <= 3);
		boolean b1 = (9 >= 8); //true
		System.out.println(b1);
		
		//논리연산자
		System.out.println("=====논리연산=====");
		boolean b2 = (10 > 6) && (10 > 5);
				//    true && true -> true ->둘다 트루여야 트루 
		System.out.println(b2);
		
		boolean b3 = (5 != 1) || (10 < 5);
				//     true   || false  -> true ||는 둘중하나라도 진실이면 트루
		System.out.println(b3);
	
		boolean b4 = ( 2>=1 ) && !(3<4);
				//     true  &&  false --> false
		System.out.println(b4);
	
		//대입 연산
		int a = 30; //단순 대입

		//복합 대입
		a += 5;     //a = a + 5;
		a -= 3;     //a = a - 3;
		a *= 3;		//a = a * 3;
		a /= 2;		//a = a / 2;
		a %= 4;		//a = a % 4;
		
		//삼항 연산자
		//	(조건식) ? 앞 : 뒤
		// 		참이면 앞  거짓이면 뒤
		
		int point = 101;
		String item = (point >= 100) ? "커피" : "생수";
		System.out.println(item);	
		
		item = (point < 100) ? "생수" : "커피";
		
		//point >= 100 --> point <= 100
		//point >  50  --> point <=  50
		
		// 이벤트 음료 조건 
		// 	0~100  : 생수
		// 101~100 : 커피
		// 201~    : 맥주
		point = 600;
		item = (point <=100) ? "생수" : (point > 200? "맥주" : "커피");
		
		System.out.println(item);
		
		item = (point <= 200) ? (point > 100? "커피": "생수") : "맥주";
				
		System.out.println(item);
	}

}
