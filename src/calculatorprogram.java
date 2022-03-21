import java.util.Scanner;

public class calculatorprogram {

	public static void main(String[] args) {
		Scanner sc;
        sc = new Scanner(System.in);
        float num1;    //실수
        float num2;
        String oper; //문자
        String con;
        boolean a; //논리값
        
        do{
            System.out.print("숫자 : ");
            num1 = sc.nextFloat();
            a = true; //a가 숫자일경우
            do {
                System.out.print("연산자 : "); //연산자를 적는다
                oper = sc.next();
                
                switch(oper) {
                    case "+":  //+를 넣었을시 옳으면 계속 아니면 다음 -로
                        a=false;
                        break;
                    case "-": //-를 넣었을시 옳으면 계속 아니면 다음 *로
                        a=false;
                        break;
                    case "*":  //*를 넣었을시 옳으면 계속 아니면 다음 /로
                        a=false;
                        break;
                    case "/":  // (/)를 넣었을시 옳으면 계속 아니면 다음 -로
                        a=false;
                        break;
                    default:
                        System.out.print("다시 입력하시오 \n ");                
                    }                
                }while(a);
                
            System.out.print("숫자 입력 : ");
            num2 = sc.nextFloat();
            
            switch(oper) { // 연산자를 넣어야 하기 때문에 operator을 넣습니다
            case "+":
                System.out.println(num1+num2); //+일시 숫자 + 숫자
                break;
            case "-":
                System.out.println(num1-num2); //-일시 숫자 - 숫자
                break;
            case "*":
                System.out.println(num1*num2); //*일시 숫자 * 숫자
                break;
            case "/":
                System.out.println(num1/num2); // (/)일시 숫자 / 숫자
                break;
                        
            }
        
            System.out.print("계산을 계속하길 원할시 Y를 입력해 주세요 ");
            con = sc.next();
            if( con.equals("Y") ){ //Y를 누르면 새로시작 
                continue;
                }
                else{
                    System.out.println("종료!."); //다른키를 누르면 종료!됩니다
                    break;
                }    
            }while(true);

	}

}
