import java.util.Random;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] table = {"1","2","3","4","5","6","7","8","9"};
	int tile_number;
	int length = table.length;
	int ending_condition = 0;
	
	int player;
	int i =0;
	for(int k =0; k<length; k++) {
		System.out.print(table[k] + " ");
		if((k+1) % 3 == 0) {
			System.out.println();
		}
	}
	while( i<(length/2)+1) {
			
				System.out.print("Player1 enter the tile number: ");
				tile_number = scanner.nextInt();
				while(table[tile_number-1] == "O") {
					System.out.print("Player1 enter the tile number and do not override the tiles: ");
					tile_number = scanner.nextInt();
				}
				for(int j = 0; j<length; j++) {
					if(tile_number == j+1) {
						table[j] = "X";
					}
					System.out.print(table[j] + " ");
					if((j+1)%3 == 0) {
						System.out.println("");
					}
				}
				if(Check1(table, ending_condition) == 1) {
					ending_condition =1;
					System.out.println("Player1 won!");
					break;
				}
				
				if(i ==4) {
					break;
				}
				
				System.out.print("Player2 enter the tile number: ");
				tile_number = scanner.nextInt();
				while(table[tile_number-1] == "X") {
					System.out.print("Player2 enter the tile number and do not override the tiles: ");
					tile_number = scanner.nextInt();
				}
				for(int j =0; j<length;j++) {
					if(tile_number == j+1) {
						table[j] = "O";
					}
					System.out.print(table[j] + " ");
					if((j+1)%3 == 0) {
						System.out.println("");
					}
				}
				if(Check2(table, ending_condition) ==1) {
					ending_condition = 1;
					System.out.println("Player2 won!");
					break;
				}
				i++;
		}
	if(ending_condition == 0) {
		System.out.println("The match is a tie!");
	}
	
	}
	static int Check1(String[] table , int ending_condition) {
		if(table[0].equals("X")  && table[1].equals("X") && table[2].equals("X")) {
			ending_condition = 1;
			
		}
		else if(table[3].equals("X")  && table[4].equals("X") && table[5].equals("X")) {
			ending_condition = 1;
			
		}
		else if(table[6].equals("X")  && table[7].equals("X") && table[8].equals("X")) {
			ending_condition = 1;
			
		}
		else if(table[0].equals("X")  && table[3].equals("X") && table[6].equals("X")) {
			ending_condition = 1;
			
		}
		else if(table[1].equals("X")  && table[4].equals("X") && table[7].equals("X")) {
			ending_condition = 1;
			
		}
		else if(table[2].equals("X")  && table[5].equals("X") && table[8].equals("X")) {
			ending_condition = 1;
			
		}
		else if(table[0].equals("X") && table[4].equals("X") && table[8].equals("X")) {
			ending_condition =1;
		}
		else if(table[2].equals("X") && table[4].equals("X") && table[6].equals("X")) {
			ending_condition =1;
		}
		
		return ending_condition;
	}
	static int Check2(String[] table, int ending_condition) {
		if(table[0].equals("O")  && table[1].equals("O") && table[2].equals("O")) {
			ending_condition = 1;
			
			
		}
		else if(table[3].equals("O")  && table[4].equals("O") && table[5].equals("O")) {
			ending_condition = 1;
			
		}
		else if(table[6].equals("O")  && table[7].equals("O") && table[8].equals("O")) {
			ending_condition = 1;
			
		}
		else if(table[0].equals("O")  && table[3].equals("O") && table[6].equals("O")) {
			ending_condition = 1;
			
		}
		else if(table[1].equals("O")  && table[4].equals("O") && table[7].equals("O")) {
			ending_condition = 1;
			
		}
		else if(table[2].equals("O")  && table[5].equals("O") && table[8].equals("O")) {
			ending_condition = 1;
			
		}
		else if(table[0].equals("O") && table[4].equals("O") && table[8].equals("O")) {
			ending_condition =1;
		}
		else if(table[2].equals("O") && table[4].equals("O") && table[6].equals("O")) {
			ending_condition =1;
		}
		return ending_condition;
	}


}