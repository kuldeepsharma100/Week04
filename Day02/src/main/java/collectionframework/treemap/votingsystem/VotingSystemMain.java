package collectionframework.treemap.votingsystem;

public class VotingSystemMain {
    public static void main(String[] args) {
        VotingSystem voting = new VotingSystem();

        // Casting votes
        voting.castVote("Kuldeep");
        voting.castVote("Harsh");
        voting.castVote("Kuldeep");
        voting.castVote("Om");
        voting.castVote("Naman");
        voting.castVote("Kuldeep");

        // Display votes in different orders
        voting.displayVotesByOrder();
        voting.displayVotesSorted();
        voting.displayVotesByCount();
    }

}
