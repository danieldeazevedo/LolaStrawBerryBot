package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.awt.*;

import static daniel.projects.discordbot.java.com.main.BotLauncher.jda;

public class BotInfoSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("botinfo")){



            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Informações sobre mim :3");
            embed.setDescription("<a:SCclaw:1038812052753485855>| Olá eu sou a Lola a bot mais fofa de todo o discord, fui criada em Sábado, 5 de novembro de 2022 às 14:24 por MrProplayer#1058 para a ajudar e diverti os servidores onde eu estou. Fui Criada em Java <:java:1038821132062707722> usando a lib do JDA <:jda:1040000817270370334> e estou em constante mudanças!");
            embed.addField("Estou em:", jda.getGuilds().size() + " servidores", true);
            embed.addField("Convide-me a seu servidor", "clique no botão invite abaixo", true);
            embed.addField("Conheço mais de:", jda.getUsers().size() + " usuarios", false);
            embed.setColor(Color.ORANGE);


            command.replyEmbeds(embed.build()).addActionRow(
                    Button.link("https://discord.com/oauth2/authorize?client_id=1038486811862909101&scope=bot&permissions=8", "invite")
            ).queue();
        }

    }

}

