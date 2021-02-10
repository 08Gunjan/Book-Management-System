package Book;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class bookManagement {

	static void msg() {
		System.out.println("Book not found!!!");
	}

	public static void main(String[] args) {

		ArrayList<bookDetails> list = new ArrayList <bookDetails>();


		list.add( new bookDetails(101, "c++", "anu", 240));
		list.add(new bookDetails(102, "android", "priya", 450));
		list.add(new bookDetails(103, "python", "sarthak", 240));
		list.add(new bookDetails(104, "javascript", "rishi", 270));
		list.add(new bookDetails(105, "java", "gourav", 180));
		Scanner sc= new Scanner(System.in);
		boolean y=true;
		while(y) {
			System.out.println("enter a choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:{
				System.out.println("all the books in array list");
				//	Iterator itr=list.iterator();
				//	while(itr.hasNext()) {
				//		bookDetails obj=(bookDetails)itr.next();
				//		System.out.println(obj.toString());
				//}

				for(int i=0;i<list.size();i++) {
					bookDetails ab=list.get(i);
					System.out.println(ab.toString());
				}
				break;
			}
			case 2:
				System.out.println("add a book");
				list.add(new bookDetails(sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
				break;
			case 3:
				System.out.println("enter book name");
				int flag=0;
				String bookname=sc.next();
				for(int i=0;i<list.size();i++) {
					String obj=list.get(i).getName();
					if(bookname.equals(obj)) {
						flag=1;
						System.out.print(list.get(i).toString());
					}				
				}
				if(flag==0)
					msg();	
				break;
			case 4:
				System.out.println("enter book id ");
				flag=0;
				int k=sc.nextInt();
				for(int i=0;i<list.size();i++) {
					int obj=list.get(i).getId();
					if(k==obj) {
						flag=1;
						System.out.print(list.get(i).toString());
					}				
				}
				if(flag==0)
					msg();	
				break;
			case 5:
				System.out.println("to update, enter a id");
				flag=0;
				int a=sc.nextInt();
				for(int i=0;i<list.size();i++) {
					if(a==list.get(i).getId()) {
						flag=1;
						bookDetails b= list.get(i);
						b.setName(sc.next());
						b.setAuthor(sc.next());
						b.setPrice(sc.nextInt());
						System.out.println("Updated successfully!!");
					}
				}
				if(flag==0)
					msg();

				break;
			case 6:
				System.out.println("enter id,to delete a book ");
				flag=0;
				k=sc.nextInt();
				for(int i=0;i<list.size();i++) {
					if(k==list.get(i).getId()) {
						flag=1;
						list.remove(i);
						System.out.println("Deleted successfully!!");
					}
				}
				if(flag==0)
					msg();

				break;
			case 7:
				System.out.println("delete all the books ");
				list.clear();
				break;
			default:
				y=false;
			}
		}

	}

}
