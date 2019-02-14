package geometry;

import java.util.*;

public class Rectangle extends Parallelogram{
	String name;
	double a,b,c,d,A,B,C,D;
	ArrayList<String> def = new ArrayList<String>();
	ArrayList<String> prop = new ArrayList<String>();

	public Rectangle(String name, double a,double b,double c,double d,double A,double B,double C,double D){
		super(name,a,b,c,d,A,B,C,D);
		this.name = super.name;
		this.a = super.a;
		this.b = super.b;
		this.c = super.c;
		this.d = super.d;
		this.A = super.A;
		this.B = super.B;
		this.C = super.C;
		this.D = super.D;
		super.def.remove(1);
		super.def.add("with four right angles. ");
		this.def = super.def;
		this.prop = super.prop;
	}

	public String Definition(){
		
		// make def and prop strings
		//remove Para def from def then add new
		String definition = "The definition of your "+ name + " is " + super.def;
		return definition;
	}
	
	public String properties(){
		String prop1 = " The non-base angles are supplemtary. ";
		String prop2 = " The perpendicular bisector of one base is the perpendicular bisector of the other. ";
		String prop3 = " The perpendicular bisectors of the sides are symmetry lines. ";
		String properties = "The properties of your " + name + " are " + prop + prop1 + prop2+ prop3 ;
		return properties;
	}
}
