
public class Creature{
	String ID;
	
	public class Vector2D{
		public int x;
		public int y;
		public Vector2D(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public Vector2D() {}
	} 
	
	protected Vector2D position;
	
	protected int HP;
	
	protected int maxHP;
	
	protected int luck;
	
	protected int crit;
	
	//int mana;
	
	protected int attack;
	
	public Creature(String ID) {
		this.ID = ID;
		
		position = new Vector2D();
	}

	
}
