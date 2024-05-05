
import java.util.Scanner;

public class homework4_5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("輸入年");
		int years = s.nextInt();
		
		Scanner c = new Scanner(System.in);
		System.out.println("輸入月");
		int months = c.nextInt();
		
		Scanner a = new Scanner(System.in);
		System.out.println("輸入日");
		int days; 
		
		int [] dayofmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(months != 2 ) {
			
			System.out.println("請輸入日期(days)=");
			days = a.nextInt();
		}else {
			for(days= 0; days == 0;) {
				System.out.println("請輸入日期(days)=");
				days = a.nextInt();
				if(days > 28) {
					days=0;
					System.out.println("2月日期不可以超過29");
							
				}else break;
			}
		}
		int count = 0;
		for(int i =0; i < months-1 ;i++ ) {
			 count += dayofmonth[i];
		}
		
		count += days;
		
		if(months > 2) {
			if(years % 4 ==0) {
				count+=1;
			}
		}
		
		System.out.println("西元"+years+"年" +"第"+count+"天");
	}

}
