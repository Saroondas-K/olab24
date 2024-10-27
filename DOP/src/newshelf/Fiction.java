package newshelf;

public record Fiction( String name) implements IBook {
    @Override
    public String getTitle() {
        return name;
    }
}
