package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class CoinflipSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("coinflip")){
            //possibles
            String[] CoinflipPossible = {"cara", "coroa"};


            var result = CoinflipPossible[new Random().nextInt(CoinflipPossible.length)];

            if(result.equals("cara")){

                command.reply("caiu cara").queue();
            } else{

                command.reply("caiu coroa").queue();
            }

        }

    }
}
