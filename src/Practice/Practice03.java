package Practice;

public class Practice03 {
	public static void main(String[] args) {

	//1. 아래 1), 2) 에 맞게 풀이.
	//int x = 10;
	//int y = 4;
	//___result = ___x/y;
	//System.out.println(result);

         
	//1) 결과가 2가 나오도록 작성하세요
///        	int x = 10;
///        	int y = 4; 
///        	int result = x/y;
///        	System.out.println(result);
	//2) 결과가 2.5가 나오도록 작성하세요
///			int x = 10;
///			int y = 4;
///			double result = (double)x/y;
///			System.out.println(result);

	//2. 결과가 7.5가 나오도록 작성하세요
		//double a = 3.5;
		//double b = 4.7;
		//double result =  a + (int) b;
		//System.out.println(result);
		//-----------------------------
/// 	double result = a + (int) b;
		//-----------------------------
		
	//3. 계산결과가 12가 나오도록 작성하세요
		//String a = "3.4";
		//String b = "4";
		//______ result = ________;
		//System.out.println(result);
		//-----------------------------
		 ///int n1= (int) Double.parseDouble(a);
		 ///int n2=  Integer.parseInt(b);
		 ///int result = (n1 * n2);
		 ///System.out.println(result); 
		 ///* 
 		//-----------------------------
	//4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
		//  String a = "10";
		//	int b = 3;       //
		//	double c = 4.5;  // 3 * 4. = 13.5 -> 13
		//	String result = a + (b+10);
		//	System.out.println(result);
		///	
		/// String a = "10";
		/// int b = 3;
		/// String result = a + (b + 10);
		/// System.out.println(result);
		///-===========================
		/// String result = a + ( (int)(b*c) ) ;
		///						-----(int)(13.5)-->13
		///				String	10 + 13 = "1013"
 	
	//
	//5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
//		int a = 4;                         
//		double b = 3.4;						
//		String c = "6.8";					
//		_____ result = _______;
//		System.out.println(result);
///int ic =(int)Double.parseDouble(c);//--6.8 변수
//		 
///   int result = (ic*30) + (a * 10) +(int)(b * 3);
///		 System.out.println(result);
///==================================================
///  //"" + 2 + 4 + 3= "243"
///			4*6 = String.valueof(24) +3 = "243"
///			String result = ( (int)Double.parseDouble(c)-a ) + String.valueOf(a) + (int)b;
										//6-4 = 2               + "4"       + 3
///			String result =  ""+ (a * (int)Double.parse.Double(c)) + (int)b;
///			System.out.println("\"" + result + "\"");		 
	//
	//6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
	//int x = 111;
	//int y = 13;
	//int result = _____;
	//System.out.println(result);
	//
	//1) 출력결과 : 7
	//2) 출력결과 : 8
	
		///	int result = x % y ; --- 7
	
		///	int result = x / y ; --- 8
	}
}