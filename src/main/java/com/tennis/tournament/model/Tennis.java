package com.tennis.tournament.model;

import javax.persistence.*;

@Entity
@Table(name="tournament_data")
public class Tennis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="tourney_id")
    private String tournId;

    @Column(name="tourney_name")
    private String tournName;

    @Column(name="surface")
    private String surface;

    @Column(name="winner_id")
    private String winId;

    @Column(name="winner_name")
    private String winName;

    @Column(name="winner_ioc")
    private String winIoc;

    @Column(name="loser_id")
    private String loserId;

    @Column(name="loser_name")
    private String loserName;

    @Column(name="loser_ioc")
    private String loserIoc;

    @Column(name="round")
    private String round;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTournId() {
        return tournId;
    }

    public void setTournId(String tournId) {
        this.tournId = tournId;
    }

    public String getTournName() {
        return tournName;
    }

    public void setTournName(String tournName) {
        this.tournName = tournName;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getWinId() {
        return winId;
    }

    public void setWinId(String winId) {
        this.winId = winId;
    }

    public String getWinName() {
        return winName;
    }

    public void setWinName(String winName) {
        this.winName = winName;
    }

    public String getWinIoc() {
        return winIoc;
    }

    public void setWinIoc(String winIoc) {
        this.winIoc = winIoc;
    }

    public String getLoserId() {
        return loserId;
    }

    public void setLoserId(String loserId) {
        this.loserId = loserId;
    }

    public String getLoserName() {
        return loserName;
    }

    public void setLoserName(String loserName) {
        this.loserName = loserName;
    }

    public String getLoserIoc() {
        return loserIoc;
    }

    public void setLoserIoc(String loserIoc) {
        this.loserIoc = loserIoc;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }
}
