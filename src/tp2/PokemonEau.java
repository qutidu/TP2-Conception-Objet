package tp2;

public class PokemonEau extends Pokemon {
	public PokemonEau(String nom) {
		super(nom,TypePokemon.EAU);
	}
	
	public void attaquer(Pokemon p) {
		p.subir(this);
	}
	
	public void subir(Pokemon p) {
		int degats = p.getAtk();
		switch(p.getType()) {
		case PLANTE : degats = p.getAtk() * 2;break;
		case EAU : degats = p.getAtk() / 2;break;
		case FEU : degats = p.getAtk() / 2;break;
		default : break;
		}
		hp -=degats;
	}
}
