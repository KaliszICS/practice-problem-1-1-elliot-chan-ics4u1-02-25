public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int sum2D(int[][] array) {
		int sum = 0;
		for(int row = 0; row < array.length; row++) {
			for(int column = 0; column < array[row].length; column++) {
				sum+=array[row][column];
			}
		}
		return sum;
	}
	public static int sumRow(int[][] array, int rowNum) {
		int sum = 0;
		for(int column = 0; column < array[rowNum].length; column++) {
			sum+=array[rowNum][column];
		}
		return sum;
	}
	public static int sumColumn(int[][] array, int columnNum) {
		int sum = 0;
		for(int row = 0; row < array.length; row++) {
					sum+=array[row][columnNum];
			
		}
		return sum;
	}
	
}