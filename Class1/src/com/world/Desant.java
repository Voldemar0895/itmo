package com.world;

public class Desant {
	public String name;
	public int force;
	public int armor;
	public int health;

	
	public void setName(String name){
		this.name =name;
	}

	
	public void clich(){
		System.out.println("Alun-Adore");
	}
	public String getDescription(){
		return "We have" + force +  "force," + armor + "armor";
	}
	
}


