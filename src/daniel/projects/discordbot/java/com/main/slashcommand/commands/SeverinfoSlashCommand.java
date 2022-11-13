package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class SeverinfoSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {


        if(command.getName().equals("serverinfo")){


            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Informações do servidor: " + command.getGuild().getName());
            embed.addField("Nome do servidor: ", command.getGuild().getName(), false);
            embed.addField("Id do servidor: ", command.getGuild().getId(), false);
            embed.addField("Dono:", command.getGuild().getOwner() + " id do dono: " + command.getGuild().getOwnerId(), false);
            embed.addField("Quantidade de membros:", command.getGuild().getMembers().size() + " membros", false);
            embed.addField("Numero de canais:", String.valueOf(command.getGuild().getChannels().size()), false );
            embed.addField("Criado em: ", String.valueOf(command.getGuild().getTimeCreated()), false);
            embed.setColor(Color.GREEN);


            command.replyEmbeds(embed.build());



        }
    }
}
