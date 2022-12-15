package daniel.projects.discordbot.java.com.main.utils.ImageManager;

import net.dv8tion.jda.api.hooks.ListenerAdapter;


import java.awt.*;
import java.awt.image.BufferedImage;


public class TextImageBuilderEdit extends ListenerAdapter {

    public static BufferedImage textoParaImagem(String content) {

        BufferedImage img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = img.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Font font = new Font("Comic Sans MS", Font.BOLD, 30);
        graphics.setFont(font);
        graphics.setColor(Color.RED);

        graphics.drawString(content, 5, 30);
        graphics.dispose();

        return img;

    }



}
