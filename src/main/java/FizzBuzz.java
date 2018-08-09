import java.io.IOException;
import java.io.Writer;

public class FizzBuzz {
    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    FizzBuzz(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder fizzBuzzBuilder = new StringBuilder();
        if (this.id % 3 == 0) {
            fizzBuzzBuilder.append("Fizz");
        }
        if (this.id % 5 == 0) {
            fizzBuzzBuilder.append("Buzz");
        }

        if (fizzBuzzBuilder.length() == 0) {
            return String.valueOf(id);
        } else {
            return fizzBuzzBuilder.toString();
        }
    }

    void print(Writer writer) throws IOException {
        writer.write(String.valueOf(this).concat("\n"));
    }
}
