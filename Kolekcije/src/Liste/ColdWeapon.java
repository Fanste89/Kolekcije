package Liste;

public class ColdWeapon implements Weapon {

	private String name ;
	private int damage;


	
	
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getDamage() {
		return damage;
	}




	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
	
	@Override
	public void hit(Soldier soldier) {
	
		int preostaliHealth = soldier .getHealth() - this.damage;
		soldier.setHealth(preostaliHealth);
		System.out.println(soldier.getName() + " sada ima " + preostaliHealth);
		
		
		
		
		
	}

	
	
	
	
	

}
