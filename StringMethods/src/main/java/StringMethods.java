import java.util.stream.Stream;

public class StringMethods {

    static String evaluateStringRepeat(String greeting, String sound) {
        return greeting + " " + sound.repeat(3);
    }

    static Stream<String> evaluateStringLines(String greeting) {
        return greeting.lines();
    }

    static void evaluateStringIsBlank(String text) {
        System.out.println(text.isBlank());
    }

    static void evaluateStringStrip(String text) {
        System.out.println("String.strip(): [" + text.strip() + "]");
    }

    static void evaluateStringStripLeading(String text) {
        System.out.println("String.stripLeading(): [" + text.stripLeading() + "]");
    }

    static void evaluateStringStripTrailing(String text) {
        System.out.println("String.stripTrailing(): [" + text.stripTrailing() + "]");
    }

    public static void main(String[] args) {
        //String.repeat()
        String santa = evaluateStringRepeat("Merry Christmas", "Ho");
        System.out.println("\nSanta be like: \n" + santa);

        //String.lines()
        Stream<String> people = evaluateStringLines("Merry Christmas\nand\nHappy New Year");
        System.out.println("\nPeople be like: ");
        people.forEach(System.out::println);

        //String.isBlank()
        String text = "    ";
        System.out.println("\nInitial String: [" + text + "]");
        evaluateStringIsBlank(text);

        //String.strip(); String.stripLeading(); String.stripTrailing()
        text = "   sna ke   ";
        System.out.println("\nInitial String: [" + text + "]");
        evaluateStringStrip(text);
        evaluateStringStripLeading(text);
        evaluateStringStripTrailing(text);

    }
}
