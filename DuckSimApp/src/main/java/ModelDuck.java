public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new NoFly();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a Model Duck");
    }
}
