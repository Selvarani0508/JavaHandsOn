package com.java.Abstraction;

interface Drawable {
	void draw();
}

 
class Rectangles implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}

//Using interface
class InterfaceEx {
public static void main(String args[]){  
Drawable d=new Rectangles();  
d.draw();  
}
}

