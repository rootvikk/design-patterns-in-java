public class DuckSimulatorApp {
    static void main() {
        Duck m = new MallardDuck();
        m.performQuack();
        m.performFly();
        m.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();

        DuckCall d = new DuckCall();
        d.performDuckCall();
    }
}
