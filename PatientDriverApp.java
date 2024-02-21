/*
 * Class: CMSC203 141313
 * Instructor:Dr. Ahmed Tarek
 * Description: a patientdriverapp class for the patient project
 * Due: 02/20/2024
 * Platform/compiler:eclipse ide
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: zahra sarfraz
*/
package assignment2;
/**
 * A driver program to show patient name and the procedures done
 */
public class PatientDriverApp {
	/**
	 * Name of the programmer
	 */
	public static final String programmerName="Zahra Sarfraz";
	/**
	 * Due date of the assignment
	 */
	public static final String dueDate="02/20/2024";
	/**
	 * MC number 
	 */
	public static final String mcNumber="21164445";

/**
 * The main method of the program
 * @param args the command line arguments 
 */
    public static void main(String[] args) {
    	
    	
        // Creating patient object
        Patient patient = new Patient("Irina", "Valeryevna", "Shaykhlislamova", "3503 East West hwy", "Chevy Chase", "MD", 12345, 2027180882L, "Tiffany Pozo Lin", 3022345678L);
        
        // Creating procedure objects
        Procedure procedure1 = new Procedure("Checkup", "06/12/2020", "Dr Monika", 190.56);
        Procedure procedure2 = new Procedure("MRI Scan", "07/12/2021", "Dr. Brown", 150.00);
        Procedure procedure3 = new Procedure("Blood Test", "08/20/2021", "Dr. Stewart", 75.50);

        // Displaying patient information
        displayPatient(patient);
        
        // Displaying procedure information
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculating total charges
        String totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges: $" + totalCharges);
        System.out.println("Programmer name: "+programmerName);
        System.out.println("Due date: "+dueDate);
        System.out.println("MC number: "+mcNumber);
    }
    /**
     * Displaying patient information
     * @param patient The patient object to display
     */
    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }
/**
 * Displaying procedure information
 * @param procedure the procedure object to display
 */
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }
/**
 * Calculate the charge of the procedures 
 * @param procedure1 first procedure
 * @param procedure2 second procedure
 * @param procedure3 third procedure
 * @return total charges
 */
    public static String calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        double totalCharges = procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
        return String.format("%.2f", totalCharges);
    }
}

/**
 * A driver program to show all the information about the patient
 */
class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	private long phoneNumber;
	private String emergencyContactName;
	private long emergencyContactPhoneNum;
	
	/**
	 * Constructing a patient object with no initial values
	 */
	public Patient() {//no arg constructor
	
	}
	 // Parametrized constructor
	/**
	 * Creating a patient object
	 * @param firstName first name of patient
	 * @param middleName middle name of patient 
	 * @param lastName last name of patient
	 */
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
/**
 * Creating patient objects for each attributes
 * @param firstName                first name of patient
 * @param middleName               middle name of patient
 * @param lastName                 last name of patient
 * @param streetAddress            address of patient
 * @param city                     city name of patient
 * @param state                    state name of patient
 * @param zipCode                  zip code of patient
 * @param phoneNumber              phone number of patient
 * @param emergencyContactName     emergency name of patient
 * @param emergencyContactPhoneNum emergency phone number of patient
 */
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, int zipCode, long phoneNumber,String emergencyContactName, long emergencyContactPhoneNum) {

		this.firstName= firstName;
		this.middleName= middleName;
		this.lastName= lastName;
		this.streetAddress= streetAddress;
		this.city= city;
		this.state= state;
		this.zipCode= zipCode;
		this.phoneNumber= phoneNumber;
		this.emergencyContactName= emergencyContactName;
		this.emergencyContactPhoneNum= emergencyContactPhoneNum;
	
	}
	// adding gettersnsetters
	/**
	 * Returns the first name
	 * @return a String corresponding to the first name
	 */
	public String getFirstName() {//getternsetter for first name
		return this.firstName;
	}
	/**
	 * Sets the first name
	 * @return a String corresponding to the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	/**
	 * Returns the middle name
	 * @return a String corresponding to the middle name
	 */
	public String getMiddleName() {//getternsetter for middle name
		return this.middleName;
	}
	/**
	 * Sets the middle name
	 * @return a String corresponding to the middle name
	 */
	public void setMiddleName(String middleName) {
		this.middleName=middleName;
	}
	/**
	 * Returns the last name
	 * @return a String corresponding to the last name
	 */
	public String getLastName() {//getternsetter for last name
		return this.lastName;
	}
	/**
	 * Sets the last name
	 * @return a String corresponding to the last name
	 */
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	/**
	 * Returns the street address
	 * @return a String corresponding to the street address
	 */
	public String getStreetAddress() {//getternsetter for address
		return this.streetAddress;
	}
	/**
	 * Sets the street address
	 * @return a String corresponding to the street address
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress=streetAddress;
	}
	/**
	 * Returns the city name
	 * @return a String corresponding to the city name
	 */
	public String getCity() {//getternsetter for city
		return this.city;
	}
	/**
	 * Sets the city name
	 * @return a String corresponding to the city name
	 */
	public void setCity(String city) {
		this.city=city;
	}
	/**
	 * Returns the state name
	 * @return a String corresponding to the state name
	 */
	public String getState() {//getternsetter stste
		return this.state;
	}
	/**
	 * Sets the state name
	 * @return a String corresponding to the state name
	 */
	public void setState(String state) {
		this.state=state;
	}
	/**
	 * Returns the zip code
	 * @return a int corresponding to the zip code
	 */
	public int getZipCode() {//getternsetter for zip code
		return this.zipCode;
	}
	/**
	 * Sets the zip code
	 * @return a int corresponding to the zip code
	 */
	public void setZipCode(int ZipCode) {
		this.zipCode=ZipCode;
	}
	/**
	 * Returns the phone number
	 * @return a longg corresponding to the phone number
	 */
	public long getPhoneNumber() {//getternsetter for phone number
		return this.phoneNumber;
	}
	/**
	 * Sets the phone number
	 * @return a longg corresponding to the phone number
	 */
	public void setPhoneNumber(long PhoneNumber) {
		this.phoneNumber=PhoneNumber;
	}
	/**
	 * Returns the emergency contact name
	 * @return a String corresponding to the emergency contact name
	 */
	public String getEmergencyContactName() {//getternsetter for em first name
		return this.emergencyContactName;
	}
	/**
	 * Sets the emergency contact name
	 * @return a String corresponding to the emergency contact name
	 */
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName=emergencyContactName;
	}
	/**
	 * Returns the emergency contact phone number
	 * @return a String corresponding to the emergency contact phone number
	 */
	public long getEmergencyContactPhoneNum() {//getternsetter for em phone num
		return this.emergencyContactPhoneNum;
	}
	/**
	 * Sets the emergency contact phone number
	 * @return a String corresponding to the emergency contact phone number
	 */
	public void setEmergencyContactPhoneNum(long emergencyContactPhoneNum) {
		this.emergencyContactPhoneNum=emergencyContactPhoneNum;
	}
	
	
	
	 // Method to build full name
	/**
	 * Builds and returns the full name of the patient
	 * @return full name of patient
	 */
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build address
    /**
     * Builds and returns the address of the patient
     * @return address of the patient
     */
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // Method to build emergency contact
    /**
     * Builds and returns the emergency contact information
     * @return emergency contact information
     */
    public String buildEmergencyContact() {
        return emergencyContactName + " \n\tPhone number:" + emergencyContactPhoneNum;
    }

    // toString method
    /**
     * Returns a string representation of the the object.
     * @return A string representation of the the object.
     */
    @Override
    public String toString() {
        return "Patient Information:\n" +
                "\tFull Name: " + buildFullName() + "\n" +
                "\tAddress: " + buildAddress() + "\n" +
                "\tPhone Number: " + phoneNumber + "\n" +
                "\tEmergency Contact: " + buildEmergencyContact()+"\n";
    }
	}
/**
 * Represents the procedure information of the patient
 */
class Procedure {
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double charges;
	
	/**
	 * Constructs a new procedure object
	 */
	public Procedure() {
    }
	
	/**
	 * Constructs a new procedure opbject
	 * @param procedureName the name of the procedure
	 * @param procedureDate the date of the procedure
	 */
	 public Procedure(String procedureName, String procedureDate) {
	        this.procedureName = procedureName;
	        this.procedureDate = procedureDate;
	    }
	 
	 /**
	  * Constructs a new procedure object
	  * @param procedureName    the name of the procedure
	  * @param procedureDate    the date of the procedure
	  * @param practitionerName the practitioner name 
	  * @param charges           the charges of the procedure
	  */
	 public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
	        this.procedureName = procedureName;
	        this.procedureDate = procedureDate;
	        this.practitionerName = practitionerName;
	        this.charges = charges;
	    }
	
	//now making all the accessors and mutators (getters and setters) 
	/**
	 * Returns the name of the procedure 
	 * @return the name of the procedure
	 */
	public String getName() {
		return this.procedureName;
	}
	/**
	 * Sets the name of the procedure 
	 * @return the name of the procedure
	 */
	public void setName(String procedureName) {
		this.procedureName=procedureName;
	}
	/**
	 * Returns the date of the procedure 
	 * @return the date of the procedure
	 */
	public String getDate() {
		return this.procedureDate;
	}
	/**
	 * Sets the date of the procedure 
	 * @return the date of the procedure
	 */
	public void setDate(String procedureDate) {
		this.procedureDate=procedureDate;
	}
	/**
	 * Returns the practitioner name 
	 * @return the practitioner name 
	 */
	public String getPractitioner() {
		return this.practitionerName;
	}
	/**
	 * Sets the practitioner name 
	 * @return the practitioner name 
	 */
	public void setPractitioner(String practitionerName) {
		this.practitionerName=practitionerName;
	}
	/**
	 * Returns the Charges of the procedure 
	 * @return  the Charges of the procedure 
	 */
	public double getCharges() {
		return this.charges;
	}
	/**
	 * Sets the Charges of the procedure 
	 * @return  the Charges of the procedure 
	 */
	public void setCharges(double charges) {
		this.charges=charges;
	}

	// a toString method to dislpay all the info
	/**
     * Returns a string representation of the procedure object.
     * @return A string representation of the procedure object.
     */
	public String toString() {
		String procedureInfo="\t\tProcedure: "+procedureName+"\n\t\tProcedureDate: "+procedureDate+"\n\t\tPractitioner: "+practitionerName+"\n\t\tCharge: $"+charges+"\n";
		return procedureInfo;
	}
}


