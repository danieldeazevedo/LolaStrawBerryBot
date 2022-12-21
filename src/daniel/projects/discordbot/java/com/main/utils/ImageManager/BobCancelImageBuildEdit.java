package daniel.projects.discordbot.java.com.main.utils.ImageManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class BobCancelImageBuildEdit {

    public static BufferedImage BobCancel(String user) throws IOException {
        URL url = new URL("https://cdn.discordapp.com/attachments/1052000415622893621/1054908015410679850/0a14f9e470bd98a2eb00321665d03ac2.png");

        BufferedImage img = ImageIO.read(url);
        BufferedImage option_avatar = ImageIO.read(new URL(user));
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Arial", Font.BOLD, 15);
        graphics.setFont(font);
        graphics.setColor(Color.BLACK);


        graphics.drawImage(option_avatar, 70,80,120 , 120, null);
        graphics.dispose();

        return img;

    }
}
