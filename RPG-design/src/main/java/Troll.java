public class Troll extends Character{
    public Troll() {
        wb = new BareHandBehaviour();
    }

    @Override
    public void display() {
        System.out.println("I'm a Troll.");
    }
}
