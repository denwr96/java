package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level2task11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TVSerial {

    String title;
    String genre;
    int numberOfEpisodes;

    protected TVSerial(String title, String genre, int numberOfEpisodes) {
        this.title = title;
        this.genre = genre;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
}
