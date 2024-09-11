//  Final Exam,       
//  Author: Josiah Swanner
//  Date: 5/07/2024
/*  Lab Purpose: Create a class Educational that extends Podcast and implements ILibrary and IPlay.
 * This class has attributes to store a subject and a description, and overrides the showDetails, start, and stop methods.
 * This class is a leaf in the Composite Design Pattern.
 */
package FinalExam;

//Leaf
public class Educational extends Podcast implements ILibrary, IPlay {
	//ATTRIBUTES
	private String subject;
	private String description;
	
	//CONSTRUCTORS
	//Parameterized Constructor
	public Educational(String title, int minutes, String subject, String description) {
		super(title, minutes);
		this.subject = subject;
		this.description = description;
	}

	//GETTERS AND SETTERS
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	//METHODS
	//Override the showDetails method
	@Override
	public void showDetails() {
		System.out.println(toString());
		System.out.println("Subject: " + getSubject());
		System.out.println("Description: " + getDescription());
	}
	
	//Override the start method
	@Override
	public void start() {
		System.out.println("Started playing " + getTitle());
	}
	
	//Override the stop method
	@Override
	public void stop() {
		System.out.println("Stopped playing " + getTitle());
	}

}
