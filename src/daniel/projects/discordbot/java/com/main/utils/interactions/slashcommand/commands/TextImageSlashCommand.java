package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.TextImageBuilderEdit.textoParaImagem;

public class TextImageSlashCommand extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("textimage")) {

            File outputfile = new File("imagem.png");

            try {
                var content = command.getOption("texto").getAsString();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                ImageIO.write(textoParaImagem(content), "png", outputfile);
                byte[] data = baos.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
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

