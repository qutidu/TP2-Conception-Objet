package tp2;

import java.util.Random;

public abstract class Pokemon {
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax = 10;
	private TypePokemon type;
	private static java.util.Random random = new Random();
	
	public Pokemon(String nom,TypePokemon type) {
		this.nom = nom;
		this.niveau = random.nextInt(1, niveauMax + 1);
		this.hp = 2*niveau;
		this.atk = (niveau/2) +1;
		this.type = type;
	}
	
	public String getNom() {
		return nom;
	}
	public int getHp() {
		return hp;
	}
	public int getAtk() {
		return atk;
	}
	public int getNiveau() {
		return niveau;
	}
	
	public TypePokemon getType() {
		return type;
	}
	
	public boolean isKO(){
		if(hp==0) {
			return true;
		}
		return false;
	}
	
	public abstract void attaquer(Pokemon p);
	
	public abstract void subir(Pokemon p);
	
	public void soigner() {
		hp = niveau*2;
	}
	
	public String toString() {
		String ch = " Nom : " + nom + " HP : " + hp + " attaque : " + atk + " niveau :" + niveau +" type :" + type;
		return ch;
	}
	
	
	public void log (String msg) {
		System.out.println(msg);
	}
	
	
}
