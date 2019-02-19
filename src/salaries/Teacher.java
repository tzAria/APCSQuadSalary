package salaries;

public class Teacher {
	private String name,type;
	private int startingStep,yearsWorked;
	private int[] paySteps = {36750, 38750, 40000, 45750, 50750, 55750, 60750, 65750, 70750, 80750};

	public Teacher(String name,String type,int yearsWorked,int startingStep) {
		this.name = name;
		this.type = type;
		this.yearsWorked = yearsWorked;
		this.startingStep = startingStep;
	}
	public double getPay() {
	    int step = this.startingStep + ((yearsWorked-1) / 2);
	    if (step > 8) {
	      step = 8;
	    }
	    double uncut = this.paySteps[step] / 26.0;
	    return ((int)(100 * uncut)) / 100.0;
	 }
	public String getName() {
	    return name;
	 }
	public String getType() {
		return type;
	}
}
