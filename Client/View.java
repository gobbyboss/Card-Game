import javax.swing.JPanel;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.awt.Image;

class View extends JPanel
{
    static Image background;
	Model model;

    View(Model m)
    {
        background = loadImage("assets/backgrounds/startupBG.png");
		model = m;
    }

    static Image loadImage(String filename)
	{
		Image readImage = null;
		try
		{
			readImage = ImageIO.read(new File(filename));
		}
		catch(Exception e)
		{
			e.printStackTrace(System.err);
			System.exit(1);
		}	
		return readImage;
	}

    public void paintComponent(Graphics g)
    {
        g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
    }
}