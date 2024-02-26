/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Assignment 2
 * Description: PatientDriverApp runs and displays information about a Patient's 3 procedures
 * and patient information
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Kaitlyn Vu
*/
public class PatientDriverApp {
	public static void main(String[] args) {
		Patient patient = new Patient("Andrew", "Dookie", "Calovie", "0492 Diamond Road", "Las Vegas", "Nevada", "3713", "943-943-4321", "Brandon Che", "321-123-9432");
		Procedure procedure1 = new Procedure("Heart Transplant Surgery", "03/10/2024", "Dr. Roody", 3321.23);
		Procedure procedure2 = new Procedure("C-Section Surgery", "06/20/2024", "Dr. Tran", 1293.83);
		Procedure procedure3 = new Procedure("Hair Transplant Surgery", "09/09/2024", "Dr. Baldie", 9322.32);
		System.out.println("Patient Info: ");
		displayPatient(patient);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		System.out.printf("\n\nTotal Charges: $%,.2f\n", calculateTotalCharges(procedure1, procedure2, procedure3));
		System.out.println("\nThe program was developed by a Student: Kaitlyn Vu <02/26/24>");
	}
	public static void displayPatient (Patient samplePatient) {
		System.out.print(samplePatient.toString());
	}
	public static void displayProcedure (Procedure sampleProcedure) {
		System.out.print(sampleProcedure.toString());
	}
	public static double calculateTotalCharges(Procedure sampleP1, Procedure sampleP2, Procedure sampleP3) {
		return sampleP1.getCharges() + sampleP2.getCharges() + sampleP3.getCharges();
	}
}
