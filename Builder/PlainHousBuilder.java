/**
 * Concrete Builder
 */
package Builder;

public class PlainHousBuilder implements Builder {
    private House house = new House();
	@Override
	public void buildWall() {
		house.setWall("平房 -> 墙");
	}
	@Override
	public void buildDoor() {
		house.setDoor("平房 -> 门");
	}

	@Override
	public void buildCelling() {
		house.setCelling("平房 -> 屋顶");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
