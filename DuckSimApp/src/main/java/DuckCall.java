public class DuckCall {
    QuackBehaviour qb;

    public DuckCall() {
        qb = new Quack();
    }
    public void performDuckCall() {
        qb.quack();
    }
}
