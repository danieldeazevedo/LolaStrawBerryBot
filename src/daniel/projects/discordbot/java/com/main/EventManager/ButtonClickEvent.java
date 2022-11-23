package daniel.projects.discordbot.java.com.main.EventManager;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.awt.*;

public class ButtonClickEvent extends ListenerAdapter {
    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {

        if(event.getComponentId().equals("HelpInformationCmd")){

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Comandos de informação: ");
            embed.setDescription("Avatar, BotInfo, Ping, Help, Data, Userinfo, Serverinfo, ServerIcon,Userinfo, channelinfo");
            embed.setColor(Color.blue);

            event.replyEmbeds(embed.build()).queue();
        }

        if(event.getComponentId().equals("HelpFunCmd")){

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Comandos de diversão:");
            embed.setDescription("Piada, textimage, laranjo, kiss, hug, stonks e say, socar,mememonica");
            embed.setColor(Color.green);

            event.replyEmbeds(embed.build()).setEphemeral(true).queue();

        }

        if(event.getComponentId().equals("HelpAdmCmd")){
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Comandos de moderação:");
            embed.setDescription("Ban, kick, clear, warn");
            embed.setColor(Color.CYAN);

            event.replyEmbeds(embed.build()).queue();
        }

        if(event.getComponentId().equals("HelpCommand")){


            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Central de ajuda da Lola");
            embed.setDescription("Precisa de suporte? Entre no meu servidor de suporte: https://discord.gg/gHVaDtuEBY");
            embed.addField("Veja meu comandos clicando nos butões abaixo! use os comandos em /", "Caso tenha algum bug ou erro denuncie no meu servidor de suporte https://discord.gg/gHVaDtuEBY", true);

            event.replyEmbeds(embed.build()).addActionRow(
                    net.dv8tion.jda.api.interactions.components.buttons.Button.primary("HelpInformationCmd", "Informações")
            ).addActionRow( Button.primary("HelpFunCmd", "Diverções")).setEphemeral(true).queue();


        }

        if(event.getComponentId().equals("AdvcInfo")){


            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Informações avançadas");
            embed.addField("Versão da lola:", "7.4.0-alpha", true);
            embed.addField("Versão do JDA: ", "5.0.0.alpha21", true);
            embed.addField("Versão do java: ", "8", true);
            embed.addField("Versão do JDK", "17", true);

            event.replyEmbeds(embed.build()).queue();
        }


    }
}
