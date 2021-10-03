class BooksRunner{
public static void main(String[] args)
{
   Books books=new Books(6,"King");
    System.out.println(books.size);
     System.out.println(books.name);
      Page page=books.page;
	  
       System.out.println(page.num);
      System.out.println(page.page);
	  }
 }
