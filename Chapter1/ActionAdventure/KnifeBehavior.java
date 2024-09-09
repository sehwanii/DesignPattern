package ActionAdventure;

public class KnifeBehavior implements WeaponBehavior{
	public void useWeapon(){
		useKnife();
	}

	private void useKnife(){
		System.out.println("칼을 사용합니다.");
	}
}
