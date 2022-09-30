package pomTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.ReusableMethod;

public class Searchhotelpom  extends ReusableMethod {
	
	public Searchhotelpom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement dbnlocation;

	@FindBy(id="hotels")
	private WebElement dbnhotels;

	@FindBy(id="room_type")
	private WebElement dbnroom_type;

	@FindBy(id="room_nos")
	private WebElement dbnroom_nos;

	@FindBy(id="datepick_in")
	private WebElement dbndatepick_in;

	@FindBy(id="datepick_out")
	private WebElement dbndatepick_out;

	@FindBy(id="adult_room")
	private WebElement dbnadult_room;

	@FindBy(id="child_room")
	private WebElement dbnchild_room;

	@FindBy(id="Submit")
	private WebElement dbnSubmit;

	public WebElement getDbnlocation() {
		return dbnlocation;
	}

	public WebElement getDbnhotels() {
		return dbnhotels;
	}

	public WebElement getDbnroom_type() {
		return dbnroom_type;
	}

	public WebElement getDbnroom_nos() {
		return dbnroom_nos;
	}

	public WebElement getDbndatepick_in() {
		return dbndatepick_in;
	}

	public WebElement getDbndatepick_out() {
		return dbndatepick_out;
	}

	public WebElement getDbnadult_room() {
		return dbnadult_room;
	}

	public WebElement getDbnchild_room() {
		return dbnchild_room;
	}

	public WebElement getDbnSubmit() {
		return dbnSubmit;
	}

	public void search(String location, String hotelsselect, String roomType, String roomNo, String datePickin, String datePickOut, String adultRoom,
			String childRoom) {

selectVisible(dbnlocation, location);
selectVisible(dbnhotels, hotelsselect);
selectVisible(dbnroom_type, roomType);
selectVisible(dbnroom_nos, roomNo);
enterText(dbndatepick_in, datePickin);
enterText(dbndatepick_out, datePickOut);
selectVisible(dbnadult_room, adultRoom);
selectVisible(dbnchild_room, childRoom);
Click(dbnSubmit);
	}



}
