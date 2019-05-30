
public class Boolean_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 30;
		int intNum2 = 50;
		
		boolean bYes = true;
		
		// intNum1과 intNum2의 값이 같냐?
		bYes = intNum1 == intNum2;
		
		// intNum1의 값이 intNum2에 담긴 값보다 크냐? 
		bYes = intNum1 > intNum2;
		
		// intNum1의 값을 읽어 복사해서 intNum2에 대입
		// 변수가 변수에 저장되는것이 아니다.
        intNum2 = intNum1;
        
        bYes = intNum1 > intNum2; //false
        
        //intNum1이 intNum2랑 크거나 같냐
        bYes = intNum1 >== intNum2; //true
        
        // intNum1이 intNum2보다 작거나 같냐
        bYes = intNum1 <== intNum2; // true
        
        intNum1 = 100;
        
        bYes = intNum1 == intNum2;
        
        
        
		

	}

}
