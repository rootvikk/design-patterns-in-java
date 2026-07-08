public class Game {
    static void main() {
        Character a = new Archer();
        a.display();
        a.performAttack();

        Character b = new Knight();
        b.display();
        b.performAttack();

        Character c = new Troll();
        c.display();
        c.performAttack();
        c.setWeapon(new SwordBehaviour());
        c.performAttack();

        BoobyTrap boobyTrap = new BoobyTrap();
        boobyTrap.activateBoobyTrap();
    }
}
