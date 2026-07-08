public class Knight extends Character{
    public Knight() {
        wb = new SwordBehaviour();
    }

    @Override
    public void display() {
        System.out.println("I'm a Knight.");
    }
}
