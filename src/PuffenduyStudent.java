public class PuffenduyStudent extends HogwartsStudent {

    private int diligence;
    private int fidelity;
    private int honesty;

    public PuffenduyStudent(String name, int magic, int transgression, int diligence, int fidelity, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int ability() {
        return diligence + fidelity + honesty;
    }

    public void comparePuffenduy(PuffenduyStudent puffenduyStudent) {
        int ability1 = ability();
        int ability2 = puffenduyStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n", getName(), puffenduyStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: % d VS %d%n", puffenduyStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Пуффендуец %s такой же, как пуффендуец %s: %d VS %d%n", puffenduyStudent.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d", super.toString(), diligence, fidelity, honesty);

    }

}

