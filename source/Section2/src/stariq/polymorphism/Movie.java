package stariq.polymorphism;

// Movie class.
public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

// Jaws class.
class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people.";
    }
}

// IndependenceDay class.
class IndependenceDay extends Movie{

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth.";
    }
}

// MazeRunner class.
class MazeRunner extends Movie{

    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

// StarWars class.
class StarWars extends Movie{

    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe.";
    }
}

// Forgettable class.
class Forgettable extends Movie{

    public Forgettable(){
        super("Forgettable");
    }

    // No plot method.
}

