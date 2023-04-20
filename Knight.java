public class Knight extends Warrior<Knife, Armor> {
    public Knight(String name, int hp, Knife weapon, Armor shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return "Knight{" +
                super.toString() +
                '}';
    }
}
