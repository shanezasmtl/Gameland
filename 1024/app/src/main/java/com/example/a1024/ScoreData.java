package com.example.a1024;

import java.util.Date;

public class ScoreData {

    private int idScore;
    private String name;
    private int score;
    private Date when;

    public int getIdScore() {
        return idScore;
    }

    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public ScoreData(int idScore, String name, int score, Date when) {
        this.setIdScore( idScore );
        this.setName( name );
        this.setScore( score );
        this.setWhen( when );
    }

    @Override
    public String toString() {
        return "ScoreData{" +
                "idScore=" + idScore +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", when=" + when +
                '}';
    }
}
