package salaries;

import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Teacher matt = new Teacher("Matthew Anderson", "Teacher", 10, 4);
	  Teacher lauren = new Teacher("Lauren Bates", "Teacher", 10, 1);
	  Teacher ken = new Teacher("Ken Campbell", "Teacher", 5, 4);
	  Teacher janet = new Teacher("Janet Dillon", "Teacher", 30, 1);
	  Admin ivan = new Admin("Ivan Engle", "Administrator", 1, 1);
	  Admin helga = new Admin("Helga Fulton", "Administrator", 4, 1);
	  Admin gary = new Admin("Gary Gaff", "Administrator", 10, 1);
	  Secretarial frances = new Secretarial("Frances Hill", "Secretarial", 15);
	  Secretarial edward = new Secretarial("Edward Ing", "Secretarial", 20);
	  Secretarial dolly = new Secretarial("Dolly Jones", "Secretarial", 10);
	  ParaPro carl = new ParaPro("Carl Knudstrupp", "Para-Pro", 10);
	  ParaPro betty = new ParaPro("Betty Love", "Para-Pro", 5);
	  ParaPro able = new ParaPro("Able Mann", "Para-Pro", 15);
	  System.out.println("Please type the name of the employee you would like to view the pay check for. CaSe SeNsItIvE!");
	  Scanner userInput = new Scanner(System.in);
	  String employeeToFind = userInput.nextLine();
	  //Many if-statements follow!
	  
	  if(employeeToFind.equals("Matthew Anderson")) {
		  System.out.println("Bi-Weekly Paycheck for " + matt.getType() + " " + matt.getName());
		  System.out.println("$" + matt.getPay());
	  }
	  else if(employeeToFind.equals("Lauren Bates")) {
		  System.out.println("Bi-Weekly Paycheck for " + lauren.getType() + " " + lauren.getName());
		  System.out.println("$" + lauren.getPay());
	  }
	  else if(employeeToFind.equals("Ken Campbell")) {
		  System.out.println("Bi-Weekly Paycheck for " + ken.getType() + " " + ken.getName());
		  System.out.println("$" + ken.getPay());
	  }
	  else if(employeeToFind.equals("Janet Dillon")) {
		  System.out.println("Bi-Weekly Paycheck for " + janet.getType() + " " + janet.getName());
		  System.out.println("$" + janet.getPay());
	  }
	  else if(employeeToFind.equals("Ivan Engle")) {
		  System.out.println("Bi-Weekly Paycheck for " + ivan.getType() + " " + ivan.getName());
		  System.out.println("$" + ivan.getPay());
	  }
	  else if(employeeToFind.equals("Helga Fulton")) {
		  System.out.println("Bi-Weekly Paycheck for " + helga.getType() + " " + helga.getName());
		  System.out.println("$" + helga.getPay());
	  }
	  else if(employeeToFind.equals("Gary Gaff")) {
		  System.out.println("Bi-Weekly Paycheck for " + gary.getType() + " " + gary.getName());
		  System.out.println("$" + gary.getPay());
	  }
	  else if(employeeToFind.equals("Frances Hill")) {
		  System.out.println("Bi-Weekly Paycheck for " + frances.getType() + " " + frances.getName());
		  System.out.println("$" + frances.getPay());
	  }
	  else if(employeeToFind.equals("Edward Ing")) {
		  System.out.println("Bi-Weekly Paycheck for " + edward.getType() + " " + edward.getName());
		  System.out.println("$" + edward.getPay());
	  }
	  else if(employeeToFind.equals("Dolly Jones")) {
		  System.out.println("Bi-Weekly Paycheck for " + dolly.getType() + " " + dolly.getName());
		  System.out.println("$" + dolly.getPay());
	  }
	  else if(employeeToFind.equals("Carl Knudstrupp")) {
		  System.out.println("Bi-Weekly Paycheck for " + carl.getType() + " " + carl.getName());
		  System.out.println("$" + carl.getPay());
	  }
	  else if(employeeToFind.equals("Betty Love")) {
		  System.out.println("Bi-Weekly Paycheck for " + betty.getType() + " " + betty.getName());
		  System.out.println("$" + betty.getPay());
	  }
	  else if(employeeToFind.equals("Able Mann")) {
		  System.out.println("Bi-Weekly Paycheck for " + able.getType() + " " + able.getName());
		  System.out.println("$" + able.getPay());
	}
	  else {
		  System.out.println("That was not a valid name. Program will exit.");
		  System.exit(1);
	  }
  }
}