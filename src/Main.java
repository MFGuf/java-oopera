import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Director director = new Director("Sergey", "Sinichckin", Gender.MALE, 1);
        ArrayList<Actor> listOfActors = new ArrayList<>();
        Show show = new Show("Good show", 123, director, listOfActors);
        show.showDirectorInfo();
        System.out.println("Поехали!");
    }
}
