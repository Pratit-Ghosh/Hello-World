import java.util.*;
public class Method {
	static int year, day;
	public void years(int x){
		year = x/(365*24*60);
		x = x%(365*24*60);
		day = (int) Math.ceil(x/(24*60));
	}
	public static void main(String[] args){
		Method ob= new Method();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter minutes:");
		int minutes = sc.nextInt();
		ob.years(minutes);
		System.out.println("Approximately "+year+" years and "+day+" days.");
	}
}
