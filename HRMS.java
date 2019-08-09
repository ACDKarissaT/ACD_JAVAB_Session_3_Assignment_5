package assignment5;

import java.io.File;
import java.util.Date;

public class HRMS {
	HRDepartment[] departments;
}
class Person{
	String name;
	int age;
	String email;
	String phoneNumbers;
}

class Employee extends Person{
	int employeeNo;
	double salary;
}

class Candidates extends Person{
	String reqDocuments;
	File resume;
	Date[] interviews;
}

class HRDepartment{
	Employee[] employees;
}

class Iquiries {
	Person submittedBy;
	Person[] peopleInvolved;
	String inquiry;
	Date submitDate;
	boolean isOpen;
}
class SupportDepartment extends HRDepartment{
	Iquiries[] inquiries;
	
}

class HiringDepartment extends HRDepartment{
	Candidates[] candidates;
}

class PayDepartment extends HRDepartment{
	int paySchedule;
	Date[] Holidays;
}

