package daniel.projects.discordbot.java.com.main.utils.ImageManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class WandinhaImageBuildEdit {

    public static BufferedImage WandinhaText(String texto) throws IOException {

        URL url = new URL("https://cdn.discordapp.com/attachments/1052000415622893621/1055154479823061093/3670486_e46a5162de717a9.png");

        BufferedImage img = ImageIO.read(url);
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Arial", Font.BOLD, 40);
        graphics.setFont(font);
        graphics.setColor(Color.WHITE);


        graphics.drawString(texto, 20,50 );
        graphics.dispose();

        return img;

    }
}
