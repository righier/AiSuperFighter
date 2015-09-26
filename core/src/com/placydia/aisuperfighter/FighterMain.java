package com.placydia.aisuperfighter;

import com.badlogic.gdx.Game;
import com.placydia.aisuperfighter.screens.GameScreen;

public class FighterMain extends Game {
	GameScreen gameScreen;

	@Override
	public void create() {
		gameScreen = new GameScreen();
		
		setScreen(gameScreen);
		
	}
	
}