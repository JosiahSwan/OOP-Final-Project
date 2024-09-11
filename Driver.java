//  Final Exam,       
//  Author: Josiah Swanner
//  Date: 5/07/2024
/*  Lab Purpose: Create a driver program to test the PodcastComposite, Interview, Educational, and Story classes.
 * Test the PodcastComposite by adding Interview, Educational, and Story objects to a PodcastComposite object.
 * Then test the showDetails, start, and stop methods of each class.
 */
/* Resources Used
- **Online Tutorial**: [Stack Overflow Response](https://stackoverflow.com/a/18019745) - Demonstrated how to check if a class implements an interface
*/
package FinalExam;

/**
 * 
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create the PodcastComposite object
		PodcastComposite playlist = new PodcastComposite();
		
		//Add podcasts to the playlist
		printLine();
		System.out.println("Adding Podcasts to the Playlist");
		printLine();
		
		playlist.addPodcast(new Interview("Interview with Obama", 13, "Steven Jenkins", "Barack Obama"));		
		podcastAddMessage(playlist.getPodcastList().get(0));
		
		playlist.addPodcast(new Story("The Lion the Witch and the Wardrobe", 503, "Barry Alan", "C. S. Lewis"));
		podcastAddMessage(playlist.getPodcastList().get(1));
		
		playlist.addPodcast(new Educational("Object Oriented Programming Lecture", 55, "Object Oriented Programming", "The Fundamentals of OOP"));
		podcastAddMessage(playlist.getPodcastList().get(2));
		System.out.println();
		
		//Display the details of the playlist
		printLine();
		System.out.println("Displaying the Entire Playlist");
		printLine();
		playlist.showDetails();
		
		//Start and stop each item in the playlist
		printLine();
		System.out.println("Playing Podcasts from the Playlist");
		printLine();
		
		for(Podcast podcast : playlist.getPodcastList()) {
			//Ensure the podcast implements IPlay
			if(IPlay.class.isAssignableFrom(podcast.getClass())) {
				System.out.println("Playing " + podcast.getClass().getSimpleName() + " Podcast:");
				IPlay iPlayPodcast = (IPlay) podcast;
				iPlayPodcast.start();
				iPlayPodcast.stop();
				System.out.println();
			}
		}

	} //END MAIN
	
	//Function to print a line
	private static void printLine() {
		System.out.println("-------------------------------------------------------");
	}
	
	//Function to print the podcast added message
	private static void podcastAddMessage(Podcast podcast) {
		System.out.println(podcast.getTitle() + " added to playlist");
	}

} //END CLASS
