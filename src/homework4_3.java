
public class homework4_3 {
	
	public static void main(String[] args) {
		
		String[] w3 = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		int aeiou=0;
		
		for(int i =0 ; i < w3.length; i++) {
			for(int j =0; j<w3[i].length();j++) {
				switch (w3[i].charAt(j)) {
				case'a' :
					aeiou = aeiou +1;
					break;
				case'e' :
					aeiou = aeiou +1;
					break;
				case'i' :
					aeiou = aeiou +1;
					break;
				case'o' :
					aeiou = aeiou +1;
					break;
				case'u' :
					aeiou = aeiou +1;
					break;
				
				}
			}
			
			
		}
		
		System.out.println("八大行星裡面有"+aeiou+"個母音");
		

}
}