import loose.AutoEngine;
import loose.Engine;
import tight.ManualEngine;

public class MainApp {
    static void main() {

        // Tight Coupling
        ManualEngine e = new ManualEngine();
        AutoEngine a = new AutoEngine();
        e.start();
        a.start();

        // Loose Coupling
        Engine looseMEngine = new loose.ManualEngine();
        Engine looseAEngine = new loose.AutoEngine();

        looseMEngine.start();
        looseAEngine.start();
    }
}
