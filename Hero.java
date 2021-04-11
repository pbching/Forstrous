
public class Hero extends Creature{
	private String name;
	
	private int currentTileX;
	private int currentTileY;
	
	private boolean inMap = false;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Hero(String iD) {
		super(iD);
		HP = maxHP = 100;
		luck = 10;
		attack = 10;
		crit = 10;
	}
	public void equip(Item item) {
		
	}
	
	public void move(int direction) {
		switch(direction) {
		case "VK_LEFT":
			position.x	- 1;
		case "VK_RIGHT":
			position.x + 1;
		case "VK_UP":
			position.y + 1;
		case "VK_DOWN":
			position.y - 1;
		}
	}
}
