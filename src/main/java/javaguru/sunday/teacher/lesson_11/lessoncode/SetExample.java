package javaguru.sunday.teacher.lesson_11.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Team> teamSet = new HashSet<>();

        Team teamOne = new Team("Riga", "development");
        Team teamTwo = new Team("Riga", "marketing");
        Team teamThree = new Team("Depils", "sales");

        teamSet.add(teamOne);
        teamSet.add(teamTwo);
        teamSet.add(teamThree);

        Team searchedTeam = new Team("Riga", "development");

        Team result = null;
        for (Team team : teamSet) {
            if (team.equals(searchedTeam)) {
                result = team;
            }
        }

        System.out.println(result);

        Set<String> setStrings = new HashSet<>();

        setStrings.add("A");
        setStrings.add("A");
        setStrings.add("B");
        setStrings.add("B");
        setStrings.add("C");
        setStrings.add("C1");

        for (String setString : setStrings) {
            System.out.println(setString);
        }
    }
}
