package C1811L;

public class author_book_main {
	public static void main(String[] args) {
		//Author a1 = new Author("Kieu Tuan Long","tuanlong@gmail.com",'m');
		//Book book = new Book("Thai do song tao nen tat ca",a1,7000000,50);
		
		Author[] authors = new Author[]{
			new Author("Nguyen Van A","Anguyen@gmail.com",'m'),
			new Author("Le Van B","Ble@gmail.com",'m')
		};
		
		Book[] books = new Book[]{
			new Book ("Nha gia kim",authors,45,8000),
			new Book ("Cha giau, cha ngheo",authors,45,6000)
		};
		
		for(Book b : books) {
			if(TestAuthor.isName(b.getAuthor().getName()) 
					&& TestAuthor.isName(b.getName_book()) 
					&& TestAuthor.isEmail(b.getAuthor().getEmail()) ) {
				System.out.println(b.getName_book() + "\n"+b.getAuthor().getName() + "\n" + b.getPrice_book() + "\n"+b.getQuantity());
			}
		}
		//TEST valid
	/*	TestAuthor test = new TestAuthor();
		System.out.println("name is: "+test.isName(a.getName()));
		System.out.println("Email is: "+test.isEmail(a.getEmail()));
//		System.out.println("Gender: "+a.getGender());
		System.out.println("Gender is: "+test.isGender(a.getGender()));
		
		
		System.out.println("Tac gia: "+a1.getName() + "\n"+"Email:"+a1.getEmail()+"\n"+"Genner: "+a1.getGender());
		System.out.println("Ten sach: "+book.getName_book());
		System.out.println("Tac gia: "+book.getAuthor().getName());
		System.out.println("Gia: "+book.getPrice_book());
		System.out.println("So luong: "+book.getQuantity());*/
	}
}
