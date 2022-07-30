package easy;

import java.util.*;

public class tournament_winner {

    public static String tournamentWinner(
            List<List<String>> competitions, List<Integer> results) {
        // Write your code here.

        Map<String, Integer> tournamentResult = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++){
            String winnerTeam = competitions
                    .get(i)
                    .get(results.get(i) == 0 ? 1 : 0);

            tournamentResult.merge(winnerTeam, 1, Integer::sum);
        }

        Optional<Map.Entry<String, Integer>> winnerTeam = tournamentResult.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        return winnerTeam.get().getKey();
    }

    public static void main(String[] args) {
        List<List<String>> competitions = List.of(
                List.of("Html", "C#"),
                List.of("C#", "Python"),
                List.of("Python", "Html")
        );
        List<Integer> results = List.of(0,0,1);

        System.out.println(tournamentWinner(competitions, results));
    }
}
