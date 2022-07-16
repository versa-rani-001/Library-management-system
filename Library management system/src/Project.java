import java.util.Scanner;

public class Project {
      
      
	public static void main(String[] args)
	{
		char r;
		do {
		System.out.println("*********************Library Management System***********************");
		System.out.println("Press 1 to add Book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return a book");
		System.out.println("Press 4 to print complete issue details");
		System.out.println("Press 5 to exist");
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=obj1.nextInt();
		switch(a)
		{
		case 1:
			library aa=new library();
			aa.add();
			break;
		case 2:
			library bb=new library();
			bb.iss();
			break;
		case 3:
			library cc=new library();
			cc.ret();
			break;
		case 4:
			library is=new library();
			is.detail();
			break;
		case 5:
			library add=new library();
			add.exit();
			break;
			default:
				System.out.println("Invalid number");
		}
		System.out.println("you want to select next option Y/N");
		r=obj1.next().charAt(0);
		}while(r=='y' || r=='Y');
		if(r=='n' || r=='N')
		{
			
			library z=new library();
			z.exit();
			
		}
		
		
		}
	
}

class library
{
	static String str,b,date;
	static int a,c;
	void add()
	{
		System.out.println("Enter book name , Price and book no.:");
		Scanner obj2=new Scanner(System.in);
		String str=obj2.nextLine();
		float price=obj2.nextInt();
		int bookno=obj2.nextInt();
		System.out.println("your details is"+ str + price + bookno);
	}
	void iss()
	{
		Scanner obj3=new Scanner(System.in);
		System.out.println("Book name:");
		String str = obj3.nextLine();
		System.out.println("Book_ID:");
		 a = obj3.nextInt();
		obj3.nextLine();
		System.out.println("Issue Date:");
	     b= obj3.nextLine();
		System.out.println("Total number of books ISSUED:");
		 c= obj3.nextInt();
		obj3.nextLine();
		System.out.println("Return book date:");
		 date=obj3.nextLine();
		
	}
	int getid()
	{
		return a;
	}		
	void ret()
	{
		System.out.println("Enter student name & book_ID:");
		Scanner c = new Scanner(System.in);
		String name=c.nextLine();
		int bookid=c.nextInt();
		if(a==bookid)
		{
			System.out.println("Total details:");
			System.out.println("Book Name::" +library.str);
			System.out.println("Book ID::" +library.a);
			System.out.println("issue date" +library.b);
			System.out.println("Total number of book Issued::" +library.c);
			System.out.println("Book return date::" +library.date);
		}
		else
		{
			System.out.println("Wrong ID , please enter correct ID");
		}	
		
	}
	
	void detail()
	{
		System.out.println("Book Name::" +library.str);
		System.out.println("Book ID::" +library.a);
		System.out.println("issue date" +library.b);
		System.out.println("Total number of book Issued::" +library.c);
		System.out.println("Book return date::" +library.date);
	}
	void exit()
	{
		System.exit(0);
	}	
	
	
}

