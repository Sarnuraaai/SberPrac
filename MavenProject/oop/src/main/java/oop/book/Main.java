package oop.book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Karl Marx", "Male", "Marx@free.dot");
        Book book = new Book("Capital", author, 1867);
        book.toString();

        Author new_author = new Author("None","None", "None");
        Book new_book = new Book("None", new_author, 0000);
        new_author.setName("Виктория Янтурина");
        new_author.setGender("Женский");
        new_author.setEmail("Yanturina@gmail.com");
        new_book.setName("Экономика Российской Империи");
        new_book.setAuthor(new_author);
        new_book.setYear(2024);
        System.out.println("new_author's name: " + new_author.getName());
        System.out.println("new_book's name: " + new_book.getName());
        new_book.toString();
    }
}