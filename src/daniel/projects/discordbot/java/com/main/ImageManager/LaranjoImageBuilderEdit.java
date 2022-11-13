package daniel.projects.discordbot.java.com.main.ImageManager;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class LaranjoImageBuilderEdit extends ListenerAdapter {

    public static BufferedImage laranjoOptionText(String content) throws IOException {


         URL url = new URL("https://cdn.discordapp.com/attachments/554048737648050179/610011657632219147/laranjo-meme-cke.jpg");

        BufferedImage img = ImageIO.read(url);
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Arial", Font.BOLD, 30);
        graphics.setFont(font);
        graphics.setColor(Color.BLACK);

        graphics.drawString(content, 5, 30);
        graphics.dispose();

        return img;

    }
}
