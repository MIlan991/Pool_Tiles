package cubes;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// TILES SURFACE
		double grayTilesSurface1 = 0.01;
		double grayTilesSurface2 = 0.015;
		double blackTilesSurface = 0.015;

		// TILES PRICE
		int grayTilesPrice1 = 1;
		int grayTilesPrice2 = 2;
		int blackTilesPrice = 2;
		
		// TILES INFO
		int tilesPrice = 0;
		double tilesSurface = 0;
		
		// POOL DIMENSOINS INFO
		double width;
		double length;
		double height;
		
		int chosenTiles;
		
		boolean startChoosingTiles = true;
		// CHOSE TILES OUTPUT
		do {do {
			System.out.println("Chose tiles you want:");
			System.out.println("1. Gray Tiles 10*10 cm - 1$");
			System.out.println("2. Gray Tiles 10*15 cm - 2$");
			System.out.println("3. Black Tiles 10*15 cm - 2$");
			
			chosenTiles = scanner.nextInt();
			
		}while((chosenTiles > 3) || (chosenTiles < 1) && (startChoosingTiles = true));
			
		// CHOSEN TILES OUTPUT
		if(chosenTiles == 1) {
			tilesPrice = grayTilesPrice1;
			tilesSurface = grayTilesSurface1;
			startChoosingTiles = false;
			System.out.println("You chose: 1. Gray Tiles 10*10 cm - " + (grayTilesPrice1) + "$");
		}else if(chosenTiles == 2) {
			tilesPrice = grayTilesPrice2;
			tilesSurface = grayTilesSurface2;
			startChoosingTiles = false;
			System.out.println("You chose: 2. Gray Tiles 10*15 cm - " + (grayTilesPrice2) + "$");
		}else if(chosenTiles == 3) {
			tilesPrice = blackTilesPrice;
			tilesSurface = blackTilesSurface;
			startChoosingTiles = false;
			System.out.println("You chose: 3. Black Tiles 10*15 cm - " + (blackTilesPrice) + "$");
		}else{
			System.out.print("Please, chose between 1 and 3");
		}
		
		System.out.println("-----------------------------------------------------");
			
		// DIMENSIONS OF POOL
		System.out.print("Please enter the width of the pool in meters: ");
		width = scanner.nextDouble();
		System.out.print("Please enter the length of the pool in meters: ");
		length = scanner.nextDouble();
		System.out.print("Please enter the height of the pool in meters: ");
		height = scanner.nextDouble();

		// DIMENSION OUTPUT
		System.out.println("Width: " + width + "m");
		System.out.println("Length: " + length + "m");
		System.out.println("Height: " + height + "m");
		
		System.out.println("-----------------------------------------------------");
		
		// TOTAL PIECES OF TILES CALCULATOR
		double totalSurface;
		totalSurface = width * length + 2*width*height + 2*length*height;
		System.out.println("Total Surface: " + totalSurface + "m2.");

		double totalPiecesOfTiles = totalSurface / tilesSurface;
		System.out.println("Total tiles requier for this pool is: " + totalPiecesOfTiles + " pieces.");
		
		// TOTAL PRICE CALCULATOR
		double totalPrice = tilesPrice * totalPiecesOfTiles;
		
		// TOTAL PRICE OUTPUT
		System.out.println("-----------------------------------------------------");
		System.out.println("TOTAL PRICE: " + totalPrice + "$");
		System.out.println("-----------------------------------------------------");
		
		// CHOSE AGAIN OR EXIT
		int choiceAtTheEnd;
		System.out.println("Do you whant to chose again or exit?");
		System.out.println("1 - Chose again");
		System.out.println("2 - Exit program");
		
		choiceAtTheEnd = scanner.nextInt();
		if(choiceAtTheEnd == 1) {
			startChoosingTiles = true;
		} else if(choiceAtTheEnd == 2) {
			System.out.print("End of code!");

		}}
		while(startChoosingTiles == true);
		
		scanner.close();

	}

}
