package game;

public class Barbarian extends Character {

	public Barbarian(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub

		System.out.println("You are a strong, hulky barbarian. Añadimos texto en esta linea");
		System.out.println("You are a strong, hulky barbarian. User 1 añade linea. Forzamos conflicto directamente");
		
	}
}
