package demo.box;

public class Box {

	private final String name;
	private final int weight;
	private final String colour;
	private final String country;

	public Box(String name, int weight, String colour, String country) {
		this.name = name;
		this.weight = weight;
		this.colour = colour;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public String getColour() {
		return colour;
	}

	public String getCountry() {
		return country;
	}
}