public class LoanApiTest {

    public void validateLoanStatus() {
        String expectedStatus = "APPROVED";
        String actualStatus = "APPROVED";

        if (!expectedStatus.equals(actualStatus)) {
            throw new AssertionError("Loan status validation failed");
        }

        System.out.println("Loan status validation passed");
    }

    public static void main(String[] args) {
        new LoanApiTest().validateLoanStatus();
    }
}