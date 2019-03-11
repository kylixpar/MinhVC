package Assignment3_1;

public class Employee {
	 public int Id;
	    public String name;
	    public double salary;

	    public Employee(int id, String name, double salary) {
	        Id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public Employee() {
	    }

	    public int getId() {
	        return Id;
	    }

	    public void setId(int id) {
	        Id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return this.Id+"-"+this.name+"-"+this.salary;
	    }
}
