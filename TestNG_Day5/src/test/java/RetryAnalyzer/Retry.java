package RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	int maxcounter = 4;
	int counter = 0;
	
	@Override
	public boolean retry(ITestResult result)
	{
		if (counter < maxcounter)
		{
			counter ++;
			return true;
		}
		
		return false;
	}
	
	
}
