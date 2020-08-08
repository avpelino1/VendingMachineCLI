import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserMoneyInput {

	public static double currentBalance = 0.00;

	public static void moneyInput(double money) {

		Set<Double> bills = new HashSet<Double>(Arrays.asList(new Double[] { 1.00, 2.00, 3.00, 5.00, 10.00 }));
		if (bills.contains(money)) {
			currentBalance += money;
		}
	}

	public double getCurrentBalance(double cash) {
		return currentBalance;
	}
}
