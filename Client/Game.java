import javax.swing.JFrame;
import java.awt.Toolkit;
public class Game extends JFrame {
    Model model = new Model();
    View view = new View(model);
    public Game()
    {
        this.setTitle("Summoner's Royale");
        this.setSize(1920, 1080);
        this.setFocusable(true);
        this.getContentPane().add(view);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
    }
    public void run()
    {
        while(true)
        {
            model.update();
            view.repaint(); 
			Toolkit.getDefaultToolkit().sync(); 

			try
			{
				Thread.sleep(8);
			} catch(Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
        }
    }
}
