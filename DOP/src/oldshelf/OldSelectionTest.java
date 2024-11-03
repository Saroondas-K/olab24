package oldshelf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OldSelectionTest {

    @Test
    void testGetAgeOrTitleWithComic() {
        Comic comic = new Comic("Dylan:The Great Adventures", 12);
        assertEquals("Dylan:The Great Adventures", OldSelection.getAgeOrTitle(comic));
    }

    @Test
    void testGetAgeOrTitleWithTextBook() {
        TextBook textBook = new TextBook("Social Studies");
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
