package stariq.generics;

public class Main {

    public static void main(String[] args) {

        //addPlayers();
        addLeague();

    }

    public static void addLeague(){

        League<Team<FootballPlayer>> footballLeague = new League<>("Power league");
        Team<FootballPlayer> crows = new Team<>("Crows");
        Team<FootballPlayer> cats = new Team<>("Cats");
        Team<FootballPlayer> dogs = new Team<>("Dogs");
        Team<FootballPlayer> tigers = new Team<>("Tigers");
        Team<BaseballPlayer> lions = new Team<>("Lions");

        crows.matchResult(cats,1,0);
        crows.matchResult(dogs, 3, 8);
        dogs.matchResult(cats, 2, 1);

        footballLeague.add(crows);
        footballLeague.add(cats);
        footballLeague.add(dogs);
        footballLeague.add(tigers);
//        footballLeague.add(lions);
        footballLeague.showLeagueTable();

    }

    public static void addPlayers(){

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer tom = new SoccerPlayer("Tom");

        Team<FootballPlayer> crowsFootball = new Team<>("Crows");
        crowsFootball.addPlayer(joe);
//       crowsFootball.addPlayer(pat);
//       crowsFootball.addPlayer(tom);

        System.out.println(crowsFootball.numPlayers());

        Team<BaseballPlayer> catsBaseball = new Team<>("Cats");
        catsBaseball.addPlayer(pat);

        Team<SoccerPlayer> dogsSoccer = new Team<>("Dogs");
        dogsSoccer.addPlayer(tom);

        Team<FootballPlayer> tigerFootball = new Team<>("Tiger");
        FootballPlayer ann = new FootballPlayer("Ann");
        tigerFootball.addPlayer(ann);

        Team<FootballPlayer> sharkFootball = new Team<>("Shark");
        Team<FootballPlayer> lionFootball = new Team<>("Lion");

        sharkFootball.matchResult(lionFootball, 1, 0);
        sharkFootball.matchResult(crowsFootball, 3, 8);

        crowsFootball.matchResult(lionFootball, 2, 1);
        // A football team cannot play against a baseball team
//        crowsFootball.matchResult(catsBaseball, 1, 1);

        // Crows won twice. Shark won once.
        System.out.println("Ranking:");
        System.out.println(crowsFootball.getName() + ": " + crowsFootball.ranking());
        System.out.println(tigerFootball.getName() + ": " + tigerFootball.ranking());
        System.out.println(lionFootball.getName() + ": " + lionFootball.ranking());
        System.out.println(sharkFootball.getName() + ": " + sharkFootball.ranking());

        System.out.println(crowsFootball.compareTo(tigerFootball));
        System.out.println(crowsFootball.compareTo(sharkFootball));
        System.out.println(sharkFootball.compareTo(crowsFootball));
        System.out.println(tigerFootball.compareTo(lionFootball));
    }
}
