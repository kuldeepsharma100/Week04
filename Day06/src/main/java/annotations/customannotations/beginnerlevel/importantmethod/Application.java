package annotations.customannotations.beginnerlevel.importantmethod;

public class Application {

    @ImportantMethod
    public void criticalFunction() {
        System.out.println("Executing critical function...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void secondaryFunction() {
        System.out.println("Executing secondary function...");
    }

    public void normalFunction() {
        System.out.println("Executing normal function...");
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.criticalFunction();
        app.secondaryFunction();
        app.normalFunction();
    }
}
