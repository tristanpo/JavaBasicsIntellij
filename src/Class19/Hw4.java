package Class19;

public class Hw4 {
    private String title;
    private String author;
    private int numOfPages;

    public Hw4(String title, String author, int numOfPages) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public Hw4(String title) {
        System.out.println(title + " is also a great book");
    }
        void printInfo(){
            System.out.println("The name of the book is " + title + ", the author is " + author + " and the book has" +
                    numOfPages + " pages.");
        }
    }
