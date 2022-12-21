package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.BobCancelImageBuildEdit.BobCancel;

public class BobCancelSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("bob-fogueira")) {

            var user = command.getOption("user").getAsUser().getAvatarUrl();

            File outfile = new File("bob.png");

            try {

                ImageIO.write(BobCancel(user), "png", outfile);
            } catch (IOException e) {

                e.printStackTrace();
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

