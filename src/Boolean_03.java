
public class Boolean_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 30;
		int intNum2 = 50;
		
		boolean bYes = true;
		
		// intNum1�� intNum2�� ���� ����?
		bYes = intNum1 == intNum2;
		
		// intNum1�� ���� intNum2�� ��� ������ ũ��? 
		bYes = intNum1 > intNum2;
		
		// intNum1�� ���� �о� �����ؼ� intNum2�� ����
		// ������ ������ ����Ǵ°��� �ƴϴ�.
        intNum2 = intNum1;
        
        bYes = intNum1 > intNum2; //false
        
        //intNum1�� intNum2�� ũ�ų� ����
        bYes = intNum1 >== intNum2; //true
        
        // intNum1�� intNum2���� �۰ų� ����
        bYes = intNum1 <== intNum2; // true
        
        intNum1 = 100;
        
        bYes = intNum1 == intNum2;
        
        
        
		

	}

}