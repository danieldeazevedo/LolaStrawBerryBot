package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.CryMemeImageBuildEdit.CryMeme;

public class CryMemeSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {


        if (command.getName().equals("choro-meme")) {
            var motivo = command.getOption("motivo").getAsString();

            File outfile = new File("crymeme.png");

            try {

                ImageIO.write(CryMeme(motivo), "png", outfile);
            } catch (IOException e) {

                e.printStackTrace();
            }


        }
    }
}
