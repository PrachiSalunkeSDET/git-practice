public class CustomerStatusValidator {

    public boolean isActive(String status) {
        return "ACTIVE".equalsIgnoreCase(status);
    }
}