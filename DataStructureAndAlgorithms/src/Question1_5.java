
public class Question1_5 {
	
	public static String compressString(String str){
		char [] words = str.toCharArray();
		StringBuffer sentence = new StringBuffer();
		int count = 1;
		for( int i = 0; i < str.length() - 1; i++){
			if( words[i] == words[i+1] ){
				count++;
			}else {
				sentence.append(words[i]);
				sentence.append(count);
				count = 1;
			}
			
			if( i + 1 == str.length() - 1){
				sentence.append(words[i+1]);
				sentence.append(count);
			}
			
		}
		
		if( sentence.length() >= str.length() ){
			return str;
		}
		return sentence.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compressString("aaaaaaaaaaaaabc"));
	}
}
