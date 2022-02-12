package com.example.highroller;

public class Player {
    public String p1n;
    public String p2n;
    public String p3n;
    public int p1s;
    public int p2s;
    public int p3s;

    Player(String _p1Name, String _p2Name, String _p3Name, String _p1Score, String _p2Score, String _p3Score){
        p1n = _p1Name;
        p2n = _p2Name;
        p3n = _p3Name;

        p1s = Integer.parseInt(_p1Score);
        p2s = Integer.parseInt(_p2Score);
        p3s = Integer.parseInt(_p3Score);
    }

    public static String findWinner(String p1n, int p1s, String p2n, int p2s, String p3n, int p3s){
        int[] scores = {p1s, p2s, p3s};
        if ( scores[0]>scores[1] && scores[0]>scores[2] ) {return p1n;}
        else if ( scores[1]>scores[0] && scores[1]>scores[2] ) {return p2n;}
        else {return p3n;}
    }


}
