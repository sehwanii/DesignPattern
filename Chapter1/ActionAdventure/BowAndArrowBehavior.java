package ActionAdventure;

public class BowAndArrowBehavior implements WeaponBehavior{
	public void useWeapon(){
		useBowAndArrow();
	}

	private void useBowAndArrow(){
		System.out.println("활과 화살을 사용합니다.");
	}
}
