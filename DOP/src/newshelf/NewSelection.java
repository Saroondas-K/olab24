package newshelf;

public class NewSelection {

  
    public static String getAgeOrTitle(Object o) {
       
        return switch(o){
          case TextBook(String subject)->subject;
          case Fiction(String name)->name;
          case Comic(String title, int ageRating) when ageRating >= 12 -> title;
          case Comic(String title, int ageRating) -> "Comic not suitable for all ages";
          case null, default -> "";
            
            
        }

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
