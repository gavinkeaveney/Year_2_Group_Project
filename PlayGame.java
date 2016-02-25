/* Algorithmics
 * 14708689 Orla Cullen
 * 05641349 Gavin Keaveney
 * 14343826 Jonathan Sweeney 
 */
public class PlayGame {
	SplitFrameGUI interfaceFrame = new SplitFrameGUI();
	PlayGame(){
	
		Territory territory = new Territory(1);
		interfaceFrame.pack();
		interfaceFrame.setVisible(true);
		int playerId, countryId;
		String name;

		// display blank territory
		interfaceFrame.displayMap();

		// get player names
		for (playerId = 0; playerId < GameData.NUM_PLAYERS; playerId++) {
			interfaceFrame.displayString("Enter the name of player " + (playerId + 1));
			name = interfaceFrame.getCommand();
			interfaceFrame.displayString("Welcome --> " + name);
		}

		// add units
		countryId = 0;
		for (playerId = 0; playerId < GameData.NUM_PLAYERS; playerId++) {
			for (int i = 0; i < GameData.INIT_COUNTRIES_PLAYER; i++) {
				territory.setArmies(countryId);
				countryId++;
			}
		}
		for (; playerId < GameData.NUM_PLAYERS_PLUS_NEUTRALS; playerId++) {
			for (int i = 0; i < GameData.INIT_COUNTRIES_NEUTRAL; i++) {
				territory.setArmies(countryId);
				countryId++;
			}
		}

		// display map
		interfaceFrame.displayMap();

	}
	public int rollDice() {
		Die die = new Die();
		die.roll();
		int die1 = die.value();
		interfaceFrame.displayString(" Player 1 rolled: " + die.getDie());
		die.roll();
		int die2 = die.value();
		interfaceFrame.displayString(" Player 2 rolled: " + die.getDie());

		int winner = 0;
		if (die1 > die2) {
			winner = 1;
			interfaceFrame.displayString(" Player 1  wins");
		} else if (die1 < die2) {
			winner = 0;

			interfaceFrame.displayString(" Player 2  wins");
		} else
			winner = rollDice();

		return winner;

	}
	
	
	}

	