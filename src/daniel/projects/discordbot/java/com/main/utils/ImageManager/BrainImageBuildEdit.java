package daniel.projects.discordbot.java.com.main.utils.ImageManager;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class BrainImageBuildEdit extends ListenerAdapter {

    public static BufferedImage BrainTest(String option_1, String option_2, String option_3, String option_4, String option_5, String option_6) throws IOException {
        URL url = new URL("https://cdn.discordapp.com/attachments/1013211250743848980/1054538350347956355/013c611c579235212c1034fa53103716.png");
        BufferedImage img = ImageIO.read(url);
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Arial", Font.BOLD, 25);
        graphics.setFont(font);
        graphics.setColor(Color.BLACK);


        graphics.drawString(option_1, 10, 50);
        graphics.drawString(option_2, 10, 200);
        graphics.drawString(option_3, 10, 350);
        graphics.drawString(option_4, 10, 500);
        graphics.drawString(option_5, 10, 650);
        graphics.drawString(option_6, 10, 800);
        graphics.dispose();
        return img;
    }
}
