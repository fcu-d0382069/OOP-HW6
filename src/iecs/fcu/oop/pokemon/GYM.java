package iecs.fcu.oop.pokemon;

public class GYM {
	public static void fight(Player...players){
		//Player winner = null;
		int a=0,b=0,c=0;
		Pokemon[] p1 = players[0].getPokemons();
		Pokemon[] p2 = players[1].getPokemons();
		
		while(a !=2 || b !=2){
			
			if(p1[c].getType() != p2[c].getType()) {
				if(p1[c].getType()==PokemonType.FIRE && p2[c].getType()==PokemonType.GRASS) {
					a++;
				}
				else if((p1[c].getType()==PokemonType.FIRE && p2[c].getType()==PokemonType.WATER)) {
					b++;
				}
				else if((p1[c].getType()==PokemonType.GRASS && p2[c].getType()==PokemonType.WATER)) {
					a++;
				}
				else if((p1[c].getType()==PokemonType.GRASS && p2[c].getType()==PokemonType.FIRE)) {
					b++;
				}
				else if((p1[c].getType()==PokemonType.WATER && p2[c].getType()==PokemonType.FIRE)) {
					a++;
				}
				else if((p1[c].getType()==PokemonType.WATER && p2[c].getType()==PokemonType.GRASS)) {
					b++;
				}
			}
			else{
				if(p1[c].getCp() > p2[c].getCp()) {
					a++;
				}
				else if(p1[c].getCp() < p2[c].getCp()) {
					b++;
				}
				else{
					int rNum = (int)(Math.random()*2);
					if(rNum==0) {
						a++;
					}
					else {
						b++;
					}
				}
			}
			if(a >= 2) {
				players[0].setLevel(players[0].getLevel()+1);
				System.out.println("Winner is "+players[0].getPlayerName()+", and his/her level becomes "+players[0].getLevel()+".");
				
			}
			else if(b >= 2) {
				players[1].setLevel(players[1].getLevel()+1);
				System.out.println("Winner is "+players[1].getPlayerName()+", and his/her level becomes "+players[1].getLevel()+".");
				
			}
			c++;
		}
		
		
	}
}