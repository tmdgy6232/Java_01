
public class Boolean_06 {

	public static void main(String[] args) {

		int Num1 = 10;
		int Num2 = 20;
		int Num3 = 30;
		int Num4 = 40;
		
		boolean bYes = true;
		
		// && : 관계연산자 and, 두개 이상의 비교연산 결과과 모드 true인가를 판단
		bYes = Num1 == Num2 && Num3 == Num4; //false & false 결과 : F
		bYes = Num1 == Num1 && Num3 == Num4; // true & false 결과 : f
		bYes = Num1 == Num2 && Num3 == Num3; // f and t 결과 F
		bYes = Num2 == Num2 && Num3 == Num3; // t and t 수술
		
		// || 두개 이상의 비교연산결과 중 한개라도 트루인지 확이ㅣㄴ
		// or 연산자
		
		bYes = Num1 == Num2 || Num3 == Num4; // F OR F 결과 : False
		bYes = Num1 == Num1 || Num3 == Num4; // t OR F 결과 : true
		bYes = Num1 == Num2 || Num3 == Num3; // F OR t 결과 : true
		bYes = Num1 == Num1 || Num3 == Num3; // t OR t 결과 : true
		
		// (false or true) and flase >> true and false = false
		bYes = (Num1 == Num1 || Num3 == Num3) && Num4 == Num3;
		System.out.println(bYes);
		
		Num4 = 3 +( 4*((5-2)%3));
		
		
		
	}

}
