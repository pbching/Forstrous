package enemy;

public class MonsterLv2 extends MonsterLv1{
	public MonsterLv2(int x, int y, int attack, int hp, int movementSpeed, int luck, boolean alive, String name) {
		super(x, y, 3/2*attack, 3/2*hp, movementSpeed, (int) (1.1*luck), alive, name);
	}
	
}
