import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generatGryffindorStudent("Гарри Потер");
        GryffindorStudent germyon = generatGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generatGryffindorStudent("Рон Уизли");
        PuffenduyStudent smit = generatPuffenduyStudent("Захария Смит");
        PuffenduyStudent sedrik = generatPuffenduyStudent("Седрик Диггори");
        PuffenduyStudent finch = generatPuffenduyStudent("Джастин Финч-Флетчер");
        RavenclawStudent chang = generatRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generatRavenclawStudent("Падма Патил");
        RavenclawStudent marcus = generatRavenclawStudent("Маркус Белби");
        SlytherinStudent draco = generatSlytherinStudent("Драко Малфой");
        SlytherinStudent grehem = generatSlytherinStudent("Грэхем Монтегрю");
        SlytherinStudent gregory = generatSlytherinStudent("Грегори Гойл");

        harry.print();
        germyon.print();
        ron.print();
        smit.print();
        sedrik.print();
        finch.print();
        chang.print();
        padma.print();
        marcus.print();
        draco.print();
        grehem.print();
        gregory.print();

        System.out.println();

        harry.compareGryffindor(ron);
        smit.comparePuffenduy(finch);
        padma.compareRavenclaw(marcus);
        draco.compareSlytherin(gregory);

        System.out.println();

        harry.compareHogwarts(gregory);

    }

    private static GryffindorStudent generatGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static PuffenduyStudent generatPuffenduyStudent(String name) {
        return new PuffenduyStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generatRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generatSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}

