
public class homework1 {

	public static void main(String[] args) {
        int num1=12 ,  num2=6;

        System.out.println(num1+num2);
        System.out.println(num1*num2);
        System.out.println("----------------------------------------");
        int num3=200/12;
        int num4=200%12;

        System.out.println(num3+"打"+num4+"顆");
        
        System.out.println("----------------------------------------");
        
        int num5=256559/86400;
        int num6=256559%86400/3600;
        int num7=256559%86400%3600/60;
        int num8=256559%86400%3600%60;

        System.out.println(num5+"天"+num6+"小時"+num7+"分"+num8+"秒");
        
        System.out.println("----------------------------------------");
        
        final double P1=3.1415;
        
        System.out.println("圓面積="+P1*5*5+"圓周長="+P1*10); 

        System.out.println("----------------------------------------");
        int p=1500000;
        double r=0.02;
        int n =10;
        for (int i=1; i<= n;i++) {
            int m1=(int)(p* Math.pow(1+r,i));

            System.out.println(m1);

        }

        System.out.println("----------------------------------------");


        System.out.println(5+5);    // 5+5=10 單純+法
        System.out.println(5+'5');  //5+'5'=58  '5'=U+0035=53 '5'=字元 
        System.out.println(5+"5");  //5+"5" = 55 變成字串
        
	}
	
	
}
