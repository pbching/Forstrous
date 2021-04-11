package enemy;

import java.util.Random;

public class Character extends Point {
	protected int attack, hp, movementSpeed, luck;
	protected boolean alive;
	protected String name;
	
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public Character(int x, int y, int attack, int hp, int movementSpeed, int luck, boolean alive, String name) {
		super(x, y);
		this.attack = attack;
		this.hp = hp;
		this.movementSpeed = movementSpeed;
		this.luck = luck;
		this.alive = alive;
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public int getHp() {
		return hp;
	}

	public int getMovementSpeed() {
		return movementSpeed;
	}

	public int getLuck() {
		return luck;
	}

	public boolean isAlive() {
		return alive;
	}

	public Point getLocation() {
		return location;
	}

	protected Point location = new Point (this.x, this.y);
	
	protected boolean onHit() {
		Random rand = new Random();
		int lucky = rand.nextInt(100) + 1;
		if(lucky < luck)
			return true;
		return false;
	}
}
