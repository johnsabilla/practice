/**
 * Book class
 * Created by johnsabilla on 7/5/2017.
 */
public class Book
{
    //class variables
    private String title;
    private int pageCount;
    private int isbn;
    private boolean isCheckedOut;
    private int dayCheckedOut = -1;

    /**
     * Default constructor
     */
    public Book(){}

    /**
     *
     * @param title
     * @param pageCount
     * @param isbn
     * @param isCheckedOut
     * @param dayCheckedOut
     */
    public Book(String title, int pageCount, int isbn, boolean isCheckedOut, int dayCheckedOut) {
        this.title = title;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.dayCheckedOut = dayCheckedOut;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     *
     * @param pageCount
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     *
     * @return
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     *
     * @param isbn
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     *
     * @return
     */
    public boolean isCheckedOut() {
        return isCheckedOut;
    }



    /**
     *
     * @return
     */
    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    /**
     *
     * @param isCheckedOut
     * @param currentDayCheckedOut
     */
    public void setIsCheckedOut(boolean isCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = isCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
