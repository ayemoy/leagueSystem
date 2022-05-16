package Domain;

import DataAccess.arAccess;

public class associationRepresentatives {
    private Logger logFile;
    private arAccess ar;

    public associationRepresentatives() {
        this.logFile = new Logger();
        this.ar = new arAccess();
    }

    public boolean addReferee(String userName, String qualification , Boolean isHeadReferee){
        Referee referee = new Referee(userName, qualification, isHeadReferee);
        this.logFile.writeToLog("The referee" + userName +"was added successfully");
        //here: send to database
        return true;
    }


    public void scheduleGamesPlicy(int gamePolicyId, int leagueId, String title, String description, int seasonId){

        if(ar.checkGamePolicy() == 1){ //check in database if we already have this policy. 1 is exist
            System.out.println("this policy already exist in the database");
            return;
        }
        GamePolicy gp = new GamePolicy( gamePolicyId,  title,  description,  seasonId);

        ar.addPolicy( gamePolicyId,  title,  description,  seasonId);//add to the database if we already have this policy

        //send to database
    }

    public void addGame(Team homeTeam, Team awayTeam, String field, Referee referee, String seasonId){

        //check if the game is valid
        //return;
        Game game = new Game(homeTeam, awayTeam, field, referee, seasonId);
        ar.addGame(game);
    }





}

