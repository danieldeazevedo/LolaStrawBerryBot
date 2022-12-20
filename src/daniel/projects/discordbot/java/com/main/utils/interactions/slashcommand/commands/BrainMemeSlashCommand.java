package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.BrainImageBuildEdit.BrainTest;

public class BrainMemeSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("brain-meme")) {
            File outputfile = new File("Brain.png");
            var option_1 = command.getOption("brain1").getAsString();
            var option_2 = command.getOption("brain2").getAsString();
            var option_3 = command.getOption("brain3").getAsString();
            var option_4 = command.getOption("brain4").getAsString();
            var option_5 = command.getOption("brain5").getAsString();
            var option_6 = command.getOption("brain6").getAsString();
            try {
                ImageIO.write(BrainTest(option_1, option_2, option_3, option_4, option_5, option_6), "png", outputfile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            command.replyFiles(FileUpload.fromData(outputfile)).queue();
            try {
                Files.deleteIfExists(outputfile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
