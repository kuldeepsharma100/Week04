package collectionframework.treemap.votingsystem;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>(); // Candidate -> Votes (Fast Lookup)
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>(); // Maintain Vote Order
    private TreeMap<String, Integer> sortedVoteMap = new TreeMap<>(); // Sorted Candidates

    // Cast a vote for a candidate
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteMap.get(candidate)); // Maintain insertion order
        sortedVoteMap.put(candidate, voteMap.get(candidate)); // Maintain sorted order
    }

    // Display votes in the order they were cast (LinkedHashMap)
    public void displayVotesByOrder() {
        System.out.println("\nVotes in the order they were cast:");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Display votes sorted by candidate name (TreeMap)
    public void displayVotesSorted() {
        System.out.println("\nVotes sorted by candidate name:");
        for (Map.Entry<String, Integer> entry : sortedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Display votes sorted by vote count (Descending Order)
    public void displayVotesByCount() {
        System.out.println("\nVotes sorted by vote count:");
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(voteMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sort by votes (descending)

        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

}
