package geometry;
import java.util.*;

public class Kite extends Quadrilateral {
	String name;
	double a,b,c,d,A,B,C,D;
	ArrayList<String> def = new ArrayList<String>();
	ArrayList<String> prop = new ArrayList<String>();

	public Kite(String name, double a, double b, double c, double d, double A, double B, double C, double D) {
		super(name, a, b, c, d, A, B, C, D);
		this.name = super.name;
		this.a = super.a;
		this.b = super.b;
		this.c = super.c;
		this.d = super.d;
		this.A = super.A;
		this.B = super.B;
		this.C = super.C;
		this.D = super.D;
		def.add("with two sets of consecutive sides equal.");
		prop.add(" You can use Kite symmetry theorem.");
		prop.add(" You can use Kite diagonal theorem.");
	}
	public String Definition() {
		  String definition = "The definition of your "+ name + " is " + def;
		  return definition;
	}
	public String properties() {
		  String properties = "The properties of your " + name + " are " + prop;
		  return properties;
	}
}


