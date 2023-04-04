class Program3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();

     System.out.print("Enter title : ");
     b1.setTitle(sc.nextLine());
     String title = b1.getTitle();  
        
     System.out.print("Enter author : ");
     b1.setAuthor(sc.nextLine());
     String author = b1.getAuthor();  

     System.out.print("Enter publisher : ");
     b1.setPublisher(sc.nextLine());
     String publisher = b1.getPublisher(); 

     System.out.print("Enter isbn : ");
     b1.setPublisher(sc.nextLine());
     String isbn = b1.getIsbn(); 

     System.out.print("Enter year : ");
     b1.setYear(sc.nextInt());
     int year = b1.getYear(); 

     System.out.print("Enter price : ");
     b1.setPrice(sc.nextDouble());
     double price = b1.getPrice(); 

     System.out.print("Enter quantity : ");
     b1.setQuantity(sc.nextInt());
     int quantity = b1.getQuantity(); 

     b1.getInventoryValue();

      System.out.println("==========================================");
      System.out.println();

        System.out.println("Enter the Increase Quantity of The Book : ");
        int plusBook = sc.nextInt();
        b1.increaseQuantity(plusBook);
        
        System.out.println("Enter the Decrease Quantity of The Book : ");
        int minusBook = sc.nextInt();
        b1.decreaseQuantity(minusBook);
       
    }
}