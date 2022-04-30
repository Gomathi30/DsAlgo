package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.*;

public class Queue extends BaseClass{
	
	@Test(priority = 1)
	public void movetoQueuePage() {
		driver.navigate().to(prop.getProperty("home"));
		
		HomePage hp=new HomePage(driver);
		//click get started queue button in home page
		hp.clickonQueueGetStartedlnk();
		
	}
	
	@Test (priority=2)
	public void navigateQImplUsingList() {
		
		//create page class objects
		QueuePage qp=new QueuePage(driver);
		QueueImplementationListPage qilp = new QueueImplementationListPage(driver);
		TryEditorPage tep = new TryEditorPage(driver);
		
		//Assert we are on queue page
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("queue"));
		
		qp.clickOnQImplUsingListLink();
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("queuelist"));
		
		qilp.clickOnPracticeQuesLink();
		driver.navigate().back();
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("queuelist"));
		 
		qilp.clickOnTryEditorLink();
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("tryeditor"));
		
		tep.sendCode();
		tep.clickRunButton();
		driver.navigate().back();
		
		
		
	}
	
	@Test(priority=3)
	public void navigateQueueUsingCollections() {
		Assert.assertEquals
		(driver.getCurrentUrl(), prop.getProperty("queuelist"));
		
		QueueImplementationListPage qilp = new QueueImplementationListPage(driver);
		QueueImplementCollectionPage qicp = new QueueImplementCollectionPage(driver);
		TryEditorPage tep = new TryEditorPage(driver);
		
		qilp.clickOnQImplCollectionListLink();
		qicp.clickOnPracticeQuesLink();
		driver.navigate().back();
		qicp.clickOnTryEditorLink();
		
		tep.sendCode();
		tep.clickRunButton();
		
		driver.navigate().back();
				
	}
	
	@Test(priority=4)
	public void navigateQueueUsingArray() {
		Assert.assertEquals
		(driver.getCurrentUrl(), prop.getProperty("queuecollection"));
		
		QueueImplementCollectionPage qicp = new QueueImplementCollectionPage(driver);
		QueueImplementationArrayPage qiap= new QueueImplementationArrayPage(driver);
		TryEditorPage tep = new TryEditorPage(driver);
		
		qicp.clickOnQImplCollectionListLink();
		qiap.clickOnPracticeQuesLink();
		driver.navigate().back();
		qiap.clickOnTryEditorLink();
		
		tep.sendCode();
		tep.clickRunButton();
		driver.navigate().back();
				
	}
	
	@Test(priority=5)
	public void navigateQueueQueueOp() {
		Assert.assertEquals
		(driver.getCurrentUrl(), prop.getProperty("queuearray"));
		
		QueueImplementationArrayPage qiap= new QueueImplementationArrayPage(driver);
		QueueQueueOperationsPage qqop = new QueueQueueOperationsPage(driver);
		TryEditorPage tep = new TryEditorPage(driver);
		
		qiap.clickOnQImplCollectionListLink();
		qqop.clickOnPracticeQuesLink();
		driver.navigate().back();
		qqop.clickOnTryEditorLink();
		
		tep.sendCode();
		tep.clickRunButton();
		driver.navigate().back();
				
	}
	
}
