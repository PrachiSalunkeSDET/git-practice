public class CustomerStatusValidator {

       private static final String ACTIVE_STATUS = "ACTIVE";

    public boolean isActive(String status) {
        return ACTIVE_STATUS.equalsIgnoreCase(status);
    }

}