package basicprograms;

public class StockReport {
	String stockName;
	double noOfShares;
	double sharePrize;

	// constructor.
	public StockReport(String stockName, double noOfShares, double sharePrize) {
		this.stockName = stockName;
		this.sharePrize = sharePrize;
		this.noOfShares = noOfShares;
	}

	public double calStock() {
		double stockPrize = sharePrize / noOfShares;
		return stockPrize;
	}

	public double total(double stockPrize) {
		double stockTotal = stockPrize * noOfShares;
		return stockTotal;
	}

	public static void main(String[] args) {
		StockReport sr1 = new StockReport("tcs", 50, 2000);
		System.out.println("Stock is: " + sr1.calStock());
		double result = sr1.total(sr1.calStock());
		System.out.println("Total Stock is: " + result);

	}
}
