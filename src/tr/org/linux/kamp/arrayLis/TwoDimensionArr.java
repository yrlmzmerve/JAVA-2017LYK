package tr.org.linux.kamp.arrayLis;

public class TwoDimensionArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] board = new int[4][3];
		int counter=0;
		for(int k=0; k<board.length; k++) {
			for(int j=0; j<board[k].length; j++) {
				
				board[k][j]= counter;
				counter++;
				
			}
		}
		
		for(int j=0; j<board.length; j++) {
			for(int k=0; k<board[k].length; k++) {
				
				System.out.print(board[j][k]+" ");
				counter++;
			}
			System.out.println();
		}

	}

}
