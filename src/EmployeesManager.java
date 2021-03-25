import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {

	private int ageInYears;
	private int ageInMonths;
	private String birthDate;
	private String firstName;
	private String lastName;

	private String employeeId;
	LocalDate date;
	private static int counter = 0;

	public Employee(String fullName, String birthDate) {
		counter++;
		this.employeeId = "Emp" + counter;
		String[] split = fullName.split(" ");

		this.firstName = split[0];
		this.lastName = split[1];
		this.birthDate = birthDate;

		this.date = LocalDate.parse(birthDate);

		Period age = Period.between(date, LocalDate.now());
		this.ageInYears = age.getYears();
		this.ageInMonths = age.getMonths();

	}

	public int getAgeInYears() {
		return ageInYears;
	}

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Employee [ageInYears=" + ageInYears + ", ageInMonths=" + ageInMonths + ", birthDate="
				+ LocalDate.parse(birthDate).getDayOfMonth() + "-" + LocalDate.parse(birthDate).getMonth() + "-"
				+ LocalDate.parse(birthDate).getYear() + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", employeeId=" + employeeId + ", date=" + date + "]";
	}

}

public class EmployeesManager {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			ArrayList<Employee> empList = new ArrayList<>();
			int ch;
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"\n\n******************************************************************************************");
				System.out.println("1. Add a new Employee");
				System.out.println("2. Find any Employee by Employee Id");
				System.out.println("3. Find all Employees older than 55 years");
				System.out.println("4. List all the current Employees");
				System.out.println("5. Exit");
				System.out.print("Select an option : ");
				ch = sc.nextInt();

				switch (ch) {
				case 1:
					System.out.println("Enter Employee First Name, Last Name, Date Of Birth (yyyy-MM-dd)");
					String firstname = sc.next();
					String lastname = sc.next();
					String birthDate = sc.next();
					String fullname = firstname + " " + lastname;
					Employee e = new Employee(fullname, birthDate);

					empList.add(e);
					System.out.println("Added Succesfully...");
					System.out.println(empList);

					break;

				case 2:
					System.out.println("Enter Employee Id");
					String empId = sc.next();
					for (Employee i : empList) {
						if (i.getEmployeeId().contentEquals(empId)) {
							System.out.println("Employee found");
						} else {
							System.out.println("Employee not found");
						}
					}
					break;

				case 3:

					for (Employee i : empList) {
						if (i.getAgeInYears() > 30) {
							System.out.println(i);
						}
					}
					break;

				case 4:

					for (Employee i : empList) {
						System.out.println(i);
					}
					break;

				case 5:

					empList.clear();
					System.out.println("List cleared and Exited...");
					exit = true;
				}

			}

			/**
			 * Implement EmployeesManager to manage all employees of a company
			 *
			 */

			/**
			 * Adds an Employee
			 *
			 * @param employee
			 * @return
			 */
			/*
			 * String addEmployee(Employee employee) { // TODO - implement this return null;
			 */
		}

		/**
		 * Finds an Employee
		 *
		 * @param employeeId
		 * @return
		 */
		/*
		 * Employee findEmployee(String employeeId) { // TODO - implement this return
		 * null;
		 */
	}

	/**
	 * Find all Employee who are older than X years
	 * 
	 * @param years
	 * @return
	 */
	/*
	 * Collection<Employee> findEmployee(int years) { return null; }
	 */

	/**
	 * Removes an employee
	 *
	 * @param employeeId
	 * @return
	 */
	/*
	 * boolean removeEmployee(String employeeId) { // TODO - implement this return
	 * false; }
	 */

	/**
	 * Lists all Employees
	 *
	 * @return
	 */
	/*
	 * Collection<Employee> listEmployees() { // TODO - implement this return null;
	 */
}
