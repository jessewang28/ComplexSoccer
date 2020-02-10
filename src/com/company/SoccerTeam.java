package com.company;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int gamesPlayed=0;
    private static int goals=0;

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

    public static int getGamesPlayed(){
        return gamesPlayed;
    }

    public static int getGoals(){
        return getGoals();
    }

    public static void startTournament(){
        gamesPlayed=0;
        goals=0;
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
