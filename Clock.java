package Clock.Task;

public class Clock {
	public static void main(String[] args) {
       System.out.println(getStringDuration(120,50));
        }
	public static String getStringDuration(int min,int sec)
	{
		int hour=0,minute=0,seconds=0;
		if(min>=0&&sec>=0&&sec<=59)
		{
			hour=minute/60;
			minute=min%60;
			return hour+"h "+min+"m "+sec+" s";
		}
		return "invalid ";
	}
	 public static String getStringDuration(int sec) {
	        String string = "";
	        if (sec >= 0) {
	            string = getStringDuration(sec/60, sec % 60);

	        }else {
	        	return "Invalid value";
	        }
        
}
}

