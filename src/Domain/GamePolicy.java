package Domain;

public class GamePolicy {
    private int gamePolicyId;
    private String title;
    private String description;
    private int seasonId;
    //private Season season;


    public GamePolicy(int gamePolicyId, String title, String description, int seasonId) {
        this.gamePolicyId = gamePolicyId;
        this.title = title;
        this.description = description;
        this.seasonId = seasonId;
    }
}
