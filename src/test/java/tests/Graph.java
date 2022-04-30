package tests;

import pageObjects.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.*;

public class Graph extends BaseClass{
	
	
	/*GraphPage gp= new GraphPage(driver);
	GraphGraphPage ggp = new GraphGraphPage(driver);
	GraphGraphRepPage ggrefp= new GraphGraphRepPage(driver);
	TryEditorPage tep = new TryEditorPage(driver);*/
	
	@Test(priority=0)
	public void selectGraphfromDropdown()
	{
		CommonLinks cl = new CommonLinks(driver);
		cl.selectDSFromDropdown("Graph");
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("graph"));
	}
	
	//rerun a specific method for particular number of times if its failed
	//@Test(priority=1,retryAnalyzer = listeners.RetryAnalyzer.class)
	
	@Test(priority=1)
	public void movetoGraphExp() {
		//creating objects for page object class
		GraphPage gp= new GraphPage(driver);
		GraphGraphPage ggp = new GraphGraphPage(driver);
		TryEditorPage tep = new TryEditorPage(driver);
		
		//click on graph
		gp.clickOnGraph();
		
		//verify we are in graph graph page
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("ggraph") );
		
		//click try here option on graph graph page 
		ggp.clickOnTryHere();
		
		//Assert we are on try editor page
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("tryeditor") );
		
		//send python code in try editor page and run
		tep.sendCode();
		tep.clickRunButton();
		
		
	}
	@Test(priority=2)
	public void movetoGraphrepExp() {
		//creating objects for page object class
		GraphPage gp= new GraphPage(driver);
		GraphGraphRepPage ggrefp= new GraphGraphRepPage(driver);
		TryEditorPage tep = new TryEditorPage(driver);
		
		//move to graph page
		driver.navigate().to(prop.getProperty("graph"));
		
		//click on graph rep link in graph page
		gp.clickOnGraphRep();
		
		//Assert we are on graph rep page
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("ggraphrep") );
		
		//click on try here page in graph rep page
		ggrefp.clickOnTryHere();
		
		//Assert we are on try editor page
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("tryeditor") );
		
		//send python code in try editor page and run				
		tep.sendCode();
		tep.clickRunButton();
		
		driver.navigate().to(prop.getProperty("home"));
		
	}
	
	@Test(priority=3)
	public void signout() {
		CommonLinks cl = new CommonLinks(driver);
		//signout 
		cl.clickOnSignOutLink();
	}

}
