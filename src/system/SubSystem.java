package system;

public abstract class SubSystem extends System {
	protected int level;
	protected int maxLevel;
	
	public SubSystem(int startLevel) {
		level = startLevel;
	}
	
	public int getLevel() {return level;}
	public int getMaxLevel() {return maxLevel;}
	
	public int getSystemLevel() {
		if (getLevel() - getDamage() >= 0) {return getLevel() - getDamage();}
		else {return 0;}
	}
	
	public int getSystemCap() {
		return getLevel();
	}
}
