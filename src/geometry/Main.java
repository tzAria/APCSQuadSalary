package geometry;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		System.out.println(" _______           _______  ______   _______ _________ _        _______ _________ _______  _______  _______  _          _______  _______  _______  _______  _______  _______  _______ \r\n" + 
				"(  ___  )|\\     /|(  ___  )(  __  \\ (  ____ )\\__   __/( \\      (  ___  )\\__   __/(  ____ \\(  ____ )(  ___  )( \\        (  ____ )(  ____ )(  ___  )(  ____ \\(  ____ )(  ___  )(       )\r\n" + 
				"| (   ) || )   ( || (   ) || (  \\  )| (    )|   ) (   | (      | (   ) |   ) (   | (    \\/| (    )|| (   ) || (        | (    )|| (    )|| (   ) || (    \\/| (    )|| (   ) || () () |\r\n" + 
				"| |   | || |   | || (___) || |   ) || (____)|   | |   | |      | (___) |   | |   | (__    | (____)|| (___) || |        | (____)|| (____)|| |   | || |      | (____)|| (___) || || || |\r\n" + 
				"| |   | || |   | ||  ___  || |   | ||     __)   | |   | |      |  ___  |   | |   |  __)   |     __)|  ___  || |        |  _____)|     __)| |   | || | ____ |     __)|  ___  || |(_)| |\r\n" + 
				"| | /\\| || |   | || (   ) || |   ) || (\\ (      | |   | |      | (   ) |   | |   | (      | (\\ (   | (   ) || |        | (      | (\\ (   | |   | || | \\_  )| (\\ (   | (   ) || |   | |\r\n" + 
				"| (_\\ \\ || (___) || )   ( || (__/  )| ) \\ \\_____) (___| (____/\\| )   ( |   | |   | (____/\\| ) \\ \\__| )   ( || (____/\\  | )      | ) \\ \\__| (___) || (___) || ) \\ \\__| )   ( || )   ( |\r\n" + 
				"(____\\/_)(_______)|/     \\|(______/ |/   \\__/\\_______/(_______/|/     \\|   )_(   (_______/|/   \\__/|/     \\|(_______/  |/       |/   \\__/(_______)(_______)|/   \\__/|/     \\||/     \\|\r\n" + 
				"                                                                                                                                                                                      \r\n" + 
				"");
		String name;
		  double sideA,sideB,sideC,sideD,A,B,C,D;
		  double area;
		  double perimeter;
		  Scanner console = new Scanner(System.in);

		     //Input name, side measures and angles measures
		  
		   name = console.nextLine();
		   System.out.println();
		   System.out.println("You typed in " + name);
		   System.out.println("Labled in a clockwise motion as A, B, C, D, enter the following information.");
		   System.out.println("distance AB is?");
		   sideA = console.nextDouble();
		   System.out.println("distance BC is?");
		   sideB = console.nextDouble();
		   System.out.println("distance CD is?");
		   sideC = console.nextDouble();
		   System.out.println("distance DA is?");
		   sideD = console.nextDouble();

		   System.out.println("angle measure A is?");
		   A = console.nextDouble();
		   System.out.println("angle measure B is?");
		   B = console.nextDouble();
		   System.out.println("angle measure C is?");
		   C = console.nextDouble();
		   System.out.println("angle measure D is?");
		   D = console.nextDouble();

		   double diagonal1a = Math.sqrt(sideA*sideA+sideD*sideD-2*sideA*sideD*Math.cos(A*Math.PI/180));
		   double diagonal1c = Math.sqrt(sideB*sideB+sideC*sideC-2*sideB*sideC*Math.cos(C*Math.PI/180));
		   double diag2b = Math.sqrt(sideA*sideA+sideB*sideB-2*sideA*sideB*Math.cos(B*Math.PI/180));
		   double diag2d = Math.sqrt(sideD*sideD+sideC*sideC-2*sideD*sideC*Math.cos(D*Math.PI/180));

		        //test for correct angle measure
	      if(A+B+C+D != 360.0){
	        System.out.println();
	        System.out.println("something is wrong, your total angle measure is not 360.");
	        System.out.println("stop the program and start over");
	        System.out.println();
	        // some how stop the program
	      }
		      
	      else if ((diagonal1a != diagonal1c) || (diag2b != diag2d) ){
	          System.out.println();
	          System.out.println("something is wrong, your sides do not connect.");
	          System.out.println("stop the program and start over");
	          System.out.println();
	        // some how stop the program
	      }

	      else{		  
		    area = .5*sideA*sideD*Math.sin(A*Math.PI/180) + .5*sideB*sideC*Math.sin(C*Math.PI/180);
		    perimeter = sideA+sideB+sideC+sideD;
		      
		    System.out.println("This is all the things you should know about your " + name);
		    System.out.println();
		    System.out.println("The area of your " + name + " is " + area);
		    System.out.println("The perimeter of your " + name + " is " + perimeter);
		    System.out.println();
		    System.out.println("The two diagonal measures are " + diagonal1a + " and " + diag2b);
		    System.out.println();
	        if ((name.equals("Quadrilateral")) || (name.equals("quadrilateral"))){
	          //Quad(name,a,b,c,d,A,B,C,D);
	          Quadrilateral q1 = new Quadrilateral (name,sideA,sideB,sideC,sideD,A,B,C,D);
	          //Printing out all the definition and properties
	          System.out.println(q1.toStringDef());
	          System.out.println();
	          System.out.println(q1.toStringProp());
	          System.out.println();
	          System.out.println();
	        }
	        if ((name.equals("Kite")) || (name.equals("kite"))){
	          //Kite(name,a,b,c,d,A,B,C,D);
	          Kite k1 = new Kite (name,sideA,sideB,sideC,sideD,A,B,C,D);
	          //Printing out all the definition and properties
	          System.out.println(k1.toStringDef());
	          System.out.println();
	          System.out.println(k1.toStringProp());
	          System.out.println();
	          System.out.println();
	        }
	        if ((name.equals("Trapezoid")) ||(name.equals("trapezoid"))){
	          //Trap(name,a,b,c,d,A,B,C,D);
	          Trap t1 = new Trap (name,sideA,sideB,sideC,sideD,A,B,C,D);
	          //Printing out all the definition and properties
	          System.out.println(t1.toStringDef());
	          System.out.println();
	          System.out.println(t1.toStringProp());
	          System.out.println();
	          System.out.println();
	        }
	        if ((name.equals("Isosceles Trapezoid")) || (name.equals("isosceles trapezoid"))){
	          //IsosTrap(name,a,b,c,d,A,B,C,D);
	          IsosTrap it1 = new IsosTrap (name,sideA,sideB,sideC,sideD,A,B,C,D);
	          //Printing out all the definition and properties
	          System.out.println(it1.toStringDef());
	          System.out.println();
	          System.out.println(it1.toStringProp());
	          System.out.println();
	          System.out.println();
	        }
	        if ((name.equals("Parallelogram")) || (name.equals("parallelogram"))){
	          //Para(name,a,b,c,d,A,B,C,D);
	          Para p1 = new Para (name,sideA,sideB,sideC,sideD,A,B,C,D);
	          //Printing out all the definition and properties
	          System.out.println(p1.toStringDef());
	          System.out.println();
	          System.out.println(p1.toStringProp());
	          System.out.println();
	          System.out.println();
	        }
	        if ((name.equals("Rhombus")) || (name.equals("rhombus"))){
	          //Rhom(name,a,b,c,d,A,B,C,D);
	          Rhom rh1 = new Rhom (name,sideA,sideB,sideC,sideD,A,B,C,D);
	          //Printing out all the definition and properties
	          System.out.println(rh1.toStringDef());
	          System.out.println();
	          System.out.println(rh1.toStringProp());
	          System.out.println();
	          System.out.println();
	        }
	        if ((name.equals("Rectangle")) || (name.equals("rectangle"))){
	          //Rect(name,a,b,c,d,A,B,C,D);
	          Rect r1 = new Rect (name,sideA,sideB,sideC,sideD,A,B,C,D);
	          //Printing out all the definition and properties
	          System.out.println(r1.toStringDef());
	          System.out.println();
	          System.out.println(r1.toStringProp());
	          System.out.println();
	          System.out.println();
	        }
	        if ((name.equals("Square")) || (name.equals("square"))){
	          //Squa(name,a,b,c,d,A,B,C,D);
	          Squa s1 = new Squa (name,sideA,sideB,sideC,sideD,A,B,C,D);
	          //Printing out all the definition and properties
	          System.out.println(s1.toStringDef());
	          System.out.println();
	          System.out.println(s1.toStringProp());
	          System.out.println();
	          System.out.println();
	        }
	    }
	}
}
