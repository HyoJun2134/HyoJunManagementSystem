
public class secondsTest {

	public static void main(String[] args) {
		int s1, s2, m, h, h2, d, d2, y ;
		s1 =100000; // 10만초
		d= s1/(24*60*60); // 10만초에서 (/는 나누어진 몫이나옴)/24시간*60분*60초하면 일수가 나옴
	    d2= s1%(24*60*60); //(%는 나머지가 나옴) 위에것처럼하게되면 나머지시간이 나옴
	    h= d2/(60*60); // 시간이 나옴
	    h2=d2%(60*60); // 나머지 분이나옴
	    m=h2/(60); // 분이나옴
	   s2= h2/(60); // 나머지초가나옴
	   y= (365*24*60*60);// 1년 초산법
	   System.out.println(d+"일"+h+"시간"+m+"분"+s2+"초");
	   
	   if(s1<y) {
		   System.out.println("1년보다 작음");}// 1년보다 작을시
	   else if(s1>y){
		   System.out.println("1년보다 큼");}// 1년보다 클시
	}

}
