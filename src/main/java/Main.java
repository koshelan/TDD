public class Main {
    public static void main(String[] args) {
        float amount = 20000.0F;
        float percent = 12.0F;
        int months = 36;

        System.out.println("Платёж: "+CreditCalculator.paymentAmount(amount,percent,months));
        System.out.println("Сумма к возврату: "+CreditCalculator.totalPayment(amount,percent,months));
        System.out.println("Переплата: "+CreditCalculator.overpayment(amount,percent,months));

    }
}
