package com;
import com.world.Allience;
import com.world.Desant;
import com.world.Dgun;
import com.world.Ship;
public class Battle {
	public static void main(String[] args) {
	Allience damoh = new Allience();
	damoh.force= 20;
	damoh.armor= 20;
	damoh.health= 20;
	Ship deth = new Ship();
	deth.force = 10;
	deth.armor = 70;
	Desant asur = new Desant();
	asur.force= 40;
	asur.armor= 20;
	asur.health= 60;
	Dgun berta = new Dgun();
	berta.force= 100;
	berta.armor= 10;
	int  battle = damoh.force + deth.force- asur.armor -asur.health- berta.armor;
	int battle1 = asur.force+ deth.force - damoh.armor -damoh.health - deth.armor-berta.armor;
	if (battle> battle1)
	{
		System.out.println("Desant won");
				asur.clich();
	}
	else{
		if (battle==battle1)
		{
			System.out.println("Nobody won, only deth win always");
		}
		else
		{
			System.out.println("Defenders won");
			damoh.clich();
		}
	}
	
	
	
	

}
}
