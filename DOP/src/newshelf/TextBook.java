package newshelf;

public record TextBook(String subject) implements IBook {
    @Override
    public String getTitle() {
        return subject;
    }
}
