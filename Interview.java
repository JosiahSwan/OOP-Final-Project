//  Final Exam,       
//  Author: Josiah Swanner
//  Date: 5/07/2024
/*  Lab Purpose: Create a class Interview that extends Podcast and implements ILibrary and IPlay.
 * This class has attributes to store a host and a guest, and overrides the showDetails, start, and stop methods.
 * This class is a leaf in the Composite Design Pattern.
 */
package FinalExam;

//Leaf
public class Interview extends Podcast implements ILibrary, IPlay {
	//ATTRIBUTES
	private String host;
	private String guest;
	
	//CONSTRUCTORS
	//Parameterized Constructor
	public Interview(String title, int minutes, String host, String guest) {
		super(title, minutes);
		this.host = host;
		this.guest = guest;
	}

	//GETTERS AND SETTERS
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}
	
	//METHODS
	//Override the showDetails method
	@Override
	public void showDetails() {
		System.out.println(toString());
		System.out.println("Host: " + getHost());
		System.out.println("Guest: " + getGuest());
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
