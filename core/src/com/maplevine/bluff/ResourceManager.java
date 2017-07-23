package com.maplevine.bluff;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;


/**
 * Created by jeunghwansuh on 7/10/17.
 */

public class ResourceManager {

    public static Texture
            menuBackground,
            gameBackground,
            playButton;


    public  static void create(){


        menuBackground = new Texture(Gdx.files.internal("Menu Background.png"));
        gameBackground = new Texture(Gdx.files.internal("Game Background.png"));
        playButton = new Texture(Gdx.files.internal("Play Button.png"));


    }
    public static void dispose(){

        menuBackground.dispose();
        gameBackground.dispose();




    }

}