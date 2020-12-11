package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level2task11;

class SitcomDemo {

    public static void main(String[] args) {

        Sitcom friends = new Sitcom("Friends", "Comedy", 24, "New York");
        System.out.println(friends.getTitle());
        System.out.println(friends.getGenre());
        System.out.println(friends.getNumberOfEpisodes());
        System.out.println(friends.getSitcomLocation());
    }

}
