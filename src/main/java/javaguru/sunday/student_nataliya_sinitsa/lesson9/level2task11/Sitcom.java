package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level2task11;

class Sitcom extends TVSerial {

    private String sitcomLocation;

    Sitcom(String title, String genre, int numberOfEpisodes, String sitcomLocation) {
        super(title, genre, numberOfEpisodes);
        this.sitcomLocation = sitcomLocation;
    }

    public String getSitcomLocation() {
        return sitcomLocation;
    }
}
