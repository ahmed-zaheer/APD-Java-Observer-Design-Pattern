import java.util.*;

public class DogBot extends Observable
{
	protected String name;	
	protected int hungry,tired;
		
	public DogBot(String n, int h,int t)
	{		
		name = n;
		hungry= h;
		tired= t;
	}

	public boolean eat()
	{
		
		if(hungry > 6)
		{
			hungry -= 3;
			notifyChange("eat");
			return true;
		}
		else
			return false;
	}

	public void rest()
	{
		hungry++;
		tired -= 2;
		
		notifyChange("rest");
	}

	public void play()
	{
		hungry += 2;
		tired += 3;
		notifyChange("play");
		
	}

	public String noise()
	{		
		if(hungry > 8 && tired < 11)
		{
			return "whine";
		}
		else if(tired > 7 && tired > hungry)
		{
			return "snore";
		}
		else
		{
			return "woof";
		}	
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	protected void notifyChange(String action)
	{
		setChanged();
		notifyObservers(action);
	}
	
}