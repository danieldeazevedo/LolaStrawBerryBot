package daniel.projects.discordbot.java.com.main.utils.ImageManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class PerguntaImageBuildEdit {

    public static BufferedImage question_meme(String question, String option_a, String option_b, String option_c, String option_d) throws IOException {

        URL url = new URL("https://cdn.discordapp.com/attachments/1052000415622893621/1054552396497420328/d6ac15d8500e4b5fab36575c5fbe0c26.png");

        BufferedImage img = ImageIO.read(url);
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Arial", Font.BOLD, 16);
        graphics.setFont(font);
        graphics.setColor(Color.WHITE);


        graphics.drawString(question, 130,270 );
        graphics.drawString(option_a, 110, 315);
        graphics.drawString(option_b, 320, 315);
        graphics.drawString(option_c, 110, 360);
        graphics.drawString(option_d, 320, 360);
        graphics.dispose();

        return img;

    }
}
