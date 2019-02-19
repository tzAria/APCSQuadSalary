package salaries;

public class Secretarial {
	private String name,type;
	private int yearsWorked;
	public Secretarial(String name, String type, int yearsWorked) {
		this.name = name;
		this.type = type;
		this.yearsWorked = yearsWorked;
	}
	public double getPay() {
	    if (yearsWorked <= 10) {
	      return 2 * ((15 + (.50 * yearsWorked)) * 40);
	    } else {
	      return 2* (20.00 * 40);
	    }
	}
	public String getName() {
	    return name;
	}
	public String getType() {
		return type;
	}
}
