package com.demo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {Scanner scanner = new Scanner(System.in);
	Library library = new Library();
	Library_Dao dao = new Library_Dao();

	System.out.println(
			" \n 1.Add a New Book \n 2.Search by Book name \n 3.Search by Author Name  \n 4.Check book availability \n 5.Show All Book \n 6.");
	int choice = scanner.nextInt();

	switch (choice) {
	case 1:
		System.out.println("Enter the id");
		library.setId(scanner.nextInt());

		System.out.println("Enter the book name");
		library.setBook(scanner.next());

		System.out.println("Enter the author name");
		library.setAuthor(scanner.next());

		System.out.println("Enter the price");
		library.setPrice(scanner.nextDouble());

		System.out.println("Enter the count of books");
		library.setCount(scanner.nextInt());

		System.out.println("Enter the type of book");
		library.setType(scanner.next());

		dao.saveBook(library);
	}
    }
}
