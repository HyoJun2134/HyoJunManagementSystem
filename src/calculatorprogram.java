import java.util.Scanner;

public class calculatorprogram {

	public static void main(String[] args) {
		Scanner sc;
        sc = new Scanner(System.in);
        float num1;    //�Ǽ�
        float num2;
        String oper; //����
        String con;
        boolean a; //����
        
        do{
            System.out.print("���� : ");
            num1 = sc.nextFloat();
            a = true; //a�� �����ϰ��
            do {
                System.out.print("������ : "); //�����ڸ� ���´�
                oper = sc.next();
                
                switch(oper) {
                    case "+":  //+�� �־����� ������ ��� �ƴϸ� ���� -��
                        a=false;
                        break;
                    case "-": //-�� �־����� ������ ��� �ƴϸ� ���� *��
                        a=false;
                        break;
                    case "*":  //*�� �־����� ������ ��� �ƴϸ� ���� /��
                        a=false;
                        break;
                    case "/":  // (/)�� �־����� ������ ��� �ƴϸ� ���� -��
                        a=false;
                        break;
                    default:
                        System.out.print("�ٽ� �Է��Ͻÿ� \n ");                
                    }                
                }while(a);
                
            System.out.print("���� �Է� : ");
            num2 = sc.nextFloat();
            
            switch(oper) { // �����ڸ� �־�� �ϱ� ������ operator�� �ֽ��ϴ�
            case "+":
                System.out.println(num1+num2); //+�Ͻ� ���� + ����
                break;
            case "-":
                System.out.println(num1-num2); //-�Ͻ� ���� - ����
                break;
            case "*":
                System.out.println(num1*num2); //*�Ͻ� ���� * ����
                break;
            case "/":
                System.out.println(num1/num2); // (/)�Ͻ� ���� / ����
                break;
                        
            }
        
            System.out.print("����� ����ϱ� ���ҽ� Y�� �Է��� �ּ��� ");
            con = sc.next();
            if( con.equals("Y") ){ //Y�� ������ ���ν��� 
                continue;
                }
                else{
                    System.out.println("����!."); //�ٸ�Ű�� ������ ����!�˴ϴ�
                    break;
                }    
            }while(true);

	}

}
