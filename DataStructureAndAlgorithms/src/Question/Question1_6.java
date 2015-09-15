package Question;

public class Question1_6 {
	/*
	 * Cracking the Coding Interview Question 1.6
	 */
	
	static int image[][] = {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
	static int maxRow = 3;
	static int maxCol = 3;
	public static int[][] rotate90(int[][] img){
		int [][] rotatedImg = { { 0, 0, 0 }, {0, 0, 0}, {0, 0, 0}};
		int row = 0;
		int col = 0;
		
		for(row = 0; row < maxRow; row++){
			for(col = 0; col < maxCol; col++){
				rotatedImg[col][maxRow-(row+1)] = img[row][col];
			}
		}
		
		return rotatedImg;
	}
	
	
}
