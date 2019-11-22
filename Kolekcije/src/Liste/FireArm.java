package Liste;

public class FireArm implements Weapon {

	
	
	
	 private String name;
	 private final int  damage = 10 ; 
	 
	 
	 
	 
	public String getName() {
		return name;
	}





	public int getDamage() {
		return damage;
	}








	@Override
	public void hit(Soldier soldier) {
int preostaliHealth = soldier .getHealth() - this.damage;
soldier.setHealth(preostaliHealth);
System.out.println(soldier.getName() + " sada ima " + preostaliHealth);


		
		
		
		
	}

}
