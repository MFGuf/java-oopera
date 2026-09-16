import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void showDirectorInfo() {
        System.out.println("Поставил шоу: " + director.toString());
    }

    @Override
    public String toString() {
        return "Show{" +
                "listOfActors=" + listOfActors +
                '}';
    }

    public void addActor(Actor actor) {
        boolean isNewActor = true;
        for (Actor otherActor : listOfActors) {
            if (actor.equals(otherActor)) {
                System.out.println("Этот актер уже присутствует");
                isNewActor = false;
                break;
            }
        }
        if (isNewActor) {
            listOfActors.add(actor);
        }
    }

    public void replacementActor(Actor actor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor otherActor = listOfActors.get(i);
            if (actor.surname.equals(otherActor.surname)) {
                listOfActors.set(i, actor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + actor.surname + " не найден");
    }
}
