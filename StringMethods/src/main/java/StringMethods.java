import java.util.stream.Stream;

public class StringMethods {
    public static void main(String[] args) {
        //String.repeat()
        String greeting = "Merry Christmas";
        String sound = "Ho";
        String santa = greeting + " " + sound.repeat(3);
        System.out.println("\nString.repeat()\n" + santa);

        //String.lines()
        final String originalString = greeting +"\nand\nHappy New Year\n!!!";
        final Stream<String> strings = originalString.lines();
        System.out.println("\nString.lines()");
        strings.forEach(System.out::println);

        //String.isBlank()
        String topic = "    ";
        System.out.println("\nString.isBlank()\n" + topic.isBlank());

        //String.strip(); String.stripLeading(); String.stripTrailing()
        String s = "   sna ke   ";
        System.out.println("\nString.strip()\n[" + s.strip() + "]");
        System.out.println("\nString.stripLeading()\n[" + s.stripLeading() + "]");
        System.out.println("\nString.stripTrailing()\n[" + s.stripTrailing() + "]");
    }
}
