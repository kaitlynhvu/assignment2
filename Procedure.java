/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Assignment 2
 * Description: Procedure class deals with information about the procedure
 * like names, practitioner, dates, and costs/charges
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Kaitlyn Vu
*/

/**
 * Procedure class, represents a Procedure object
 * @author Kaitlyn Vu
 *
 */
public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String procedurePractitioner;
	private double procedureCharges;
	
	/**
	 * Default no-arg Constructor
	 */
	public Procedure()
	{
		procedureName = "";
		procedureDate = "";
		procedurePractitioner = "";	
		procedureCharges = 0;
	}
	/**
	 * Constructor that takes data as input and sets them.
	 * @param pName the procedure's name
	 * @param pDate the procedure's date
	 */
	//  Procedure(pName: String, pDate: String)
	public Procedure(String pName, String pDate)
	{
		procedureName = pName;
		procedureDate = pDate;
	}
	/**
	 * Constructor that takes data as input and sets them.
	 * @param pName the procedure's name
	 * @param pDate the procedure's date
	 * @param pPractioner the procedure's practitioner
	 * @param pCharges the procedure's charge
	 */
	public Procedure(String pName, String pDate, String pPractitioner, double pCharges)
	{
		procedureName = pName;
		procedureDate = pDate;
		procedurePractitioner = pPractitioner;
		procedureCharges = pCharges;
	}
	/**
	 * returns procedure's name
	 * @return a string for procedure name
	 */
	public String getName(){
		return procedureName;
	}
	/**
	 * returns procedure's date
	 * @return a string for procedure date
	 */
	public String getDate() {
		return procedureDate;
	}
	/**
	 * returns procedure's practitioner
	 * @return a string for procedure's practitioner
	 */
	public String getPractitioner() {
		return procedurePractitioner;
	}
	/**
	 * returns procedure's practitioner
	 * @return a double for procedure's charges
	 */
	public double getCharges() {
		return procedureCharges;
	}
	/**
	 * sets name of procedure
	 * @param newName the name of the inputted procedure name
	 */
	public void setName(String newName) {
		procedureName = newName;
	}
	/**
	 * sets date of procedure
	 * @param newDate the date of the inputted procedure date
	 */
	public void setDate(String newDate) {
		procedureDate = newDate;
	}
	/**
	 * sets name of procedure practitioner
	 * @param newPractitioner the name of the inputted procedure practitioner
	 */
	public void setPractitioner(String newPractitioner) {
		procedurePractitioner = newPractitioner;
	}
	/**
	 * sets charges of procedure
	 * @param newCharges, the charges of the procedure
	 */
	public void setCharges(double newCharges) {
		procedureCharges = newCharges;
	}
	/**
	 * Returns a string with relevant procedure information
	 */
	public String toString() {
		return ("\n\n       Procedure: "+ procedureName +"\n       ProcedureDate="+procedureDate+
				"\n       Practitioner="+procedurePractitioner+"\n       Charge="+procedureCharges);
	}
}
