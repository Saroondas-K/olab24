package newshelf;

public sealed interface IBook<T> extends Comparable<IBook<T>> permits TextBook, Fiction, Comic {
    T getTitle();
}
