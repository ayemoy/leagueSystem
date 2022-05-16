package Presentation;
import Domain.GamePolicy;
import Domain.Referee;
import Domain.Team;
import Domain.associationRepresentatives;

 //associationRepresentatives presentation

public class ASPresentation {
    private associationRepresentatives ar;
    //private GamePolicy gp;

    public ASPresentation() {
        this.ar = new associationRepresentatives();
        //this.gp = new GamePolicy();
    }


    //send to
    public void addReferee(String userName, String qualification , Boolean isHeadReferee){ // add referee to the database
        if(userName == null || qualification == null || isHeadReferee == null){
            System.out.println("One or more of the arguments is null. try again");
            return;
        }
        if(this.ar.addReferee(userName, qualification, isHeadReferee)){
            System.out.println("The referee" + userName +"was added successfully");
        }
    }


    public void scheduleGamesPolicy(int gamePolicyId, int seasonId, int leagueId){
        if(gamePolicyId <0 || seasonId <0 || leagueId <0){
            System.out.println("Id must be equal or bigger then 0");
            return;
        }
        ar.scheduleGames(gamePolicyId, seasonId, leagueId);

    }


    public void addGame(Team homeTeam, Team awayTeam, String field, Referee referee, String seasonId){
        if(homeTeam == null || awayTeam == null || field == null || referee == null || seasonId == null){
            System.out.println("one or more of the arguments are null. try again");
            return;
        }
        ar.addGame(homeTeam, awayTeam, field, referee, seasonId);
    }
}
