
package Domain;

import java.util.ArrayList;
import java.util.Date;

public class Referee {
    private String userName;
    private String qualification;
    private String isHeadReferee;
    private ArrayList<Game> games;
    private ArrayList<Season> season;

    public String getUserName() {
        return userName;
    }

    public String getQualification() {
        return qualification;
    }

    public String getIsHeadReferee() {
        return isHeadReferee;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public ArrayList<Season> getSeason() {
        return season;
    }

    public Referee(String userName, String qualification, String isHeadReferee) {
        this.userName = userName;
        this.qualification = qualification;
        this.isHeadReferee = isHeadReferee;

    }

    public void setGameScore(int gameID, Team homeTeamGoals, Team awayTeamGoals){
    }

    public void addEvent(int gameID, Date time, Date gameMinute, GameEvent.EventType eventType, String description){
    }

    public void editEvent(int gameID, Date time, Date gameMinute, GameEvent.EventType  eventType, String description){
    }

}
