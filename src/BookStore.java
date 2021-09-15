public class BookStore {
    private int book_id;
    private String book_name;
    private String book_type;

    public BookStore() {
    }

    public BookStore(String book_name, String book_type) {
        this.book_name = book_name;
        this.book_type = book_type;
    }

    public BookStore(int book_id, String book_name, String book_type) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_type = book_type;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_type='" + book_type + '\'' +
                '}';
    }
}
