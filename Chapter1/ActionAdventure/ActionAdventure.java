package ActionAdventure;

public class ActionAdventure {
	public static void main(String[] args) {
		Character A = new King();
		A.fight();
		A.setWeapon(new SwordBehavior());
		A.fight();

		Character B = new Queen();
		B.fight();
	}
}
