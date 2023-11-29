package samplePgm;

public class OnSeason {
	int price;
	double discount;
	
public void discount(int price) {
	discount=0.15*price;
	System.out.println("Discout OnSeason "+discount );
}
}
