package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int maxcount=2;
	int counter=0;
	@Override
	public boolean retry(ITestResult result) {
		if(counter<maxcount) {
			counter++;
			return true;
		}
		return false;
	}

}
