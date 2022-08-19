public class RavenclawStudent extends HogwartsStudent{

    private int clewerness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int clewerness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.clewerness = clewerness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getClewerness() {
        return clewerness;
    }

    public void setClewerness(int clewerness) {
        this.clewerness = clewerness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int ability(){
        return clewerness + wisdom + wit + creativity;
    }

    public void compareRavenclaw(RavenclawStudent ravenclawStudent) {
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", getName(), ravenclawStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: % d VS %d%n", ravenclawStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n", ravenclawStudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; сообразительность: %d; творчество: %d", super.toString(), clewerness, wisdom, wit, creativity);
    }

}
