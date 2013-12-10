/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author Shikanga
 */
public class Value {
    
    private Double votes;
    
    private int rank;

    public Value(Double votes) {
        this.votes = votes;
    }

    
    
    public Double getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     */
    public void setVotes(Double votes) {
        this.votes = votes;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
    
    
    
}
