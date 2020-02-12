package com.company;

public class Main {

    public static void main(String[] args) {
        Complex a = new Complex(1, 2);          //Complex
        Complex b = new Complex(1.5, 2.5);
        Complex c = new Complex(2, 3);
        Complex d = new Complex(2.5, 3.5);
        Complex e = new Complex(3, 4);
        Complex eNeg = new Complex(-3, -4);
        Complex l = new Complex(0, 4);
        double absTest1 = e.abs(); //abs = 5.0
        double absTest2 = eNeg.abs(); //abs = 5.0
        Complex f = a.add(c);   //f = 3.0 + 5.0i
        Complex g = b.add(d);   //f = 4.0 + 6.0i
        Complex h = d.add(eNeg);
        Complex i = c.multiply(e);
        Complex j = a.add(8.8);
        Complex k = a.multiply(4);
        Complex m = l.multiply(e);
        System.out.println(absTest1);
        System.out.println(absTest2);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);

        SoccerTeam T1 = new SoccerTeam();       //SoccerTeam
        SoccerTeam T2 = new SoccerTeam();
        SoccerTeam T3 = new SoccerTeam();
        SoccerTeam T4 = new SoccerTeam();


        T1.startTournament();       //1st Tournament
        T1.played(T2, 3, 1);
        T2.played(T3, 2, 3);
        T3.played(T4, 1, 2);
        T4.played(T1, 6, 1);

        System.out.println("Team 1: " + T1.ptsCount());
        System.out.println("Team 2: " + T2.ptsCount());
        System.out.println("Team 3: " + T3.ptsCount());
        System.out.println("Team 4: " + T4.ptsCount());
        System.out.println("Total Games Played: " + T1.getGamesPlayed());       //why T1.getGamesPlayed() despite static method?
        System.out.println("Total Goals Scored: " + T1.getGoals());
        T1.reset();
        T2.reset();
        T3.reset();
        T4.reset();

        T1.startTournament();       //2nd Tournament
        T1.played(T2, 1, 2);
        T2.played(T3, 3, 3);
        T3.played(T4, 1, 1);
        T4.played(T1, 6, 7);

        System.out.println("Team 1: " + T1.ptsCount());
        System.out.println("Team 2: " + T2.ptsCount());
        System.out.println("Team 3: " + T3.ptsCount());
        System.out.println("Team 4: " + T4.ptsCount());
        System.out.println("Total Games Played: " + T1.getGamesPlayed());
        System.out.println("Total Goals Scored: " + T1.getGoals());
        T1.reset();
        T2.reset();
        T3.reset();
        T4.reset();


    }
}

/*
//Complex Results
5.0
5.0
3.0 + 5.0i
4.0 + 6.0i
-0.5 + -0.5i
-6.0 + 17.0i
9.8 + 10.8i
4.0 + 8.0i
-16.0 + 12.0i

//SoccerTeam Results
Team 1: 3
Team 2: 0
Team 3: 3
Team 4: 6
Total Games Played: 4
Total Goals Scored: 19
Team 1: 3
Team 2: 4
Team 3: 2
Team 4: 1
Total Games Played: 4
Total Goals Scored: 24

 */