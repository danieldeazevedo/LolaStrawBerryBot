package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import net.dv8tion.jda.api.utils.FileUpload;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

import static daniel.projects.discordbot.java.com.main.utils.ImageManager.PerguntaImageBuildEdit.question_meme;

public class PerguntamemeSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("pergunta-milhaomeme")){

            File outfile = new File("pergunta.png");

            var question = command.getOption("pergunta").getAsString();
            var option_a = command.getOption("opção_a").getAsString();
            var option_b  = command.getOption("opção_b").getAsString();
            var option_c = command.getOption("opção_c").getAsString();
            var option_d = command.getOption("opção_d").getAsString();

            String[] oppções = {

                "Letra a",
                    "Letra b",
                    "letra c",
                    "letra d"
            };
            var resposta = oppções[new Random().nextInt(oppções.length)];


            try{

                ImageIO.write(question_meme(question, option_a,option_b,option_c,option_d), "png", outfile);

            }catch (IOException e){

                e.printStackTrace();
            }


            command.reply("Minha opção foi: " + resposta + " qual foi a sua?").addFiles(FileUpload.fromData(outfile)).addActionRow(
                    Button.primary("Option_a", "Letra A"),
                    Button.primary("Option_b", "Letra B"),
                    Button.primary("Option_c", "Letra C"),
                    Button.primary("Option_d", "Letra D")
            ).queue();

            try {
                Files.deleteIfExists(outfile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


        }



    }

