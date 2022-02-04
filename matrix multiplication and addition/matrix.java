import java.util.Scanner;

public class matrix {
	Scanner scanner = new Scanner(System.in);
	int row1;
	int row2;
	int col1;
	int col2;
	int[][] matrix1;
	int[][] matrix2;
	void getRows() {
		System.out.print("Enter the number of rows for the first matrix: ");
		row1 = scanner.nextInt();
		
		System.out.print("Enter the number of rows for the second matrix: ");
		row2 = scanner.nextInt();
	}
	void getCols() {
		System.out.print("Enter the number of cols for the first matrix: ");
		col1 = scanner.nextInt();
		matrix1 = new int[row1][col1];
		
		System.out.print("Enter the number of cols for the second matrix: ");
		col2 = scanner.nextInt();
		matrix2 = new int[row2][col2];
	}
	void getValues() {
		System.out.println("First matrix: ");
		for(int i =0; i<row1; i++) {
			for(int j =0; j<col1; j++) {
				System.out.print("Enter an integer: ");
				matrix1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Second matrix: ");
		for(int i =0; i<row2 ; i++) {
			for(int j =0; j<col2; j++) {
				System.out.print("Enter an integer: ");
				matrix2[i][j] = scanner.nextInt();
			}
		}
	}
	void printValues() {
		System.out.println("First matrix: ");
		for(int i =0; i<row1; i++) {
			for(int j =0 ; j<col1; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("Second matrix: ");
		for(int i =0; i < row2; i++) {
			for(int j = 0; j<col2; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println("");
		}
	}
	void addMatrices() {
		System.out.println("Addition: ");
		if((row1 == row2) && (col1 == col2)) {
			for(int i =0; i<row1; i++) {
				for(int j =0; j<col2; j++) {
					System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
				}
				System.out.println("");
			}
		}
		else {
			System.out.println("The matrices cannot be added.");
		}
	}
	void multiplyMatrices() {
		int sum =0;
		
		System.out.println("Multiplication: ");
		 if(col1 == row2) {
			 for(int i =0; i<row1; i++) {
				 for(int j =0; j<col2; j++) {
					 for(int k =0; k<col1;k++) {
						 sum = (matrix1[i][k] * matrix2[k][j]) + sum;
					 }
					 System.out.print(sum + " ");
					 sum =0;
				 }
				 System.out.println("");
			 }
		 }
		 else if(col2 == row1) {
			 for(int i =0; i<row2; i++) {
				 for(int j =0; j<col1; j++) {
					 for(int k =0; k<col2;k++) {
						 sum = (matrix1[k][j] * matrix2[i][k]) + sum;
					 }
					 System.out.print(sum + " ");
					 sum =0;
				 }
				 System.out.println("");
			 }
		 }
		 else {
			 System.out.println("The matrices cannot be multiplied.");
		 }
	}
	
}
