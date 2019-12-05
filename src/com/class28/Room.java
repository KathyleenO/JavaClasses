package com.class28;

public class Room extends Building {

	int roomNumber;
	
	Room(String str, int floo, int roomNumber){
		super(floo,  str);
		this.roomNumber=roomNumber;
	}
	
public void print() {
	System.out.println(adress+ " " +floor+ " " +roomNumber);
}
	public static void main(String[] args) {
		Room room=new Room("121 Test Driver", 10, 101);
		room.print();	
		
		
		
		
	}
	
	
	
}
