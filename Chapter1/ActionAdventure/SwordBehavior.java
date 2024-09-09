package ActionAdventure;

public class SwordBehavior implements WeaponBehavior{
	public void useWeapon(){
		useSword();
	}

	private void useSword(){
		System.out.println("검을 사용합니다.");
	}
}
