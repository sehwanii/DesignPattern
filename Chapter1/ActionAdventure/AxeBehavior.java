package ActionAdventure;

public class AxeBehavior implements WeaponBehavior{
	public void useWeapon(){
		useAxe();
	}

	private void useAxe(){
		System.out.println("도끼를 사용합니다.");
	}
}
