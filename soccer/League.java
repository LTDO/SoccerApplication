package soccer;
import soccer.Player;
import soccer.Team;
import utility.GameUtils;

import static java.lang.System.out;

public class League {


    static public void main(String lunga_tshila[]) {

        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);
        Game currGame = theGames[0];
        int numberOfGoals = (int)(Math.random() * 7);
        out.println(numberOfGoals);
        Goal[] theGoals = new Goal[numberOfGoals];
        currGame.goals = theGoals;
        GameUtils.addGameGoals(currGame);


        // out.println("Goal scored after " +
        // currGame.goals[0].theTime +" mins by " + 
        // currGame.goals[0].thePlayer.playerName + " of " + 
        // currGame.goals[0].theTeam.teamName);
     
    }
    public static Team[] createTeams(){
        Player player1 = new Player();
        player1.playerName = "Goerge Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chuacer";
        Player[] thePlayers = {player1, player2, player3};
        Team team1 = new Team();
        team1.teamName = "The Greens"; 
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Team 1 " + team1.teamName);
        team1.playerArray = thePlayers;

        for (Player thePlayer: team1.playerArray) {  
            out.println(thePlayer.playerName); 
        }
        out.println();
        out.println();

        StringBuilder familyNameFirst = new StringBuilder();

        for(Player thePlayer : team1.playerArray){
            String name[] = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]); 
            out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());   

        }

        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Bunns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Raffael Sabatini";
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Team 2 " + team2.teamName);

        for(Player thePlayer : team2.playerArray){
            out.println(thePlayer.playerName);
        }
        for(Player thePlayer : team2.playerArray){
            if(thePlayer.playerName.matches(".*Sab.*")){
                out.println( "Found: " + thePlayer.playerName);
                out.println( "Last Name is: " + thePlayer.playerName.split(" ")[1]);
            }
        }
        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public static Game[] createGames(Team[] theTeams){
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }
}
    



        