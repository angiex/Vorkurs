package edu.ax.day7;

public class RationaleZahl extends AusgabeBasis {

	private int num, denom;
	private int shortenedNum, shortenedDenom;

	public RationaleZahl() {

	}

	public RationaleZahl(int num, int denom) {
		setNum(num);
		setDenom(denom);
	}

	public int getNum() {
		return num;
	}

	public int getDenom() {
		return denom;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setDenom(int denom) {
		if (denom == 0) {
			throw new IllegalArgumentException("You cannot divide by 0.");
		}
		this.denom = denom;
	}

	public RationaleZahl multiplication(RationaleZahl otherNumber) {
		int newNum = this.num * otherNumber.num;
		int newDenom = this.denom * otherNumber.denom;

		RationaleZahl multiplied = new RationaleZahl(newNum, newDenom);
		multiplied.shorten();
		return multiplied;
	}

	// TO DO: Methode zur Addition
	public RationaleZahl addition(RationaleZahl otherNumber) {
		int newNum = (this.num * otherNumber.denom) + (otherNumber.num * this.denom);
		int newDenom = this.denom * otherNumber.denom;

		RationaleZahl added = new RationaleZahl(newNum, newDenom);
		added.shorten();
		return added;
	}

	private void shorten() {
		shortenedNum = num / findGGT();
		shortenedDenom = denom / findGGT();
	}

	public RationaleZahl getShortenedNumber() {
		shorten();
		RationaleZahl shortened = new RationaleZahl(shortenedNum, shortenedDenom);
		return shortened;
	}

	public int findGGT() {
		// Euclidean Algorithm;
		int z = num;
		int ggT = denom;

		while (z % ggT != 0) {
			int mod = z % ggT;
			z = ggT;
			ggT = mod;
		}

		return ggT;
	}

	public String toString() {
		return num + "/" + denom;
	}

	@Override
	public void print() {
		System.out.println("I describe rational numbers.");
	}

}