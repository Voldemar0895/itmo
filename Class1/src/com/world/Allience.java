package com.world;

public class Allience {

	public String name;
	public int force;
	public int armor;
	public int health;
	public int cvehicle;
	public String vehicle;
	
	public void setName(String name){
		this.name =name;
	}
	public void setVehicle(String vehicle){
		this.vehicle = vehicle;
		
	}
	public void setForce(int force){
		this.force = force;
	}
	public void clich(){
		System.out.println("Loktar ogar");
	}
	public String getDescription(){
		return "We have" + force +  "force," + armor + "armor," + cvehicle  +" "+ vehicle ;
	}
	
}
