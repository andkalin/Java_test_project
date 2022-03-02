package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main (String[] args){
	hello("Andrei");

	double l = 5;
		System.out.println("Площадь квадрата = " + area(l));

double c = 5;
double a = 7;
		System.out.println("Площадь прямоугольника + " + area(c, a));
	}
public static void hello(String somewords){
	System.out.println("Hello " + somewords + "!");
}
public static double area(double l)
{
	return l*l;
}

	public static double area(double l, double a)
	{
		return l*a;
	}
}