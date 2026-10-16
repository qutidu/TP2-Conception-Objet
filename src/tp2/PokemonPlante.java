package tp2;

public class PokemonPlante extends Pokemon {
	public PokemonPlante(String nom,TypePokemon type) {
		super(nom,type);
	}
	
	public void attaquer(Pokemon p) {
		p.subir(this);
	}
	
	public void subir(Pokemon p) {
		int degats = p.getAtk();
		switch(p.getType()) {
		case FEU : degats = p.getAtk() * 2;break;
		case PLANTE : degats = p.getAtk() / 2;break;
		case EAU : degats = p.getAtk() / 2;break;
		default : break;
		}
		hp -=degats;
	}
}
