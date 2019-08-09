package assignment5;

import java.util.Date;

public class LibraryManagementSystem {
	LibraryEmployee[] employees; //list of  library employees
	Borrower[] borrowers; // list of people who can borrow items
	ReadingMaterial[] items; // list of items that can be borrowed
	
}
class LibraryPerson{ // Person information
	String name;
	int age;
	String email;
	int phone;
	String address;
}

// Employee class extended from person
class LibraryEmployee extends LibraryPerson{
	int employeeId;
	double Salary;
	String position;
}

// Borrower class extended from person
class Borrower extends LibraryPerson{
	int borrowerId;
	BorrowedMaterial[] borrowed; //list of items this person has borrowed
}


class BorrowedMaterial {
	int itemID;
	Date dateBorrowed;
	Date dueDate;
	double lateFee;
	double borrowingFee;
}

class ReadingMaterial{
	int itemID;
	String title;
	double price;
	int numberOfCopies;
	int numberBorrowed;
	String type;
	String genre;
	String author;
	Date publishDate;
}

class Books extends ReadingMaterial{
	String bound;
	String edition;
}
class Periodicals extends ReadingMaterial{
	Date issueDate;
	int vol;
	int edition;
}
class Digital extends ReadingMaterial{
	float size;
	String platform;
}