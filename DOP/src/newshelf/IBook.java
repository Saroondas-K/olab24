package newshelf;

public sealed interface IBook permits TextBook, Fiction, Comic {

    String getTitle();
}
