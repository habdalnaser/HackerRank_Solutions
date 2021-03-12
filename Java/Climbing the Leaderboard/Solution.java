import java.util.*;

public class Solution {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[player.size()]));
        int scoreIndex = player.size() - 1;
        int rankIndex = 0;
        int rankSize = ranked.size() - 1;
        int currentRankVal = ranked.get(rankIndex);
        int currentRank = 1;
        int last = ranked.get(ranked.size() - 1);
        for (int i = scoreIndex; i >= 0; i--) {
            if (player.get(i) >= currentRankVal) {
                result.set(i, currentRank);
            } else if (rankIndex == rankSize && player.get(i) < last) {
                result.set(i, currentRank + 1);
            } else {
                while (rankIndex <= rankSize) {
                    if (ranked.get(rankIndex) <= player.get(i)) {
                        result.set(i, currentRank);
                        break;
                    } else if (rankIndex == rankSize && player.get(i) < last) {
                        result.set(i, currentRank + 1);
                        break;
                    }
                    rankIndex++;
                    if (currentRankVal > ranked.get(rankIndex)) {
                        currentRank++;
                        currentRankVal = ranked.get(rankIndex);
                    }
                }
            }
        }
        return result;
    }
}
