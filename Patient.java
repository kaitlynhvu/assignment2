/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Assignment 2
 * Description: Patient class deals with information about the patient
 * like names, address, and emergency contacts
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Kaitlyn Vu
*/

/**
 * Patient class, represents a Patient object
 * @author Kaitlyn Vu
 *
 */
public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyPhone;
	/**
	 * Default no-arg Constructor
	 */
	public Patient ()
	{
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyName = "";
		emergencyPhone = "";
	}
	/**
	 * Constructor that takes data as input and sets them.
	 * @param fName the procedure's name
	 * @param mName the procedure's date
	 * @param lName the procedure's practitioner
	 */
	Patient (String fName, String mName, String lName)
	{
		firstName = fName;
		middleName = mName;
		lastName = lName;
	}
	/**
	 * Constructor that takes data as input and sets them.
	 * @param fName the procedure's name
	 * @param mName the procedure's date
	 * @param lName the procedure's practitioner
	 * @param sAdress the street adress
	 * @param c the city name
	 * @param s the state name
	 * @param zCode the zip code
	 * @param pNumber the phone number
	 * @param eName the emergency name
	 * @param ePhone the emergency phone number
	 */
	Patient(String fName, String mName, String lName, String sAddress, String c, String s, String zCode, String pNumber, String eName, String ePhone){
		firstName = fName;
		middleName = mName;
		lastName = lName;
		streetAddress = sAddress;
		city = c;
		state = s;
		zipCode = zCode;
		phoneNumber = pNumber;
		emergencyName = eName;
		emergencyPhone = ePhone;
	}
	/**
	 * returns patient first name
	 * @return a string for first name of patient
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * returns patient middle name
	 * @return a string for middle name of patient
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * returns patient last name
	 * @return a string for last name of patient
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * returns patient's street address
	 * @return a string for street address of patient
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * returns patient's city
	 * @return a string for patient's city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * returns patient's state
	 * @return a string for patient's state
	 */
	public String getState() {
		return state;
	}
	/**
	 * returns patient's zipcode
	 * @return a string for patient's zipcode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * returns patient's phone number
	 * @return a string for patient's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * returns patient's emergency contact's name
	 * @return a string for patient's emergency contact's name
	 */
	public String getEmergencyName() {
		return emergencyName;
	}
	/**
	 * returns patient's emergency contact's phone number
	 * @return a string for patient's emergency contact's number
	 */
	public String getEmergencyPhone() {
		return emergencyPhone;
	}
	/**
	 * sets first name of patient
	 * @param newFName the first name of the patient
	 */
	public void setFirstName(String newFName) {
		firstName = newFName;
	}
	/**
	 * sets middle name of patient
	 * @param newMName the middle name of the patient
	 */
	public void setMiddleName(String newMName) {
		middleName = newMName;
	}
	/**
	 * sets last name of patient
	 * @param newLName the last name of the patient
	 */
	public void setLastName(String newLName) {
		lastName = newLName;
	}
	/**
	 * sets the street address of the patient
	 * @param newSAddress the street address of the patient
	 */
	public void setStreetAddress(String newSAddress) {
		streetAddress = newSAddress;
	}
	/**
	 * sets the patient's city
	 * @param newSAddress the patient's city
	 */
	public void setCity (String newC) {
		city = newC;
	}
	/**
	 * sets the patient's state
	 * @param newSAddress the patient's state
	 */
	public void setState(String newS) {
		state = newS;
	}
	/**
	 * sets the patient's zipcode
	 * @param newSAddress the patient's zipcode
	 */
	public void setZipCode(String newZCode) {
		zipCode = newZCode;
	}
	/**
	 * sets the patient's phone number
	 * @param newSAddress the patient's phone number
	 */
	public void setPhoneNumber(String newPNumber) {
		phoneNumber = newPNumber;
	}
	/**
	 * sets the patient's emergency contact's name
	 * @param newSAddress the patient's emergency contact's name
	 */
	public void setEmergencyName(String newEName) {
		emergencyName = newEName;
	}
	/**
	 * sets the patient's emergency contact's phone number
	 * @param newSAddress the patient's emergency contact's phone number
	 */
	public void setEmergencyPhone(String newEPhone) {
		emergencyPhone = newEPhone;
	}	
	/**
	 * returns the full name of a patient
	 * @return a string the concatenation of first, middle, and last name 
	 * of patient
	 */
	public String bindFullName() {
		return (firstName +" "+ middleName + " "+ lastName);
	}
	/**
	 * returns the full name of address
	 * @return a string the concatenation of address,
	 *  city, state and zip separated by space. 
	 */
	public String buildAddress() {
		return (streetAddress + " " + city + " " + state + " " + zipCode);
	}
	/**
	 * returns the full information of emergency contact
	 * @return a string containing the emergency contact's name and phone
	 * number seperated by a space
	 */
	public String buildEmergencyContact() {
		return (emergencyName + " " + emergencyPhone);
	}
	/**
	 * Returns a string with patient information
	 */
	public String toString() {
		return ("  Name: " + bindFullName() +
				"\n  Address: " + buildAddress() +
				"\n  Emergency: " + buildEmergencyContact());
	}
}
