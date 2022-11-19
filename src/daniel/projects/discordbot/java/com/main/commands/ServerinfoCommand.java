package daniel.projects.discordbot.java.com.main.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.time.format.DateTimeFormatter;

public class ServerinfoCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent command) {

        String[] args = command.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("$" + "serverinfo")){

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Informações do servidor: " + command.getMessage().getGuild().getName());
            embed.addField("Nome do servidor: ", command.getMessage().getGuild().getName(), false);
            embed.addField("Id do servidor: ", command.getGuild().getId(), false);
            embed.addField("Dono:", command.getGuild().getOwner().getEffectiveName() + " id do dono: " + command.getGuild().getOwnerId(), false);
            embed.addField("Quantidade de membros:", command.getGuild().getMembers().size() + " membros", false);
            embed.addField("Numero de canais:", String.valueOf(command.getGuild().getChannels().size()), false );
            embed.addField("Criado em: ", String.valueOf(command.getGuild().getTimeCreated().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))), false);
            embed.addField("Numero de cargos no servidor: ",  command.getGuild().getRoles().size() +" cargos", false);
            embed.setColor(Color.GREEN);

            command.getMessage().replyEmbeds(embed.build()).queue();



        }

    }
}
