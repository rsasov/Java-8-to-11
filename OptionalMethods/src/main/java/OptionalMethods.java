import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalText = Optional.of("Text");
        //Optional.or()
        System.out.println(optionalEmpty.or(() -> optionalText));
        //Optional.ifPresentOrElse
        optionalText.ifPresentOrElse(
                value -> System.out.println("Found: " + value),
                () -> System.out.println("Not found")
        );
    }
}
