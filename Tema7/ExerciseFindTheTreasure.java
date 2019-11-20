package tema7;
import java.util.Scanner;
public class ExerciseFindTheTreasure {
	public static void main(String[] args) {
		int[][] map = new int[3][3];
		int tesoroX = (int) (Math.random() * 3);
		int tesoroY = (int) (Math.random() * 3);
		int bombaX = (int) (Math.random() * 3);
		int bombaY = (int) (Math.random() * 3);
		int game = 1;
		while (tesoroX == bombaX && tesoroY == bombaY) {
			 tesoroX = (int) (Math.random() * 3);
			 tesoroY = (int) (Math.random() * 3);
			 bombaX = (int) (Math.random() * 3);
			 bombaY = (int) (Math.random() * 3);
		}
		System.out.println("Find the tresasure!");
		int rowCounter = 0;
		int columnCounter = 0;
		int posX = 99;
		int posY = 99;
		boolean canAttempt = false;
		Scanner rowParser = new Scanner(System.in);
		Scanner columnParser = new Scanner(System.in);
		do {
		while (rowCounter < map.length) {
			System.out.print("Fila : " + rowCounter + " ");
			while (columnCounter < map[rowCounter].length) {
				if (posX == tesoroX && posY == tesoroY && canAttempt) {
					System.out.println("You win!");
					game = 0;
					System.exit(0);
				}
				if (posX == bombaX && posY == bombaY && canAttempt) {
					System.out.println("You lose!");
					game = 0;
					System.exit(0);
				}
				if (map[rowCounter][columnCounter] == 89) {
					System.out.print("X");
				} else {
					System.out.print(" ");	
				}
				columnCounter++;
			}
			System.out.println("");
			columnCounter = 0;
			rowCounter++;
		}
		rowCounter = 0;
		columnCounter = 0;
		canAttempt = true;
		if (((posY-1 == bombaY || posY == bombaY || posY + 1 == bombaY) && (posX-1 == bombaX || posX == bombaX || posX+1 == bombaX)) && !(posX != bombaX && posY != bombaY)) {
			System.out.println("Be careful, for there is a bomb nearby!");
		}
		System.out.println("Input position for 'y'");
		 posY = columnParser.nextInt();
		System.out.println("Input position for 'x'");
		 posX = rowParser.nextInt();
		 map[posY][posX] = 89;
		} while (game != 0);
	}
	}

