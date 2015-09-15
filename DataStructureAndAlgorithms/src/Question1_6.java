
public class Question1_6 {
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(image[0][0]+":"+image[0][1]+":"+image[0][2]);
		System.out.println(image[1][0]+":"+image[1][1]+":"+image[1][2]);
		System.out.println(image[2][0]+":"+image[2][1]+":"+image[2][2]);
		System.out.println("---------------");
		int [][] rotatedImg = rotate90(image);
		System.out.println(rotatedImg[0][0]+":"+rotatedImg[0][1]+":"+rotatedImg[0][2]);
		System.out.println(rotatedImg[1][0]+":"+rotatedImg[1][1]+":"+rotatedImg[1][2]);
		System.out.println(rotatedImg[2][0]+":"+rotatedImg[2][1]+":"+rotatedImg[2][2]);
	}
}
