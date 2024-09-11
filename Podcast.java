//  Final Exam,       
//  Author: Josiah Swanner
//  Date: 5/07/2024
/*  Lab Purpose: Create an abstract class Podcast to be extended by the Interview, Educational, and Story classes.
 * This class contains attributes for the title and length in minutes of a podcast. It also overrides the toString method
 * and contains an abstract method to show the details of a podcast.
 */
package FinalExam;

public abstract class Podcast {
	//ATTRIBUTES
	private String title;
	private int minutes;
	
	//CONSTRUCTORS
	//Parameterized Constructor
	public Podcast(String title, int minutes) {
		super();
		this.title = title;
		this.minutes = minutes;
	}

	//GETTERS AND SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	//METHODS
	//Override the toString method
	@Override
	public String toString() {
		String output = "Podcast Title: " + getTitle();
		output += "\nLength: " + getMinutes() + " minutes";
		return output;
	}
	
	//Abstract method to show the details of a podcast
	abstract void showDetails();

}
