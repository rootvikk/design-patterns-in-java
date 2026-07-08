public class Archer extends Character{
    public Archer() {
        wb = new BowBehaviour();
    }

    @Override
    public void display() {
        System.out.println("I'm an Archer.");
    }
}
