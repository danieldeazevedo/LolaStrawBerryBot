package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.WandinhaImageBuildEdit.WandinhaText;

public class WandinhaSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("wandinha")){

            var texto = command.getOption("texto").getAsString();

            File outfile = new File("wandinha.png");

            try {
                ImageIO.write(WandinhaText(texto), "png", outfile);
            }catch (IOException e){

                e.printStackTrace();
            }

            command.reply("O que a wandinha falou me deu medo :() deu medo em você tambem?").addFiles(FileUpload.fromData(outfile)).queue();
        }

        }

    }

