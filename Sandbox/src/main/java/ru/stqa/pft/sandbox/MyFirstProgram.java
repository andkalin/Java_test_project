package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main (String[] args){
	hello("Andrei");

	Square s = new Square(5);
		System.out.println("Площадь квадрата = " + s.area());

	Rectangle r = new Rectangle(5, 7);
		System.out.println("Площадь прямоугольника = " + r.area());
	}

	public static void hello(String somewords){
	System.out.println("Hello " + somewords + "!");
	}

}