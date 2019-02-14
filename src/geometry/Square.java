package geometry;

import java.util.*;

public class Square extends Rectangle{
	String name;
	double a,b,c,d,A,B,C,D;
	ArrayList<String> def = new ArrayList<String>();
	ArrayList<String> prop = new ArrayList<String>();

	public Square(String name, double a,double b,double c,double d,double A,double B,double C,double D){
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
		def.add(" and four congruent sides. ");
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
		String prop4 = "It is a \"Regular\" quadrilateral. ";
		String prop5 = " You can use Kite symmetry theorem.";
		String prop6 = " You can use Kite diagonal theorem.";
		String prop7 = " The diagonals are congruent. ";
		String properties = "The properties of your " + name + " are " + super.prop + prop1 + prop2+ prop3+ prop4 + prop5 + prop6 + prop7;
		return properties;
	}
}
