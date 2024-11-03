package oldshelf;
public class OldSelection {

   // case Comic:
   //  Comic comic = (Comic) o;
   //  return comic.getTitle();

public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic comic -> comic.getTitle();
            case Fiction fiction -> fiction.getName();
            case TextBook textBook -> textBook.getSubject();
            case null,default -> "";
        };
    }

    public static void main(String[] args) {
        TextBook t = new TextBook("Computer Science");
        System.out.println("Subject of the TextBook: " + getAgeOrTitle(t)); 
        
        Comic c = new Comic("Spiderman", 12);
        System.out.println("Title of the Comic: " + getAgeOrTitle(c));
        
        Fiction f = new Fiction("Hangover", FictionType.Comedy);
        System.out.println("Name of the Fiction: " + getAgeOrTitle(f));
    }
}
