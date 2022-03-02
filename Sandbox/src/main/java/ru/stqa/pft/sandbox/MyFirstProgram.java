package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main (String[] args){
	hello("Andrei");

	Square s = new Square(5);
		System.out.println("Площадь квадрата = " + area(s));

	Rectangle r = new Rectangle(5, 7);
		System.out.println("Площадь прямоугольника = " + area(r));
	}

	public static void hello(String somewords){
	System.out.println("Hello " + somewords + "!");
	}

	public static double area(Square s)
	{
		return s.l*s.l;
}

	public static double area(Rectangle r)
		{
			return r.a*r.b;
		}
}