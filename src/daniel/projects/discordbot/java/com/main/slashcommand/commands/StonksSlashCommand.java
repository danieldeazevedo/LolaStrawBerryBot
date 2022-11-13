package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static daniel.projects.discordbot.java.com.main.ImageManager.LaranjoImageBuilderEdit.laranjoOptionText;
import static daniel.projects.discordbot.java.com.main.ImageManager.StonksImageBuildEdit.stonksOptionContext;

public class StonksSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {


        if (command.getName().equals("stonks")) {

            var command_text = command.getOption("texto").getAsString();

            File outputfile = new File("stonks.png");

            try {
                ImageIO.write(stonksOptionContext(command_text), "png", outputfile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            command.replyFiles(FileUpload.fromData(outputfile)).complete();

            try {
                Files.deleteIfExists(outputfile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
