public class Library {
    private Shelf[] shelves;
    public Library(Shelf[] shelves){
        this.shelves = shelves;
    }
    public Shelf[] getShelves(){
        return shelves;
    }

    public int countAuthor(String authorName) {
        int result = 0;
        for(Shelf shelf : shelves){
            for(Book book : shelf.getBooks()){
                if (book.getAuthor().equals(authorName)) {
                    result++;
                }
            }
        }
        return result;
    }
}

