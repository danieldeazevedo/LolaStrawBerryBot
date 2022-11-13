package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.time.format.DateTimeFormatter;

public class UserinfoSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

       if(command.getName().equals("userinfo")) {

           EmbedBuilder embed = new EmbedBuilder();
           embed.setTitle("<:cofee:1041332164194730044> Informações do usuário " + command.getUser().getName());
           embed.addField("<a:aBlobTreta:1038811777208688750> Nome do usuário:", command.getUser().getName(), false);
           embed.addField("<:emoji_8:1038820718902775818> Id da conta:", command.getUser().getId(), false);
           embed.addField("<a:hack:1038811937611448370> Criou a conta em:", String.valueOf(command.getUser().getTimeCreated().format(DateTimeFormatter.ofPattern("DD/MM/YYYY"))), false);
           embed.addField("<:manager:1041331548420591627> É um bot: ", String.valueOf(command.getUser().isBot()), false);
           embed.setColor(Color.red);

           command.replyEmbeds(embed.build()).queue();


       }
    }
}
