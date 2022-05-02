

import java.util.Scanner;

public class Coingame {


	private String nextln;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			while(true) {
				
			
			System.out.println("동전게임");
			System.out.println("숫자입력 1앞면,2뒷면");
			
			int num1 = Integer.parseInt(sc.next());
			int num2 = ((int)(Math.random()*2+1));
			
			if(num1==num2) {
				System.out.println("정답");
				System.out.println("다시 시작");
			}
			else {
				System.out.println("땡!!");
				System.out.println("다시 시작");
			}
	}

	}
	}
