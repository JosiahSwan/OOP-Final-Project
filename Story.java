//  Final Exam,       
//  Author: Josiah Swanner
//  Date: 5/07/2024
/*  Lab Purpose: Create a class Story that extends Podcast and implements ILibrary and IPlay.
 * This class has attributes to store a narrator and an author, and overrides the showDetails, start, and stop methods.
 * This class is a leaf in the Composite Design Pattern.
 */
package FinalExam;

//Leaf
public class Story extends Podcast implements ILibrary, IPlay {
	//ATTRIBUTES
	private String narrator;
	private String author;
	
	//CONSTRUCTORS
	//Parameterized Constructor
	public Story(String title, int minutes, String narrator, String author) {
		super(title, minutes);
		this.narrator = narrator;
		this.author = author;
	}

	//GETTERS AND SETTERS
	public String getNarrator() {
		return narrator;
	}

	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//METHODS
	//Override the showDetails method
	@Override
	public void showDetails() {
		System.out.println(toString());
		System.out.println("Narrator: " + getNarrator());
		System.out.println("Author: " + getAuthor());
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
