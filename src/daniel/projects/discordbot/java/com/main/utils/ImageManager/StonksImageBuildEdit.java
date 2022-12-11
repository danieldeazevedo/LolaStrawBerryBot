package daniel.projects.discordbot.java.com.main.utils.ImageManager;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class StonksImageBuildEdit extends ListenerAdapter {


    public static BufferedImage stonksOptionContext(String command_text) throws IOException {

        URL url = new URL("https://i.kym-cdn.com/photos/images/newsfeed/001/499/826/2f0.png");

        BufferedImage img = ImageIO.read(url);
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Arial", Font.BOLD, 30);
        graphics.setFont(font);
        graphics.setColor(Color.black);

        graphics.drawString(command_text, 5, 30);
        graphics.dispose();

        return img;

    }


}
