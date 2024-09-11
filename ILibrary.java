//  Final Exam,       
//  Author: Josiah Swanner
//  Date: 5/07/2024
/*  Lab Purpose: Create an Interface ILibrary to be implemented by the PodcastComposite, Interview, Educational, and Story classes.
 * This interface has the showDetails method as an abstract method to display the details of each class that implements it.
 * This class is a component in the Composite Design Pattern.
 */
package FinalExam;

//Component
public interface ILibrary {
	//Method to print the details of a leaf or composite
	void showDetails();

}
