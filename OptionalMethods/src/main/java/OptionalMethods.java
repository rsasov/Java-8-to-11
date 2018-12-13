import java.util.Optional;

public class OptionalMethods {

    static void evaluateOptionalOr(Optional<String> opt1, Optional<String> opt2) {
        System.out.println(opt1.or(() -> opt2));
    }

    static void evaluateOptionalIfPresentOrElse(Optional<String> opt1) {
        opt1.ifPresentOrElse(
                value -> System.out.println("Found: " + value),
                () -> System.out.println("Not found")
        );
    }

    public static void main(String[] args) {
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalText = Optional.of("Text");

        //Optional.or()
        evaluateOptionalOr(optionalEmpty, optionalText);

        //Optional.ifPresentOrElse
        evaluateOptionalIfPresentOrElse(optionalEmpty);
    }
}
