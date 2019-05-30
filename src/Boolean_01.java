
public class Boolean_01 {

	public static void main(String[] args) {

		boolean bYes = true;
		boolean bNo = false;
		
		
		// boolean에서는 (+,1 :operator)를 사용할 수 없다.
		//bYes = bYes + true;
		
		// (==) 같냐라고 물어보는 것, 비교연산자
		bYes = 1 == 2;
		System.out.println(bYes);
		
		//1.eq(=)기호를 중심으로 항상 오른쪽이 먼저 명령 실행
		// 2. ==와 "연산기호는 연산순서가 -가 먼저 연산실행이 된다.
		//3. 결국 2-1이 계산되어 결과가 1위되고
		//4. 1과 1의 같냐라고 물어본다.
		
		bYes = 1 == 2-1;
		System.out.println(bYes);
		
		
		
	}

}
