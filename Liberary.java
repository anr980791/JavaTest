package LibraryManagement.src.CTS_Text_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Liberary {
	public static void main(String []args) throws Exception
	{
		List<AddBook> ablist=new ArrayList<AddBook>();
		List<AddStudent> stlist=new ArrayList<AddStudent>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
		System.out.println("1.Add Book\n"
				+ "2.Add Student \n"
				+ "3.Update Book \n"
				+ "4.Delete Book \n"
				+ "5.Issue Book To Students\n"
				+ "6.Display List Of Students\n"
				+ "7.Display List of Book\n"
				+ "8.Search Student By Id and display List Of Books Issued to Student\n"
				+ "9.Search Book By Id and display List Of Student Books has Issued\n"
				+ "10.Exite");
		int choise=Integer.parseInt(br.readLine());
		switch(choise)
		{
		case 1:
			//add book
			System.out.println("Enter Book Id");
			int book_Id=Integer.parseInt(br.readLine());
			System.out.println("Enter Book Name");
			String book_Name=br.readLine();
			System.out.println("Enter Aurthor Name");
			String book_Aurthor=br.readLine();
			System.out.println("Enter Book Publisher");
			String book_Publisher=br.readLine();
			AddBook ab=new AddBook(book_Id, book_Name, book_Aurthor, book_Publisher);
			ablist.add(ab);
			break;
		case 2:
			//add Student
			System.out.println("Enter Student Id");
			int student_Id=Integer.parseInt(br.readLine());
			System.out.println("Enter Student Name");
			String student_Name=br.readLine();
			System.out.println("Enter Student Branch");
			String student_Branch=br.readLine();
			AddStudent as=new AddStudent(student_Id, student_Name, student_Branch);
			stlist.add(as);
			break;
		case 3:
			//update book
			System.out.println("Enter Book Id");
			int update_book_Id=Integer.parseInt(br.readLine());
			System.out.println("Enter Book Name");
			String update_book_Name=br.readLine();
			UpdateBook upb=new UpdateBook();
			upb.update(update_book_Id, update_book_Name, ablist);
			break;
		case 4:
			//delete book
			System.out.println("Enter Book Id");
			int delete_book_Id=Integer.parseInt(br.readLine());
			RemoveBook.remove(delete_book_Id,ablist);
			break;
		case 5:
			//issue book to student
			System.out.println("Enter Student Id");
			int sid=Integer.parseInt(br.readLine());
			System.out.println("Enter Book Id");
			int bid=Integer.parseInt(br.readLine());
			IssueBook.issue(ablist,stlist,sid,bid);
			
			break;
		case 6:
			//display list of student
			AddStudent.display(stlist);
			break;
		case 7:
			//display list of Book
			AddBook.display(ablist);
			break;
		case 8:
			//Search Student By Id and display List Of Books Issued to Student
			System.out.println("Enter Student Id");
			int sid1=Integer.parseInt(br.readLine());
			IssueBook.searchByStudentId(ablist,stlist,sid1);
			break;
		case 9:
			//9.Search Book By Id and display List Of Student Books has Issued
			System.out.println("Enter Book Id");
			int bid1=Integer.parseInt(br.readLine());
			IssueBook.searchByBookId(ablist,stlist,bid1);
			break;
		case 10:
			System.exit(0);
			break;
			
		}
		}
		
		
	}
	

}
