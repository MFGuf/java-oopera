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
        System.out.println("Поставил шоу: " + director);
    }

    public void showActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }

    public void addActor(Actor actor) {
        boolean isNewActor = true;
        for (Actor otherActor : listOfActors) {
            if (actor.equals(otherActor)) {
                System.out.println("Этот актёр уже присутствует");
                isNewActor = false;
                break;
            }
        }
        if (isNewActor) {
            listOfActors.add(actor);
        }
    }

    public void replacementActor(Actor actor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor otherActor = listOfActors.get(i);
            if (surname.equals(otherActor.surname)) {
                listOfActors.set(i, actor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден");
    }
}
