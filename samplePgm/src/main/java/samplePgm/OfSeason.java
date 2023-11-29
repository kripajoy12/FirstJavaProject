package samplePgm;

public class OfSeason extends OnSeason{
	public void discount(int price) {
		
		super.discount(100);
		discount=0.4*price;
		System.out.println("Discount ofseason: "+discount);
}
}