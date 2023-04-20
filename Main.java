public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Bill",70, new Bow(20), new SmallShield()))
                .addPersons(new Archer("Bob", 80, new Bow(15), new BigShield()));
        knights.addPersons(new Knight("John", 100, new Knife(), new SmallShield()))
                .addPersons(new Knight("Jim", 100, new Knife(), new SmallShield()));
        System.out.println("Max armour in team " + knights.maxArmor());
        System.out.println("Min armour in team " + knights.minArmor());
        
        Archer archer1 = new Archer("Bill",70, new Bow(20), new SmallShield());
        Archer archer2 = new Archer("Bob", 80, new Bow(15), new BigShield());
        System.out.println(archer1);
        System.out.println(archer2);
        Battle fight = new Battle(archer1, archer2);
        fight.run();
    }
}
