import java.util.HashMap;
import java.util.Map;

/**
 * Created by johnsabilla on 7/5/2017.
 */
public class LibraryCatalogue
{
    private Map<String, Book> bookCollection = new HashMap<String, Book>();
    private int currentDay = 0;
    private int lengthOfCheckOut = 7;
    private double initialLateFee = 0.50;
    private double feePerLateDay = 1.00;

    /**
     *
     */
    public LibraryCatalogue(Map<String, Book> bookCollection)
    {
        this.bookCollection = bookCollection;
    }

    /**
     *
     * @param bookCollection
     * @param currentDay
     * @param lengthOfCheckOut
     * @param initialLateFee
     * @param feePerLateDay
     */
    public LibraryCatalogue(Map<String, Book> bookCollection, int currentDay, int lengthOfCheckOut, double initialLateFee, double feePerLateDay)
    {
        this.bookCollection = bookCollection;
        this.currentDay = currentDay;
        this.lengthOfCheckOut = lengthOfCheckOut;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }


    /**
     *
     * @return
     */
    public Book getBook(String bookTitle)
    {
        return bookCollection.get(bookTitle);
    }

    /**
     *
     * @param bookcollection
     */
    public void setBook(Map<String, Book> bookcollection)
    {
        this.bookCollection = bookcollection;
    }


    /**
     *
     * @return
     */
    public int getCurrentDay() {
        return this.currentDay;
    }


    /**
     *
     * @param currentDay
     */
    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }


    /**
     *
     * @return
     */
    public int getLengthOfCheckOut() {
        return this.lengthOfCheckOut;
    }


    /**
     *
     * @param lengthOfCheckOut
     */
    public void setLengthOfCheckOut(int lengthOfCheckOut) {
        this.lengthOfCheckOut = lengthOfCheckOut;
    }


    /**
     *
     * @return
     */
    public double getInitialLateFee() {
        return initialLateFee;
    }


    /**
     *
     * @param initialLateFee
     */
    public void setInitialLateFee(double initialLateFee) {
        this.initialLateFee = initialLateFee;
    }


    /**
     *
     * @return
     */
    public double getFeePerLateDay() {
        return feePerLateDay;
    }


    /**
     *
     * @param feePerLateDay
     */
    public void setFeePerLateDay(double feePerLateDay) {
        this.feePerLateDay = feePerLateDay;
    }

    /**
     *
     * @param day
     */
    public void setDay(int day){
        this.currentDay = day;
    }

    /**
     *
     */
    public void nextDay(){
        this.currentDay++;
    }

    public void checkOut(String title) {
        Book book = getBook(title);
        if(book.isCheckedOut()){
            bookAlreadyCheckOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just check out " + title + ". It is due on day " +
                    (getCurrentDay() + getLengthOfCheckOut()) + ".");
        }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOut());
        if(daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + (daysLate * getFeePerLateDay())) + " because your book is " +
                    daysLate + " days overdue.");
        } else {
            System.out.println("Book returned, thank you.");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void bookAlreadyCheckOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. " +
                " It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckOut()) );
    }
    public static void main(String[] args)
    {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harryPotter = new Book("Harry Potter", 500, 1122334455, false, -1);
        bookCollection.put("Harry Potter", harryPotter);

        LibraryCatalogue libraryCatalogue = new LibraryCatalogue(bookCollection);
        libraryCatalogue.checkOut("Harry Potter");
        libraryCatalogue.nextDay();
        libraryCatalogue.nextDay();
        libraryCatalogue.checkOut("Harry Potter");
        libraryCatalogue.setDay(17);
        libraryCatalogue.returnBook("Harry Potter");
        libraryCatalogue.checkOut("Harry Potter");
    }
}
