package geometry;

import java.util.*;

public class Quadrilateral{
	String name;
	double a,b,c,d,A,B,C,D;
	ArrayList<String> def = new ArrayList<String>();
	ArrayList<String> prop = new ArrayList<String>();

	public Quadrilateral(String name, double a,double b,double c,double d,double A,double B,double C,double D){
		this.name = name;
		this.a = a;
		this.b = b;
		this.c=c;
		this.d=d;
		this.A=A;
		this.B=B;
		this.C=C;
		this.D=D;
		def.add("A four sided figure ");
		prop.add("The sum of the angle measures is 360 degrees. ");
}

		public String Definition(){
			String definition = "The definiton of " + name + " is: " + def.toString();
			return definition;
		}

		public String properties(){
			String properties = "The properties of " + name + " are: " + prop.toString();
			return properties;
		}
}