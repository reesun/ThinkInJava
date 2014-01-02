package HodingObjects;

import java.util.ArrayList;

public class Gerbil {
	private static long counter;
	private final long gerbilNumber = counter++;
	
	public void hop() {
		System.out.println(gerbilNumber +":  I am jumping");
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		
		for(int i = 0; i < 3; i++){
			gerbils.add(new Gerbil());
		}
		
		for(Gerbil g:gerbils){
			g.hop();
		}
	}

}
