
	//business logic class

package blc_elc;

public class Library {
	
	int bookId;
	String author;
	String title;
	double price;
	int pages;
	
	public void setBookDetails( int id,String au,String ti,double rs ,int page) {
		bookId=id;
		author=au;
		title=ti;
		price=rs;
		pages=page;
		
	}
	
	
	public String displayBookDetails() {
		
		return "book ID is :"+ bookId +"\n"+"name of author :"+ author
				+"\n"+"Book title :"+title+"\n"
				+"Price of book :"+price+"\n"+"no of pages :"+pages;
		
	}

}
