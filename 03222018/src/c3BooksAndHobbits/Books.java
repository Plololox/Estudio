package c3BooksAndHobbits;

public class Books {
	String tittle;
	String author;

}
class BookTestDrive{
	public static void main(String[]args) {
		Books[]myBooks=new Books[3];
		
		myBooks[0]=new Books();
		myBooks[1]=new Books();
		myBooks[2]=new Books();
		myBooks[0].tittle="The Grapes of Java";
		myBooks[1].tittle="The Java Gatsby";
		myBooks[2].tittle="The Java Cookbook";
		myBooks[0].author="Bob";
		myBooks[1].author="Sue";
		myBooks[2].author="Ian";
		
		int x=0;
		while(x<3) {
			System.out.println(myBooks[x].tittle);
			System.out.println(" by ");
			System.out.println(myBooks[x].author);
			x=x+1;
		}
	}
}