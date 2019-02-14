package geometry;

import java.util.*;

public class Rhombus extends Parallelogram{
	String name;
	double a,b,c,d,A,B,C,D;
	ArrayList<String> def = new ArrayList<String>();
	ArrayList<String> prop = new ArrayList<String>();

	public Rhombus(String name, double a,double b,double c,double d,double A,double B,double C,double D){
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
		super.def.add(" with all four sides congruent. ");
	}

	public String Definition(){
		String definition = "The definition of your "+ name + " is " + super.def;
		return definition;
	}

	public String properties(){
		String prop1 = " You can use Kite symmetry theorem.";
		String prop2 = " You can use Kite diagonal theorem. ";
		String prop3 = " Each diagonal is the perpendicular bisector of the other. ";
		String properties = "The properties of your " + name + " are " + super.prop + prop1 + prop2+ prop3 ;
		return properties;
	}
}

