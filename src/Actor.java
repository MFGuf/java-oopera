import java.util.Objects;

public class Actor extends Persone{
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return (height == actor.height && name.equals(actor.name) && surname.equals(actor.surname) &&
                gender.equals(actor.gender));
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(height);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(surname);
        result = 31 * result + Objects.hashCode(gender);
        return result;
    }
}
