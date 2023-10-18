package SkyPro.Course1.Homework13.lesson2;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Smith", "Jordan");
        Author author2 = new Author("Egor", "Pellsov");

        Book book1 = new Book("Book 1", author1, 1996);
        Book book2 = new Book("Book 2", author2, 1998);


        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println();

        if (book1.equals(book2)) {
            System.out.println("book1 и book2 равны");
        } else {
            System.out.println("book1 и book2 не равны");
        }

        System.out.println();
        System.out.println("Book1: " + book1.hashCode());
        System.out.println("Book2: " + book2.hashCode());
    }
}