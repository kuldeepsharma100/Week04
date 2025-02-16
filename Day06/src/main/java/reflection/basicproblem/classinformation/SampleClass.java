package reflection.basicproblem.classinformation;

public class SampleClass {
    private int number;
    private String text;

    public SampleClass() {}

    public SampleClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }
}