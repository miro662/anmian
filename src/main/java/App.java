import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App {
    private static void writeFizzBuzzUntil(FizzBuzzFactory factory, int to, Writer writer) {
        FizzBuzz fizzBuzz;
        do {
            fizzBuzz = factory.next();
            try {
                fizzBuzz.print(writer);
                writer.flush();
            } catch (IOException e) {
                System.err.println("Unable to write to writer");
            }
        } while (fizzBuzz.getId() <= to);
    }

    public static void main(String[] args) {
        FizzBuzzFactory factory = new FizzBuzzFactory(1);
        Writer writer = new OutputStreamWriter(System.out);

        App.writeFizzBuzzUntil(factory, 30, writer);
    }
}
