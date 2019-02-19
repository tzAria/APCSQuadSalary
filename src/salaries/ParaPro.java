package salaries;

public class ParaPro extends Secretarial {
	private String name,type;
	private int yearsWorked;
	public ParaPro(String name, String type, int yearsWorked) {
		super(name,type,yearsWorked);
	}
	public double getPay() {
	    if (yearsWorked <= 10) {
	      return 2 * ((10.00 + (.25 * yearsWorked)) * 40);
	    } else {
	      return 2*(12.50 * 40);
	    }
	  }
}
