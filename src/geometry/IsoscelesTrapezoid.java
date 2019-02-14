package geometry;

import java.util.*;

public class IsoscelesTrapezoid extends Trapezoid{
	String name;
	double a,b,c,d,A,B,C,D;
	ArrayList<String> def = new ArrayList<String>();
	ArrayList<String> prop = new ArrayList<String>();

	public IsoscelesTrapezoid(String name, double a,double b,double c,double d,double A,double B,double C,double D){
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
	  
	}
	
	public String Definition(){
	  String definition = "The definition of your " + name + " is " + super.def + " and the other set of opposite sides congruent.";
	  return definition;
	}
	
	public String properties() {
	  String prop1 = " The perpendicular bisector of one base is the perpendicular bisector of the other base and a symmetry line. ";
	  String prop2 = " The base angles are congruent.";
	  String prop3 = "The non-base angles are supplementary. ";
	  String prop7 = "The diagonals are congruent. ";
	  String properties = "The properties of your " + name + " are " + super.prop + prop2 + prop1 + prop3;
	  return properties;
	  }
}
