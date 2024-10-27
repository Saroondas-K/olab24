
public record TextBook(String title, String author, int publicationYear, String isbn) {
    
    
    @Override
    public String toString() {
        return String.format("TextBook[Title='%s', Author='%s', Year=%d, ISBN='%s']",
                title, author, publicationYear, isbn);
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return publicationYear;
    }
    public String getISBN() {
        return isbn;
    }
}
