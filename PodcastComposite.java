//  Final Exam,       
//  Author: Josiah Swanner
//  Date: 5/07/2024
/*  Lab Purpose: Create a class PodcastComposite that implements ILibrary.
 * This class stores an ArrayList of Podcasts, and overrides the showDetails method to iterate through the
 * ArrayList and use the showDetails method of each item in the ArrayList.
 * This class is a composite in the Composite Design Pattern.
 */
package FinalExam;

import java.util.ArrayList;

//Composite
public class PodcastComposite implements ILibrary {
	//ATTRIBUTES
	private ArrayList<Podcast> podcastList = new ArrayList<>();
	
	//GETTERS
	public ArrayList<Podcast> getPodcastList() {
		return podcastList;
	}
	
	//METHODS
	//Override the method to show details
	@Override
	public void showDetails() {
		for(Podcast podcast : podcastList) {
			podcast.showDetails();
			System.out.println();
		}
	}
	
	//Method to add a podcast
	public void addPodcast(Podcast podcast) {
		podcastList.add(podcast);
	}
	
	//Method to remove a podcast
	public void removePodcast(Podcast podcast) {
		podcastList.remove(podcast);
	}

}
