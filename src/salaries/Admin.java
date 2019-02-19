package salaries;

public class Admin extends Teacher {
	private String name,type;
	private int[] paySteps = {90000, 95000, 100000};
	private int yearsWorked,startStep; //starting step is not used, however it is here so there are no errors
	public Admin(String name, String type, int yearsWorked, int startStep) {
		super(name,type,yearsWorked,startStep);
	}
	public double getPay() {
	    int step = (yearsWorked-1) / 2;
	    if (step > 2) {
	      step = 2;
	    }
	    double uncut = this.paySteps[step] / 26.0;
	    return ((int)(100 * uncut)) / 100.0;
	  }
}
