

import java.util.Scanner;

public class Coingame {


	private String nextln;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			while(true) {
				
			
			System.out.println("��������");
			System.out.println("�����Է� 1�ո�,2�޸�");
			
			int num1 = Integer.parseInt(sc.next());
			int num2 = ((int)(Math.random()*2+1));
			
			if(num1==num2) {
				System.out.println("����");
				System.out.println("�ٽ� ����");
			}
			else {
				System.out.println("��!!");
				System.out.println("�ٽ� ����");
			}
	}

	}
	}
