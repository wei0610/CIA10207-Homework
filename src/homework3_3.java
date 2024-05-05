import java.util.Scanner;

public class homework3_3 {
	
public static void main(String[] args) {
		
		int[] num = new int [6];
		
		Scanner s = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭的數字");
		int i = s.nextInt();
		
		int j= (int)(Math.random()*50);
		
		int count=0;
							
		for (j = 1 ; j < 50; j++) {
			
			if (j %10 ==i  || j/10 == i) {
							
				continue;			
			}
			
			
			count++;					
			System.out.println(j);
			
		}
		
		System.out.println("總共有 = " + count+"個");
		
	}

}
