package daniel.projects.discordbot.java.com.main.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class UserinfoCommand extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent command) {

        String[] args = command.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("$" + "userinfo")){

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Informações do usuário " + command.getMessage().getAuthor().getAsMention());
            embed.addField("Nome do usuário:", command.getAuthor().getName(), false );
            embed.addField("Id da conta:", command.getAuthor().getId(), false);
            embed.addField("Criou a conta em:", String.valueOf(command.getMessage().getAuthor().getTimeCreated()), false);
            embed.addField("É um bot: ", String.valueOf(command.getAuthor().isBot()), false);
            embed.setColor(Color.red);

            command.getMessage().replyEmbeds(embed.build()).queue();
        }
    }
}
