public class Book {

    //    private modifiers guarantee that these files never can be modified outside this file.
    private String author;
    private String title;

    //    public modifiers (Sometimes risky)
    public boolean isBorrowed;

    //    better practice using getter and setters
    private boolean isNew = true;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setOldBook() {
        isNew = false;
    }
}

/*
* always try to make all fields private
*
 */