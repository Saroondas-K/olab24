package oldshelf;

public class Comic extends Book {

    private final String title;
    
    private final int ageOfMainCharacter;

    public Comic(String title, int ageOfMainCharacter) {
        super(title);
        this.title = title;
        this.ageOfMainCharacter = ageOfMainCharacter;
    }

    public String getTitle() {
        return title;
    }

    public int getAgeOfMainCharacter() {
        return ageOfMainCharacter;
    }

    @Override
    public String toString() {
        return "Comic{title='" + title + "', ageOfMainCharacter=" + ageOfMainCharacter + "}";
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = ageOfMainCharacter +41 * result  ;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comic comic = (Comic) o;

        if (ageOfMainCharacter != comic.ageOfMainCharacter) return false;
        return title != null ? title.equals(comic.title) : comic.title == null;
    }
}
