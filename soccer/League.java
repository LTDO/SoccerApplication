package soccer;
import soccer.Player;
import soccer.Team;
import static java.lang.System.out;

public class League {

    static public void main(String lunga_tshila[]) {

        Player player1 = new Player();
        player1.playerName = "Goerge Eliot";

        Player player2 = new Player();
        player2.playerName = "Graham Greene";

        Player player3 = new Player();
        player3.playerName = "Geoffrey Chuacer";

        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();

        team1.teamName = "The Greens"; 
        team1.playerArray = thePlayers;
        
        Team team2 = new Team();
        team2.teamName = "The Reds";

        team2.playerArray = new Player[3];

        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam  = currGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};

        currGame.goals = theGoals;

        out.println("Goal scored after " +
        currGame.goals[0].theTime + " mins by " +
        currGame.goals[0].thePlayer.playerName + " of " +
        currGame.goals[0].theTeam.teamName);

        System.out.println("---------------------------------");
    //     for(Player thePlayer : team2.playerArray){

    //         if(thePlayer.playerName.matches(".*Sab.*")){
    //             out.println();
    //             out.println("Found " + thePlayer.playerName);
    //             out.println("Lastname is " + thePlayer.playerName.split(" ")[1]);
    //             System.out.println();
    //         }
    //     }


    //     StringBuilder familyNameFirst = new StringBuilder();

    //     for(Player thePlayer : team1.playerArray){
    //         String name[] = thePlayer.playerName.split(" ");

    //         familyNameFirst.append(name[1]);
    //         familyNameFirst.append(", ");
    //         familyNameFirst.append(name[0]);
    //         System.out.println(familyNameFirst);
    //         familyNameFirst.delete(0, familyNameFirst.length());
    //     }
    // }

    // public static Team[] createTeam(){
    //     Team team1 = new Team();
    //     Team team2 =  new Team();
        
    //     Team[] theTeams = {team1, team2};
    //     return theTeams;
    // }

    // public static Game[] createGames(Team[] theTeams){
    //     Game theGame = new Game();
    //     theGame.homeTeam = theTeams[0];
    //     theGame.awayTeam = theTeams[1];
    //     Game[] theGames = {theGame};
    //     return theGames;
     
    // }

    }


}



        