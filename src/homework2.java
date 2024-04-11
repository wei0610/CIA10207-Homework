
public class homework2 {
	
	public static void main(String[] args) {
		   /* for */
		      int sum = 0;   
		      for (int count = 1; count <= 1000; count++)
		       if(count%2 == 0)
		            sum += count;
		      
		      System.out.println(sum);
		      
		      
		      System.out.println("----------------------------------------");
		      
		      int count, total;

		      total= 1;

		      for (count = 1;count <= 10; count++) {

		           total = total * count;

		           System.out.println(total);
		           
		      }
		      System.out.println("----------------------------------------");
		      int count1, total1;

		      total1= 1;
		      count1=1;

		      while(count1 <= 10) {

		           total1 = total1 * count1;
		           count1++;

		           System.out.println(total1);
		           
		      }
		      System.out.println("----------------------------------------");
		      int count2, total2;

		      total2= 0;
		      count2=1;

		      while(count2 <= 20) {

		           total2 = total2 + count2;
		           count2=2+count2;

		           System.out.println(total2);
		           
		      }
		      System.out.println("----------------------------------------");
		      
		      
		        int i2;
		  int count3=0;
		      
		  for (i2 = 1 ; i2 <= 49; i2++) {
		   
		   if (i2 %10 == 4 || i2/10 == 4) {
		       
		    continue;   
		   }
		   
		   count3++;
		        
		   System.out.println(i2 );
		   
		  }
		  
		  System.out.println( "總共有 = " + count3+"個");
		  
		  System.out.println("----------------------------------------");
		      
		      
		      int i, j, k;
		  
		  k=11;
		  
		  for (i = 0 ; i <= 10; i++) {
		   
		   for (j = 10; j >i ; j--)
		    
		    System.out.print( k-j+ "\t");
		   
		   System.out.println();
		   
		  }
		  
		  System.out.println("----------------------------------------");
		  
		  
		  int letter =65;
		  
		  for (int i1 = 0; i1 < 6; i1++) {
		   
		            for (int j2 = 0; j2 <= i1; j2++) {
		             
		                System.out.printf((char)(letter+i1)+" ");
		            }
		            
		           
		            System.out.println();
		  } 
		            
		        System.out.println("----------------------------------------");
		      
		  
		      
		      
		 }

}
