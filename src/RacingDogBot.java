public class RacingDogBot extends DogBot
{	
	public RacingDogBot(String name, int h,int t)
	{
		super(name, h,t);
	}

	public boolean race()
	{
		if(tired < 5)
		{
			hungry += 2;
			tired += 5;			
			notifyChange("race");
			return true;
		}
		else
			return false;
	}

	public void rest()
	{
		hungry++;
		tired-=3;

		notifyChange("rest");
	}
}