package oldshelf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OldSelectionTest {

    @Test
    void testGetAgeOrTitleWithComic() {
        Comic comic = new Comic("Spiderman", 11);
        assertEquals("Spiderman", OldSelection.getAgeOrTitle(comic));
    }

    @Test
    void testGetAgeOrTitleWithTextBook() {
        TextBook textBook = new TextBook("Computer Science");
        assertEquals("Social Studies", OldSelection.getAgeOrTitle(textBook));
    }

    @Test
    void testGetAgeOrTitleWithFiction() {
        Fiction fiction = new Fiction("Pulp Fiction", FictionType.Comedy);
        assertEquals("Pulp Fiction", OldSelection.getAgeOrTitle(fiction));
    }

    @Test
    void testGetAgeOrTitleWithNonBookObject() {
        Object nonBook = new Object();
        assertEquals("", OldSelection.getAgeOrTitle(nonBook));
    }

    @Test
    void testGetAgeOrTitleWithNull() {
        assertEquals("", OldSelection.getAgeOrTitle(null));
    }
}
