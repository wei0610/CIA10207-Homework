import java.util.Scanner;

public class homework3_1 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		  
		  //輸入三角形三邊長
		  System.out.println("請輸入三角形的第一個邊長");
		  double a = input.nextDouble();
		  System.out.println("請輸入三角形的第二個邊長");
		  double b = input.nextDouble();
		  System.out.println("請輸入三角形的第三個邊長");
		  double c = input.nextDouble();
		  
		  //判斷三角形種類
		  if(a + b <= c || a + c <= b || c + b <= a )
		  {
		   System.out.println("輸入三邊長，無法構成三角形");
		  }
		  else if(a == b && b == c && c == a)
		  {
		   System.out.println("正三角形");
		  }
		  else if(a == b || b == c || c == a)
		  {
		   System.out.println("等腰三角形");
		  }
		  else if((a*a) +(b*b) == (c*c))
		  {
		   System.out.println("直角三角形");
		  }
		  else
		  {
		   System.out.println("不規則三角形");
        }
		  
		  System.out.println("----------------------------------------");
		
	}

}
