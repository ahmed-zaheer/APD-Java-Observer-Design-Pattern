import java.util.*;

public class DogWatcher implements Observer{

	String name;
	
	public DogWatcher(String name)
	{
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) 
	{
		String state = new String();
		state = arg != null ? arg.toString() : null;
		if (o instanceof DogBot)
		{
			DogBot db = (DogBot) o;
			System.out.println(this.name + " observes " + db.toString() + " " + state);
		}		
	}

}
