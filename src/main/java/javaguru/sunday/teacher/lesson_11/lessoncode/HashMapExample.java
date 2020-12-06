package main.java.javaguru.sunday.teacher.lesson_11.lessoncode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        //(bucket) index = key.hashCode() & (n - 1)
        //n = map size (buckets count)
        Map<Team, String> leader = new HashMap<>();
        Team teamOne = new Team("Riga", "development");
        Team teamTwo = new Team("Riga", "marketing");
        Team teamThree = new Team("Depils", "sales");

        System.out.println(teamOne.hashCode());
        leader.put(teamOne, "Max");
        leader.put(teamTwo, "Olga");
        leader.put(teamThree, "Mark");

        Team searchedTeam = new Team("Riga", "development");
        System.out.println(searchedTeam.hashCode());
        String resultValue = leader.get(searchedTeam);
        System.out.println(resultValue);


    }
}
