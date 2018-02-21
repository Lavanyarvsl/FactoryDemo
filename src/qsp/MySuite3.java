package qsp;

import org.testng.annotations.Factory;

public class MySuite3 {
	@Factory
	public Object[] runTest() throws Exception
	{
		String[] allTN= {"qsp.DemoA","qsp.DemoB"};
		
		int count=allTN.length;
		Object[] allTest=new Object[count];
		
		
		for(int i=0;i<count;i++)
		{
			String tn=allTN[i];
			Object test=Class.forName(tn).newInstance();
			allTest[i]=test;
			
		}
		
		return allTest;
		
	}
	
}
