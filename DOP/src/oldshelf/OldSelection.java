package oldshelf;
public class OldSelection {

   
    public static String getAgeOrTitle(Object o) {
        if (!(o instanceof Book)) {
            return "";
        }
        if (o instanceof Comic) {
            return ((Comic) o).getTitle();
        } else if (o instanceof Fiction) {
            return ((Fiction) o).getName();
        } else if (o instanceof TextBook) {
            return ((TextBook) o).getSubject();
        }
        return "";
    }

    public static void main(String[] args) {
        TextBook t = new TextBook("Social Studies");
        System.out.println("Subject of the TextBook: " + getAgeOrTitle(t)); 
        
        Comic c = new Comic("Dylan:The Great Adventures", 12);
        System.out.println("Title of the Comic: " + getAgeOrTitle(c));
        
        Fiction f = new Fiction("Pulp Fiction", FictionType.Comedy);
        System.out.println("Name of the Fiction: " + getAgeOrTitle(f));
    }
}
