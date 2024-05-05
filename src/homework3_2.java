import java.util.Scanner;

public class homework3_2 {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("開始猜數字吧!!");
		int j = s.nextInt();
			
		int i = (int)(Math.random()*100);
			
		while(i != j) {
			
			if (j > i) {			
				System.out.println("大於正確答案");			
			}	else if (j < i) {
				System.out.println("小於正確答案");
			}
			
			j = s.nextInt();
												
		}	   
		System.out.println("答對囉!");					
		}

}
