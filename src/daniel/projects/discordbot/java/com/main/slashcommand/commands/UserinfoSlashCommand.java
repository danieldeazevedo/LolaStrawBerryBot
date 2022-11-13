package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class UserinfoSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

       if(command.getName().equals("userinfo")) {

           EmbedBuilder embed = new EmbedBuilder();
           embed.setTitle("Informações do usuário " + command.getUser().getName());
           embed.addField("Nome do usuário:", command.getUser().getName(), false);
           embed.addField("Id da conta:", command.getUser().getId(), false);
           embed.addField("Criou a conta em:", String.valueOf(command.getUser().getTimeCreated()), false);
           embed.addField("É um bot: ", String.valueOf(command.getUser().isBot()), false);
           embed.setColor(Color.red);

           command.replyEmbeds(embed.build()).queue();


       }
    }
}
