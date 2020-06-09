package packages;

// Import the packages in the project structure settings from the lib directory
import com.stariq.game.ISaveable;
import com.stariq.game.Monster;
import com.stariq.game.Player;
import com.stariq.series.Series;

public class Main {

    public static void main(String[] args) {

       //addMyWindow();
       addPackage();
       addSeries();
    }

    public static void addSeries(){
        System.out.println("\n*****");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.nSum(i));
        }

        System.out.println("\n*****");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.factorial(i));
        }

        System.out.println("\n*****");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }

    public static void addPackage(){

        System.out.println("\n*****");
        // The Player class, Monster class and ISaveable interface are being imported from an external library/jar file.
        ISaveable monster = new Monster("Werewolf",65,89);
        System.out.println(monster);
        Player player = new Player("Emma", 10,15);
        System.out.println(player.toString());
    }

    public static void addMyWindow(){
        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}
