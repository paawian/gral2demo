package gral2demo;

import mainboard.GraphicCardType;
import mainboard.Mainboard;

public class Main {

	public static void main(String[] args) {
		
		Mainboard gigabyte = new Mainboard(GraphicCardType.AGP, 1, 4);
		
		AgpGraphicCard nvidia = new AgpGraphicCard();
		nvidia.setDescription("Karta nvidia");
		
		HddDrive samsung = new HddDrive();
		samsung.setDescription("Dysk twardy Samsung");
		
		Ram kingston = new Ram();
		kingston.setDescription("2GB DDR3 1300MHz");
		
		gigabyte.installAgpGraphicCard(nvidia);
		gigabyte.installIdeDevice(samsung, 0);
		gigabyte.installRam(kingston, 0);
		
		
		
		System.out.print(gigabyte.getFullDescription());
		gigabyte.installIdeDevice(samsung, 0);
		
	}

}
