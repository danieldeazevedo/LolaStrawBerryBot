package daniel.projects.discordbot.java.com.main.utils.ImageManager;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MopazImageBuildEdit extends ListenerAdapter {

    public static BufferedImage avatarParaImagem(String command_user) throws IOException {

        BufferedImage img = ImageIO.read(new URL("https://i.imgur.com/HNmdowJ.png"));
        BufferedImage user_avatar = ImageIO.read(new URL(command_user));
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Comic Sans MS", Font.BOLD, 30);
        graphics.setFont(font);
        graphics.setColor(Color.RED);

        graphics.drawImage(user_avatar,70,50,100 , 100, null);
        graphics.dispose();

        return img;


    }
}
