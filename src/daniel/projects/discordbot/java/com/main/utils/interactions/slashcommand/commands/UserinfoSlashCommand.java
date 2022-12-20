package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


import java.awt.*;
import java.time.format.DateTimeFormatter;

public class UserinfoSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("userinfo")) {

            try {

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("<:cofee:1041332164194730044> Informações do usuário " + command.getOption("user").getAsUser().getName());
                embed.addField("<a:aBlobTreta:1038811777208688750> Nome do usuário:", command.getOption("user").getAsUser().getName(), false);
                embed.addField("<:emoji_8:1038820718902775818> Id da conta:", command.getOption("user").getAsUser().getId(), false);
                embed.addField("<a:hack:1038811937611448370> Criou a conta em:", String.valueOf(command.getOption("user").getAsUser().getTimeCreated().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))), false);
                embed.addField("<:manager:1041331548420591627> É um bot: ", String.valueOf(command.getOption("user").getAsUser().isBot()), false);
                embed.addField("flags:", command.getUser().getFlags().toString(), false);
                embed.addField("Entrou no servidor em:", command.getMember().getTimeJoined().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), false);
                embed.setColor(Color.red);
                embed.setThumbnail(command.getOption("user").getAsUser().getAvatarUrl());
                command.replyEmbeds(embed.build()).queue();


            } catch (NullPointerException error) {


                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("<:cofee:1041332164194730044> Informações do usuário " + command.getUser().getName());
                embed.addField("<a:aBlobTreta:1038811777208688750> Nome do usuário:", command.getUser().getName(), false);
                embed.addField("<:emoji_8:1038820718902775818> Id da conta:", command.getUser().getId(), false);
                embed.addField("<a:hack:1038811937611448370> Criou a conta em:", String.valueOf(command.getMember().getTimeCreated().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))), false);
                embed.addField("<:manager:1041331548420591627> É um bot: ", String.valueOf(command.getUser().isBot()), false);
                embed.addField("Flags:", command.getUser().getFlags().toString(), false);
                embed.addField("Entrou no servidor em:", command.getMember().getTimeJoined().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), false);
                embed.setThumbnail(command.getUser().getAvatarUrl());
                embed.setColor(Color.red);
                command.replyEmbeds(embed.build()).queue();


            }
        }
    }
}
