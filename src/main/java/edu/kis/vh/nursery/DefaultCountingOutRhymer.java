package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final static int NUMBERS_COUNT = 12;
	private final static int TOTAL_NUMBER = -1;

	private int[] numbers = new int[NUMBERS_COUNT];

	private int total = TOTAL_NUMBER;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL_NUMBER;
	}

	public boolean isFull() {
		return total == NUMBERS_COUNT-1;
	}

	public int getTotal() {
		return total;
	}

	protected int peekaboo() {
		if (callCheck())
			return TOTAL_NUMBER;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return TOTAL_NUMBER;
		return numbers[total--];
	}
}
