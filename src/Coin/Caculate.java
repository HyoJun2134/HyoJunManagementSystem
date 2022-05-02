package Coin;

public class Caculate {

	public static void main(String[] args) {
		Caculate ca = new Caculate();
		int[][]a= {{1,0,2},{-1,3,1}}; //a열
		int[][]b= {{3,1},{2,1},{1,0}}; //b열
		
		//원리 A(abc)			B(gh)      C(ag+bi+ck  ah+bj+cl)
		//     (def)		 (ij)		(dg+ei+fk  dh+ej+fl)
		//					 (kl)
		System.out.println("행열의 곱셈:" + ca.caculate(a,b)); // 오류뜨는데 왜뜨는지 모르겠어요

	}

	public int[][] caculate(int[][] a, int[][] b) {
		int[][] answer = new int[a.length][b[0].length];
		
		for(int i=0; i<answer.length;i++) {
			for(int j=0; j<answer[0].length ;j++) {
				for(int k=0; k<a[0].length;k++) {
					answer[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0; i<answer.length;i++) {
			for(int j=0; j<answer[i].length;j++) {
				System.out.println(answer[i][j]+" ");
			
				}
			System.out.println();
			}
		return answer;
	}
}
