package newshelf;

public class NewSelection {

  
    public static String getAgeOrTitle(Object o) {
        if (o instanceof IBook book) {
            if (book instanceof TextBook textBook) {
                return textBook.subject();
            } else if (book instanceof Fiction fiction) {
                return fiction.name();
            } else if (book instanceof Comic comic) {
                return comic.title();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        TextBook textBook = new TextBook("Social Studies");
        Fiction fiction = new Fiction("Anthropologies");
        Comic comic = new Comic("He-Man", 15);

        System.out.println("TextBook subject: " + getAgeOrTitle(textBook)); 
        System.out.println("Fiction name: " + getAgeOrTitle(fiction));    
        System.out.println("Comic title: " + getAgeOrTitle(comic));       
    }
}
