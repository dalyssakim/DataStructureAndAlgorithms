
public class Question1_1 {

	 /*
	 * Determine if a string has all unique characters.
	 * What if there is no additional Data Structure?
	 */
	static char charMap[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charMap = new char[128];
		String s = "adjoedjlsjwodneosmaowj";
		for(int i = 0; i < s.length(); i++){
			if(put(s.charAt(i))){
				
			}
			else System.out.println("i = "+i);
		}
		
	}
	
	public static boolean put(char c){
		if(charMap[c/1] != 0){
			System.out.println("Collision : " + c );
			return false;
		}else{
			charMap[c/1] = c;
			return true;
		}
	}
	
	public static boolean isAllUnique(String S){
		for(int i = 0; i < S.length()-1; i++){
			String temp = S.substring(i+1);
				if(temp.contains(S.subSequence(i, i+1))){ 
					System.out.println("S[i] : "+(S.subSequence(i, i+1)+"")+" , SubSequence : "+temp);
					return false;
				}
		}
		System.out.println("S : "+S+" , ALL UNIQUE!");
		
		return true;
	}
	
	

}
