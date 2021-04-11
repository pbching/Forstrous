package enemy;

import java.util.Random;

public class MonsterLv1 extends Character{
	
	
	public MonsterLv1(int x, int y, int attack, int hp, int movementSpeed, int luck, boolean alive, String name) {
		super(x, y, attack, hp, movementSpeed, luck, alive, name);
	}

	Random rand = new Random();
	
	//private int distanceX = Math.abs(x - Hero.x);
	//private int distanceY = Math.abs(y - Hero.y);
	
	private void Wonder () {
		int move = rand.nextInt(3);
		switch(move) {
			case 0: moveUp();
			case 1: moveRight();
			case 2: moveDown();
			case 3: moveLeft();
		}
	}
	
	private void approach (Hero hero) {
		if (hero.getX() < x) moveLeft();
		if (hero.getX() > x) moveRight();
		if (hero.getY() < y) moveDown();
		if (hero.getY() > y) moveUp();
	}

	private void dmgHero(Hero hero) {
		if (onHit())
			hero.hp -= attack;
	}
	
	private void takeDmg(Hero hero) {
		if (hero.onHit())
			hp -= hero.attack;
	}
	
	private boolean checkAlive() {
		if (hp > 0)
			return true;
		return false;
	}
	
}
