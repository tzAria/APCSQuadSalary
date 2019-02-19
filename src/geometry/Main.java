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
		  System.out.println("Please enter the name of your quadrilateral");
		  name = console.nextLine();
		  System.out.println();
		  System.out.println("You entered " + name);
		  System.out.println("Please answer the following questions regarding your quadrilateral's properties");
		  System.out.println("Distance AB is?");
		  sideA = console.nextDouble();
		  System.out.println("Distance BC is?");
		  sideB = console.nextDouble();
		  System.out.println("Distance CD is?");
		  sideC = console.nextDouble();
		  System.out.println("Distance DA is?");
		  sideD = console.nextDouble();
		  System.out.println("Angle measure A is?");
		  A = console.nextDouble();
		  System.out.println("Angle measure B is?");
		  B = console.nextDouble();
		  System.out.println("Angle measure C is?");
		  C = console.nextDouble();
		  System.out.println("Angle measure D is?");
		  D = console.nextDouble();
		  double diagonal1a = Math.sqrt(sideA*sideA+sideD*sideD-2*sideA*sideD*Math.cos(A*Math.PI/180));
		  double diagonal1c = Math.sqrt(sideB*sideB+sideC*sideC-2*sideB*sideC*Math.cos(C*Math.PI/180));
		  double diag2b = Math.sqrt(sideA*sideA+sideB*sideB-2*sideA*sideB*Math.cos(B*Math.PI/180));
		  double diag2d = Math.sqrt(sideD*sideD+sideC*sideC-2*sideD*sideC*Math.cos(D*Math.PI/180));
	      if(A+B+C+D != 360.0){
	        System.out.println();
	        System.out.println("Angle measures do not add to 360.");
	        System.out.println("Program will exit.");
	        System.exit(1);
	      }
		      
	      else if ((diagonal1a != diagonal1c) || (diag2b != diag2d) ){
	          System.out.println();
	          System.out.println("Sides do not connect with current side lengths.");
	          System.out.println("Program will exit.");
	          System.exit(1);
	      }

	      else{		  
	    	    area = .5*sideA*sideD*Math.sin(A*Math.PI/180) + .5*sideB*sideC*Math.sin(C*Math.PI/180);
	    	    perimeter = sideA+sideB+sideC+sideD;
		      
			    System.out.println("Info retrieved for your " + name);
			    System.out.println("The area of the " + name + " is " + area);
			    System.out.println("The perimeter of the " + name + " is " + perimeter);
			    System.out.println("The two diagonal measures are " + diagonal1a + " and " + diag2b);
		        if ((name.equals("Quadrilateral")) || (name.equals("quadrilateral"))){
		          Quadrilateral q1 = new Quadrilateral (name,sideA,sideB,sideC,sideD,A,B,C,D);
		          System.out.println(q1.Definition());
		          System.out.println(q1.properties());
		        }
		        if ((name.equals("Kite")) || (name.equals("kite"))){
		          Kite k1 = new Kite (name,sideA,sideB,sideC,sideD,A,B,C,D);
		          //Printing out all the definition and properties
		          System.out.println(k1.Definition());
		          System.out.println(k1.properties());
		        }
		        if ((name.equals("Trapezoid")) ||(name.equals("trapezoid"))){
		          Trapezoid t1 = new Trapezoid (name,sideA,sideB,sideC,sideD,A,B,C,D);
		          System.out.println(t1.Definition());
		          System.out.println(t1.properties());
		        }
		        if ((name.equals("Isosceles Trapezoid")) || (name.equals("isosceles trapezoid"))){
		          IsoscelesTrapezoid it1 = new IsoscelesTrapezoid (name,sideA,sideB,sideC,sideD,A,B,C,D);
		          System.out.println(it1.Definition());
		          System.out.println(it1.properties());
		        }
		        if ((name.equals("Parallelogram")) || (name.equals("parallelogram"))){
		          Parallelogram p1 = new Parallelogram (name,sideA,sideB,sideC,sideD,A,B,C,D);
		          System.out.println(p1.Definition());
		          System.out.println(p1.properties());
		        }
		        if ((name.equals("Rhombus")) || (name.equals("rhombus"))){
		          Rhombus rh1 = new Rhombus (name,sideA,sideB,sideC,sideD,A,B,C,D);
		          System.out.println(rh1.Definition());
		          System.out.println(rh1.properties());
		        }
		        if ((name.equals("Rectangle")) || (name.equals("rectangle"))){
		          Rectangle r1 = new Rectangle (name,sideA,sideB,sideC,sideD,A,B,C,D);
		          System.out.println(r1.Definition());
		          System.out.println(r1.properties());
		        }
		        if ((name.equals("Square")) || (name.equals("square"))){
		          Square s1 = new Square (name,sideA,sideB,sideC,sideD,A,B,C,D);
		          System.out.println(s1.Definition());
		          System.out.println(s1.properties());
	        }
	    }
	}
}
