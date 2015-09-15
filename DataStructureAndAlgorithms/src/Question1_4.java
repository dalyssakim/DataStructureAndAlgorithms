
public class Question1_4 {
	
	public static String convertBlank(String s, int length){
		StringBuffer sentence = new StringBuffer();
		char [] words = s.toCharArray();
		int i = 0;
		for( char w : words )
		{
			if( i == length ) break;
			if( w == ' ' ){
				sentence.append("%20");
			}else {
				sentence.append(w);
			}
			
			i++;
		}
		
		return sentence.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertBlank("Mr John Smith  ", 13));
	}
}
