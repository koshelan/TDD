public class CreditCalculator {
    public static double paymentAmount(float amount, float percent, int months){
        return amount*(percent/(100*12))/(1- Math.pow(1 + percent / (100 * 12),-(months)));
    }

    public static double totalPayment(float amount, float percent, int months){
        return months*paymentAmount(amount,percent,months);
    }
    public static double overpayment(float amount, float percent, int months){
        return months*paymentAmount(amount,percent,months)-amount;
    }
}
