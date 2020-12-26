package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level1.task5;

class Book {
    private String title;
    private String author;

    public boolean isInList() {
        return isInList;
    }

    public void setInList(boolean inList) {
        isInList = inList;
    }

    private boolean isInList;


    Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isInList = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

}

