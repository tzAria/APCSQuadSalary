package geometry;

import java.util.*;

public class Parallelogram extends Quadrilateral{
	String name;
	double a,b,c,d,A,B,C,D;


	public Parallelogram(String name, double a,double b,double c,double d,double A,double B,double C,double D){
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
	  def.add(" with both sets of opposite sides parallel. ");
	  prop.add(" Consecutive angles between a pair of parallel sides are supplementary. ");
	  prop.add(" Both sets of opposite sides are congruent. ");
	  prop.add(" Both pair of opposite angles are congruent. ");
	  prop.add(" The diagonals bisect each other. ");
	  prop.add(" One pair of opposite sides are both parallel and congruent. ");
	}
	
	public String Definition(){
	
	// make def and prop strings
	String definition = "The definition of your " + name + " is " + def;
	return definition;
	}
	
	public String properties(){
	String properties = "The properties of your " + name + " are " + prop;
	return properties;
	}
}
