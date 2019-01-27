package asg;

public class Candies {

	public static int countCandies(int startingAmount, int newEvery) {
		int totalCount = 0;
		if (startingAmount < newEvery) {
			return startingAmount;
		}
		totalCount += newEvery;
		startingAmount = startingAmount - newEvery + 1;
		while (startingAmount > 0) {
			totalCount += (startingAmount < newEvery) ? startingAmount : newEvery;
			startingAmount = startingAmount - newEvery + 1;
		}
		return totalCount;
	}

	public static void main(String[] args) {
		System.out.println(Candies.countCandies(3, 2));
	}

}