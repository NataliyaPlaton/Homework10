public class GryffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honour;
    private int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honour, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int ability() {
        return nobility + honour + bravery;
    }

    public void compareGryffindor(GryffindorStudent gryffindorStudent) {
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n", getName(), gryffindorStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s: % d VS %d%n", gryffindorStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Гриффиндорец %s такой же, как гриффиндорец %s: %d VS %d%n", gryffindorStudent.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), nobility, honour, bravery);
    }
}
