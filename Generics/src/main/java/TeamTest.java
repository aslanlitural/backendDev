public class TeamTest {
    public static void main(String[]args){
        FootBallPlayer Thomas = new FootBallPlayer("joe");
        BaseBallPlayer Mike =new BaseBallPlayer("mike");
        SoccerPlayer Anthony =new SoccerPlayer("anthony");


//        Team milan =new Team("Milan");


        Team<SoccerPlayer>milan =new Team<>("Milan");

//        Team<String>loosingTeam=new Team<>("This wont Work");
//        milan.addPlayer(Thomas);
//        milan.addPlayer(Mike);
        milan.addPlayer(Anthony);
        System.out.println(milan.numPlayers());


    }
}
