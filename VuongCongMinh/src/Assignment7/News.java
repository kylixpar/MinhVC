package Assignment7;


public class News implements INews{
	public int ID;
	public String Title;
	public String PublishDate;
	public String Author;
	public String Content;
	public float AverageRate;
	int[] RateList;
	public News(int ID, String Title, String PublishDate, String Author, String Content, int[] RateList) {
		this.ID = ID;
		this.Title = Title;
		this.PublishDate = PublishDate;
		this.Author = Author;
		this.Content = Content;
		this.RateList = RateList;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String PublishDate) {
		this.PublishDate = PublishDate;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String Author) {
		this.Author = Author;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String Content) {
		this.Content = Content;
	}
	public float getAverageRate() {
		return AverageRate;
	}
	@Override
	public void Display() {
		System.out.println(this.Title + "-" + this.PublishDate + "-" + this.Author + "-" + this.Content + "-" + this.AverageRate);
	}
	 public void Calculate() {
		 int result = 0;
		 for (int value: RateList) {
			 result += value;
		 }
		 this.AverageRate = Float.valueOf(result/3);
	 }
}
