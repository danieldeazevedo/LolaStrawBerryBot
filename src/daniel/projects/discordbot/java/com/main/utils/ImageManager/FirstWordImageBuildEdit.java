package daniel.projects.discordbot.java.com.main.utils.ImageManager;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class FirstWordImageBuildEdit extends ListenerAdapter {
    public static BufferedImage firstword(String palavras, String letra) throws IOException {

        URL url = new URL("https://cdn.discordapp.com/attachments/1052000415622893621/1054552625485447208/e3495ff2162f100bd825c6b275278608.png");
        BufferedImage img = ImageIO.read(url);
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Arial", Font.BOLD, 15);
        graphics.setFont(font);
        graphics.setColor(Color.BLACK);


        graphics.drawString(letra+"... " +letra+"...", 10,20 );
        graphics.drawString(palavras, 10, 140);
        graphics.dispose();

        return img;

    }

}
