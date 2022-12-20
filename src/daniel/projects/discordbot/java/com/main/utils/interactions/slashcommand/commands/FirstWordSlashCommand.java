package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.FirstWordImageBuildEdit.firstword;

public class FirstWordSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {
        if(command.getName().equals("primeiras-palavras")){

            var words = command.getOption("palavras").getAsString();

            String letra = words.substring(0,1);

            File outfile = new File("primeiras.png");

            try {

                ImageIO.write(firstword(words, letra), "png", outfile);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            command.replyFiles(FileUpload.fromData(outfile)).queue();

            try {
                Files.deleteIfExists(outfile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
