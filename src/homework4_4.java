
import java.util.Scanner;

public class homework4_4 {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("輸入要借的金額");
		int i = s.nextInt();
		System.out.println("有錢可以借的員工編號");
		int count = 0;
		int[][] w4 = {
				{25, 32, 8, 19, 27},
		        {2500, 800, 500, 1000, 1200}
		};
		
		
		for(int j =0; j < w4[1].length; j++) {
			
			if(i <=w4[1][j]) {
				count ++;
				System.out.print(w4[0][j]+" ");
			}
	
					
					
				}
			
		System.out.println("共"+count +"人");
		
		
		
		
		
		
	}

}
