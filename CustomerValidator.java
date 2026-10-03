public class CustomerValidator {

    private static final int MINIMUM_AGE = 18;

    public boolean isValidAge(int age) {
        return age >= MINIMUM_AGE;
    }
}