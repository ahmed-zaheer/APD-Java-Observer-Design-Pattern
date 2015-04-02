
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Dog instances
		DogBot patch, ruby; 
		patch = new DogBot("Patch", 6, 4);		
		ruby = new  DogBot("Ruby", 6, 4);
		
		// DogWatcher
		DogWatcher henry, putty;
		henry = new DogWatcher("Henry");
		putty = new DogWatcher("Putty");
				
		patch.addObserver(henry);		
		patch.addObserver(putty);
		ruby.addObserver(putty);
		
		System.out.println("---------  Henry and Putty are observing Patch (DogBot) ------------");		
		patch.play();
		patch.eat();		
		patch.noise();
		patch.rest();
		
		patch.deleteObserver(putty);		
		System.out.println("\n------ Now Putty has removed from the Patch's observers list --------");
		patch.play();
		patch.eat();		
		patch.noise();
		patch.rest();
		
		System.out.println("\n-----  Now Putty is observing Ruby (DogBot) ------------");		
		ruby.play();
		ruby.eat();		
		ruby.noise();
		ruby.rest();
		
		// RacingDogBot
		RacingDogBot lucy = new RacingDogBot("Lucy", 2, 1);		
		DogWatcher watcher = new DogWatcher("Tom");
		lucy.addObserver(watcher);
		System.out.println("\n---------  Tom is observing Lucy (RacingDogBot) ------------");
		lucy.race();
		lucy.play();		
		lucy.rest();
		lucy.eat();		
	}

}
