package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.manage.SlashCommandManager;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.MopazImageBuildEdit.avatarParaImagem;

public class MopazSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command){

        if(command.getName().equals("mopaz")){

            File outputfile = new File("teste.png");
            try {
                var command_user = command.getUser().getAvatarUrl();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                ImageIO.write(avatarParaImagem(command_user), "png", outputfile);
                byte[] data = baos.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
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
