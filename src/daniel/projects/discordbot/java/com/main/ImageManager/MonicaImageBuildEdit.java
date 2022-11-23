package daniel.projects.discordbot.java.com.main.ImageManager;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class MonicaImageBuildEdit extends ListenerAdapter {

    public static BufferedImage MonicaText(String content) throws IOException {

        URL url = new URL("https://cdn.discordapp.com/attachments/1038620681576914994/1043647540479926272/117_Sem_Titulo_20221119133047.jpg");

        BufferedImage img = ImageIO.read(url);
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Arial", Font.BOLD, 15);
        graphics.setFont(font);
        graphics.setColor(Color.BLACK);


        graphics.drawString(content, 160,100 );
        graphics.dispose();

        return img;

    }
}
