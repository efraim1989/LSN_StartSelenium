package hw_oop2;

public class MainBook {
    public static void main(String[] args){


        Book b1 = new Book().withName("WAR").withAuthor("John");
        System.out.println(b1);

        Book b2 = new Book().withName("Mood").withPublisher("IS").withPage(300);
        System.out.println(b2);

        Book b3 = new Book().withName("Union").withAuthor("John").withEAN(455645256);
        System.out.println(b3);











    }

}
