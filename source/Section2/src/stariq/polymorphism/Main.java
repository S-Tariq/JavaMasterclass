package stariq.polymorphism;

public class Main {

    public static void main(String[] args) {
        addMovies();
        addCars();
    }

    public static void addCars(){

        System.out.println("\n*****");

        Car car = new Car("Car", 10);
        System.out.println("\n" + car.startEngine() + "\n" +
                car.accelerate() + "\n" + car.brake());

        Coupe coupe = new Coupe();
        System.out.println("\n" + coupe.startEngine() + "\n" +
                coupe.accelerate() + "\n" + coupe.brake());

        Convertible convertible = new Convertible();
        System.out.println("\n" + convertible.startEngine() + "\n" +
                convertible.accelerate() + "\n" + convertible.brake());

        Crossover crossover = new Crossover();
        System.out.println("\n" + crossover.startEngine() + "\n" +
                crossover.accelerate() + "\n" + crossover.brake());

    }

    public static void addMovies(){

        System.out.println("\n*****");

        // Makes use of Movie class to get the name and plot.
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();

            default:
                return null;
        }
    }
}






