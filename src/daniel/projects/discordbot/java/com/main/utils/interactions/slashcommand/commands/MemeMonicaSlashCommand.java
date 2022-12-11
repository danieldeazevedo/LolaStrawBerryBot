package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.MonicaImageBuildEdit.MonicaText;

public class MemeMonicaSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.equals("mememonica")) {
            File outputfile = new File("monica.png");


            try {
                var content = command.getOption("texto").getAsString();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                ImageIO.write(MonicaText(content), "png", outputfile);
                ImageIO.read(new File("https://cdn.discordapp.com/attachments/1038620681576914994/1043647540479926272/117_Sem_Titulo_20221119133047.jpg"));
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