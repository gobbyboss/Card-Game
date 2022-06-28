import java.awt.Image;


public class Model {
    int option;
    int updateCounter;
    public Model()
    {
        updateCounter = 900;
        option = 0;
    }

    public void update()
    {
        switch(option)
        {
            case 0:
            {
                loadGame();
            }
            case 1:
            {
                menu();
            }
        }
    }

    void loadGame()
    {
        if(updateCounter == 600)
        {
            View.background = View.loadImage("assets/backgrounds/logo.png");
            updateCounter--;
        }
        else if(updateCounter == 300)
        {
            View.background = View.loadImage("assets/backgrounds/menuBG.png");
            updateCounter--;
        }
        else if(updateCounter == 0)
        {
            option++;
            updateCounter = 20;
        }
        else
        {
            updateCounter--;
        }
    }

    void menu()
    {

    }
}