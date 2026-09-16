import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Director director1 = new Director("Иван", "Смирнов", Gender.MALE, 20);
        Director director2 = new Director("Ольга", "Кузнецова", Gender.FEMALE, 10);

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 182);
        Actor actor2 = new Actor("Пётр", "Иванов", Gender.MALE, 175);
        Actor actor3 = new Actor("Мария", "Сидорова", Gender.FEMALE, 168);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Михаил Фокин";

        Show show = new Show("Театральная фантазия", 90, director1, new ArrayList<>());
        Opera opera = new Opera("Евгений Онегин", 150, director2, new ArrayList<>(), musicAuthor,
                "Либретто оперы: Татьяна пишет письмо Онегину.", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 120, director1, new ArrayList<>(), musicAuthor,
                "Либретто балета: принц Зигфрид встречает Одетту.", choreographer);

        show.addActor(actor1);
        show.addActor(actor3);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor2);

        System.out.println("=== Обычный спектакль ===");
        show.showDirectorInfo();
        show.showActors();
        System.out.println("=== Оперный спектакль ===");
        opera.showDirectorInfo();
        opera.showActors();
        System.out.println("=== Балетный спектакль ===");
        ballet.showDirectorInfo();
        ballet.showActors();

        System.out.println("Пробуем добавить уже добавленного актёра:");
        show.addActor(actor1);

        System.out.println("Заменяем актёра с фамилией Иванов на другого актера:");
        show.replacementActor(actor2, "Иванов");
        show.showActors();

        System.out.println("Пробуем заменить в балете актёра, которого там нет:");
        ballet.replacementActor(actor3, "Сидорова");

        System.out.println("Либретто оперы:");
        opera.showLibretto();
        System.out.println("Либретто балета:");
        ballet.showLibretto();

        System.out.println("Поехали!");
    }
}