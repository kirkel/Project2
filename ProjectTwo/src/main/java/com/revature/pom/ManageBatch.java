package com.revature.pom;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.revature.hibernate.entity.Batch;

public class ManageBatch extends POM{


	public ManageBatch(WebDriver driver) {
		super(driver);
	}	
	
	public WebElement getYearDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/a"));
	}
	
	public WebElement selectYearDropdown(String year) {
		int yearselection = Integer.parseInt(year);
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/a")).click();
		int selection = 0;
		switch(yearselection) {
		case 2019:
			selection = 1;
			break;
		case 2018:
			selection = 2;
			break;
		case 2017:
			selection = 3;
			break;
		case 2016:
			selection = 4;
			break;
		default: 
			throw new IllegalArgumentException("The year must be between 2016 and 2019");
		}
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/ul/li["+ selection +"]/a"));
	}
	
	// -------------- Import Batch screen --------------
	
	public WebElement importBatch() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a"));
	}
	
	public WebElement exitImportBatch() {
		return driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[1]/button/span"));
	}
		
	public WebElement submitImportBatch() {
		return driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[3]/input"));
	}
	
	public WebElement closeImportBatch() {
		return driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[3]/button"));
	}
	
	
	// -------------- Create New Batch screen --------------
	
	public WebElement createNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]/a"));
	}
	
	public WebElement saveCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/input"));
	}
	
	public WebElement closeCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/button"));
	}
	
	public WebElement exitCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[1]/button/span"));
	}
	
	// importId
	// trainingName, trainingType, goodGrade, borderlineGrade
	public WebElement getWebElementWithId(String Id) {
		return driver.findElement(By.xpath("//*[@id=\""+ Id +"\"]")); 
	}
	
	//trainingType, skillType, location, trainer, co-trainer
	public void getDropdownSelection(String elementId, String selection) {
		WebElement mySelectElement = driver.findElement(By.xpath("//*[@id=\"" + elementId + "\"]"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText(selection);		
	}
	
	// start-date, end-date
	public WebElement getDateElement(String startdate_enddate) {
		return driver.findElement(By.xpath("//*[@id=\""+ startdate_enddate +"\"]/input"));
	}
	// start-date, end-date
	public WebElement getDateIcon(String startdate_enddate) {
		return driver.findElement(By.xpath("//*[@id=\""+ startdate_enddate +"\"]/span"));
	}

	
	// ------------ Trainee Screen ------------
	
	public WebElement getTraineeScreen(String batchName) {
		return getBatchTableEntry("trainingName", batchName, "addTrainee");
	}
	
	public WebElement exitTraineeScreen() {
		return driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[1]/button"));
	}
	
	public WebElement getActiveToggle() {
		return driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[1]/div/a[1]"));
	}
	
	public WebElement getAddNewTrainee() {
		return driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/div/a"));
	}
	
	// wow what a terrible solution; someone please fix
	// the goal of this is to find where on the table the trainee with the traineeName is, and return that position 
	// wrote it this way so it can be used by other methods, but it turns out it's pretty inefficient 
	public int getTraineeOrderFromTable(String traineeName) {
		int selection = 1;
		while(true) {
//			WebElement toBeReturned = driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr["+ selection + "]"));
			WebElement traineeNameElement = driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[" + selection + "]/td[1]"));
			if(traineeNameElement.getAttribute("innerHTML").equals(traineeName)) {
				return selection;
			}
			selection++;
			if(selection > 100) {
				throw new IllegalArgumentException("The trainee was not found, or not likely to be found");
			}
		}
	}
	
	// gets the various flag options associated with a trainee, given their traineeName
	// the flagId is a construct used to abstract what you wish to do with the flag given some trainee 
	public WebElement getFlagTrainee(String traineeName, String flagId) {
		int selection = getTraineeOrderFromTable(traineeName);
		switch(flagId) {
		case "flagToggle":
			return driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr["+ selection + "]/td[1]"));
		case "flagComment":
			return driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[" + selection + "]/td[2]/form/input[1]"));
		case "flagSave":
			return driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[" + selection + "]/td[2]/form/input[2]"));
		case "flagExit":
			return driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[" + selection + "]/td[2]/form/span"));
		default:
			throw new IllegalArgumentException("The trainee or flagId was not found, or not likely to be found");
		}
	}
	
	// ------------ Update Trainee Screen ------------
	public WebElement getUpdateTrainee() {
		return driver.findElement(By.xpath("//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[14]/a"));
	}
	
	// ------------ Add Trainee Screen ------------
	
	public WebElement getNewTraineeScreenTitle() {
		return driver.findElement(By.xpath("//*[@id=\\\"addTraineeModal\\\"]/div/div/div[2]/h3"));
	}
	
	public WebElement exitNewTraineeScreen() {
		return driver.findElement(By.xpath("//*[@id=\"addTraineeModal\"]/div/div/div[1]/button"));
	}
	
	public WebElement closeNewTraineeScreen() {
		return driver.findElement(By.xpath("//*[@id=\"addTraineeModal\"]/div/div/div[2]/div[2]/button[1]"));
	}
	
	public WebElement getAddNewTraineeInfo(String traineeInfoId) {
		return driver.findElement(By.xpath("//*[@id=\""+ traineeInfoId + "\"]"));
	}
	
	public WebElement getNewTraineeTrainingStatus(String trainingStatus) {
		driver.findElement(By.xpath("//*[@id=\"traineeStatus\"]")).click();
		int selection = 2;
		while(true) {
			WebElement toBeReturned = driver.findElement(By.xpath("//*[@id=\"traineeStatus\"]/option["+ selection + "]"));
			if(toBeReturned.getAttribute("innerHTML").equals(trainingStatus)) {
				return toBeReturned;
			} else if(selection > 20) {
				// 20 is arbitrary, it's unlikely to find a training status greater than this in the scope of the site
				throw new IllegalArgumentException("The training status was not found, or not likely to be found");
			}
			selection++;
		}
	}
	
	public WebElement saveNewTrainee() {
		return driver.findElement(By.xpath("//*[@id=\"addTraineeModal\"]/div/div/div[2]/div[2]/input[1]"));
	}
	
	
	
	// ------------ Reading the Table ------------
	
	public WebElement updateBatch(Batch batch) {
		return getBatchTableEntry("trainingName", batch.getTrainingName(), "updateBatch");
	}
	
	@SuppressWarnings("unused")
	public int getTraineeSelection(String selectionId) {
		int infoSelection = 0;
		switch(selectionId) {
		case "trainingName":
			return infoSelection = 1;
		case "trainingType":
			return infoSelection = 2;
		case "skillType":
			return infoSelection = 3;
		case "trainer":
			return infoSelection = 4;
		case "co-trainer":
			return infoSelection = 5;
		case "location":
			return infoSelection = 6;
		case "start-date":
			return infoSelection = 7;
		case "end-date":
			return infoSelection = 8;
		case "goodGrade":
			return infoSelection = 9;
		case "passingGrade":
			return infoSelection = 10;
		case "addTrainee":
			return infoSelection = 11;
		case "updateBatch":
			return infoSelection = 12;
		case "deleteBatch":
			return infoSelection = 13;
		default:
			throw new IllegalArgumentException("The table selection must be a valid tag");
	}
		
	}
		
	
	public WebElement getBatchTableEntry(String elementIdToCompare, String batchInfoToCompare, String elementIdToReturn) {
		int infoSelection = 0;
		int idReturn = 0;
		infoSelection = getTraineeSelection(elementIdToCompare);
		idReturn = getTraineeSelection(elementIdToReturn);
			
		List<WebElement> tableElements = driver.findElements(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr"));
		if(tableElements.size() == 0) {
			throw new IllegalArgumentException("The table is empty");
		} else if(tableElements.size() == 1) {
			if(infoSelection > 10) {
				return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr/td[" + idReturn + "]/a"));
			}
			return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr/td[" + idReturn + "]"));
		} else {
			int selectionIterator = 1;
			WebElement elementFound = null;
			while(true) {
				if(infoSelection > 10) {
					elementFound = driver.findElement(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr["+ selectionIterator + "]/td[" + infoSelection + "]/a"));
					String tableEntry = elementFound.getAttribute("innerHTML");
					if(tableEntry.equals(batchInfoToCompare))
						return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr["+ selectionIterator + "]/td[" + idReturn + "]/a"));
					else if(selectionIterator > tableElements.size())
						throw new IllegalArgumentException("The batch info being compared was not found");
				} else {
					elementFound = driver.findElement(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr["+ selectionIterator + "]/td[" + infoSelection + "]"));
					String tableEntry = elementFound.getAttribute("innerHTML");
					if(tableEntry.equals(batchInfoToCompare))
						return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr["+ selectionIterator + "]/td[" + idReturn + "]"));
					else if(selectionIterator > tableElements.size())
						throw new IllegalArgumentException("The batch info being compared was not found");
				}
				selectionIterator++;
			}
		}
	}
	
	
	
	
}






