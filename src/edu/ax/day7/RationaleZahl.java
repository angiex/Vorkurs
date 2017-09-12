package edu.ax.day7;

public class RationaleZahl {

	private int num, denum;
	private int shortenedNum, shortenedDenum;

	public RationaleZahl() {

	}

	public RationaleZahl(int num, int denum) {
		setNum(num);
		setDenum(denum);
	}

	public int getNum() {
		return num;
	}

	public int getDenum() {
		return denum;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setDenum(int denum) {
		if (denum == 0) {
			throw new IllegalArgumentException("You cannot divide by 0.");
		}
		this.denum = denum;
	}

	public RationaleZahl multiplication(RationaleZahl otherNumber) {
		int newNum = this.num * otherNumber.num;
		int newDenum = this.denum * otherNumber.denum;

		RationaleZahl multiplied = new RationaleZahl(newNum, newDenum);
		multiplied.shorten();
		return multiplied;
	}

	// TO DO: Methode zur Addition
	public RationaleZahl addition(RationaleZahl otherNumber) {
		int newNum = (this.num * otherNumber.denum) + (otherNumber.num * this.denum);
		int newDenum = this.denum * otherNumber.denum;

		RationaleZahl added = new RationaleZahl(newNum, newDenum);
		added.shorten();
		return added;
	}

	private void shorten() {
		shortenedNum = num / findGGT();
		shortenedDenum = denum / findGGT();
	}

	public RationaleZahl getShortenedNumber() {
		shorten();
		RationaleZahl shortened = new RationaleZahl(shortenedNum, shortenedDenum);
		return shortened;
	}

	public int findGGT() {
		// Euclidean Algorithm;
		int z = num;
		int ggT = denum;

		while (z % ggT != 0) {
			int mod = z % ggT;
			z = ggT;
			ggT = mod;
		}

		return ggT;
	}

	public String toString() {
		return num + "/" + denum;
	}

}