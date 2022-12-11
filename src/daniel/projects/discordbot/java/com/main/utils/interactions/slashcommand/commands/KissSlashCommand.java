package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.awt.*;
import java.util.Random;

public class KissSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("kiss")){
            //getUSER

           var kiss_user = command.getOption("user").getAsUser();

           if(kiss_user.equals(command.getUser())){
               command.reply("você não pode se auto beijar").queue();
           }

           //image
            String[] images = {
                    "https://images-ext-1.discordapp.net/external/NrPVoh3z1-4xTph_LuuDtXpyoF0vhIZWHLej7SThTRM/https/loritta.website/assets/img/actions/kiss/female_x_female/gif_348.gif",
                    "https://images-ext-2.discordapp.net/external/GK48tR5GCb4qFiv_6BvcM-iddrdEZ0edoo8FLFnRy5g/https/loritta.website/assets/img/actions/kiss/both/gif_285.gif",
                    "https://images-ext-1.discordapp.net/external/Q7ksjEKeMUiSqUYLWlfGFPfdo_jjnltRrmUrHiPOEHE/https/loritta. website/assets/img/actions/kiss/female_x_male/gif_389.gif",
                    "https://images-ext-2.discordapp.net/external/Rsg3zP8cZgj0INAAwg-rHiEDJPu4mBFCU32DbtDuT5k/https/loritta.website/assets/img/actions/kiss/male_x_female/gif_296.gif",
                    "https://images-ext-2.discordapp.net/external/tP7MqFi2NOayhp44-ejY9-hxMUbYOQkUi4-b2wNmWCs/https/loritta.website/assets/img/actions/kiss/male_x_female/gif_290.gif?format=png",
                    "https://images-ext-1.discordapp.net/external/sHDT0l9qsf3jdqNbIMwIqCNTfr710QA9DGDw8Kcohvo/https/loritta.website/assets/img/actions/kiss/female_x_female/gif_341.gif",
                    "https://images-ext-1.discordapp.net/external/b790vBk2cSgfnovO2TytBJI6_aJmP9HS0YoQ4zMvyk4/https/loritta.website/assets/img/actions/kiss/female_x_male/gif_380.gif",
                    "https://images-ext-2.discordapp.net/external/i1rKa0jZdn6c9ZhbWUYTD2xo5ve6UapuaR2IaUx6esg/https/loritta.website/assets/img/actions/kiss/male_x_female/gif_288.gif"

            };

            var imgselect = images[new Random().nextInt(images.length)];



            //embed

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("beijihos");
            embed.setDescription(command.getUser().getAsMention() + "está beijando " + kiss_user.getAsMention());
            embed.setImage(imgselect);
            embed.setColor(Color.red);


            command.replyEmbeds(embed.build()).addActionRow(
                    Button.primary("kissbutton", "retribuir")

            ).queue();



        }




    }
}
