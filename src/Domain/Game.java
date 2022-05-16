package Domain;

import java.util.Date;

public class Game {
    private Date gameDateTime;
    private Team homeTeam;
    private Team awayTeam;
    private String field;
    private Referee referee;
    private int homeTeamScore;
    private int awayTeamScore;
    private GameSchedule gameSchedule;
    private String seasonId;

    public Game(Team homeTeam, Team awayTeam, String field, Referee referee, String seasonId) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.field = field;
        this.referee = referee;
        this.seasonId = seasonId;
    }



    public void setScore(int score){
        //check for git
    }
}

