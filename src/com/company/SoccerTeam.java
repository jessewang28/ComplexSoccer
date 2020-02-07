package com.company;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private int gamesPlayed=0;
    private int goals=0;

    public SoccerTeam(int w, int l, int t){
        wins = w;
        losses = l;
        ties = t;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        if (myScore > otherScore) {
            this.wins++;
            other.losses++; }
        else if (otherScore > myScore) {
            other.wins++;
            this.losses++; }
        else {
            this.ties++;
            other.ties++; }
        gamesPlayed++;
        goals = goals + myScore + otherScore;
    }

    public int ptsCount(SoccerTeam x){
            int pts = wins*3 + ties;
            return pts;
        }

    public void reset(){
        wins=0;
        losses=0;
        ties=0;
    }











}
