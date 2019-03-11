package Assignment3_1;

public class Main {
	public static void main(String[] args) {
        PersonModel<Student> personModel = new PersonModel<>();
        Student student1 = new Student(1,"Minh",27);
        Student student2 = new Student(2,"Vuong",29);
    personModel.AddEmployeer(student1);
    personModel.AddEmployeer(student2);
    personModel.Display();
        
        PersonModel<Employee> personModel1 = new PersonModel<>();
        Employee employee1 = new Employee(1,"Minh",26);
        Employee employee2 = new Employee(2,"Vuong",28);
        personModel1.AddEmployeer(employee1);
        personModel1.AddEmployeer(employee2);
        personModel1.Display();
    }
	
}
