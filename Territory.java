/* Algorithmics
 * 14708689 Orla Cullen
 * 05641349 Gavin Keaveney
 * 14343826 Jonathan Sweeney 
 */

public class Territory {

	public int player;
	public int node;
	public int army_units;
	public String country_name;
	public String shorthand;
	private String insignia;

	Territory(int input_node, String input_name, String input_short) {
		node = input_node;
		country_name = input_name;
		shorthand = input_short;
	}

	void setInsignia(String insignia_input){
		insignia = insignia_input;
	}
	
	void setArmies(int army_input) {
		army_units += army_input;
	}

	void setPlayer(int player_input) {
		player = player_input;
	}

	int getArmies() {
		return army_units;
	}

	int getPlayer() {
		return player;
	}

	public String getName() {
		return country_name;
	}

	public String getShortName() {
		return shorthand;
	}

	public String getInsignia() {
		return insignia;
	}

	int getNode() {
		return node;
	}

}