/**
 * Client
 */

package Builder;

public class MainClass {

	public static void main(String[] args) {
		Builder builder = new PlainHousBuilder();
		Director director = new Director(builder);
		director.constract();
		
		House house = builder.getHouse();
		System.out.println(house.getCelling());
		System.out.println(house.getDoor());
		System.out.println(house.getWall());
	}

}
