
/**
 * Director
 */
package Builder;

public class Director {
	private Builder builder;
	public Director (Builder builder) {
		this.builder = builder;
	}
	
	public void constract() {
		builder.buildCelling();
		builder.buildDoor();
		builder.buildWall();
	}
}
