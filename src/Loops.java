
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Week 2 HW Loops
		//Question 2 create boolean variables
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		//Question 3 create other variables
		double costOfMilk = 2.89;
		double moneyInWallet = 27.58;
		int thirstLevel = 7;
		
		//Question 4 Boolean operators
		boolean shouldBuyIcecream = isHotOutside && (moneyInWallet > 0);
		System.out.println(shouldBuyIcecream);
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		boolean isAGoodDay = isHotOutside && !isWeekday && (moneyInWallet > 0);
		System.out.println(isAGoodDay);
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (costOfMilk * 2));
		System.out.println(willBuyMilk);
		
		//Question 5 Loops
		//a
		int  x = 0;
		while (x <= 100) {
			System.out.println(x);
			x += 2;
			
		//see new class LoopsQ5 for b and remaining
	
		}
	}

}
