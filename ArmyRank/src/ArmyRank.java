import java.util.*;
import java.util.stream.Collectors;

public class ArmyRank {
    public static int calculateReports(int[] ranks) {
        Set<Integer> uniqueRanks = Arrays
                .stream(ranks)
                .boxed()
                .collect(Collectors.toSet());
        int reports = 0;
        for (int uniqueRank : uniqueRanks)
            for (int rank : ranks)
                if (rank + 1 == uniqueRank)
                    reports++;

        return reports;
    }

    public static void main(String[] args) {
        int[] ranks = {3, 4, 3, 0, 2, 2, 3, 0, 0};
        //int[] ranks = {4, 2, 0};
        //int[] ranks = {4, 4, 3, 3, 1, 0};

        int reports = calculateReports(ranks);
        System.out.println(reports);
    }
}
