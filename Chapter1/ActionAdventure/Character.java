package ActionAdventure;

public abstract class Character {
	WeaponBehavior	weapon;

	public Character(){}

	public void setWeapon(WeaponBehavior wb){
		this.weapon = wb;
	}

	public void fight(){
		weapon.useWeapon();
	}

	public void performFight(){
		weapon.useWeapon();
	}
}
