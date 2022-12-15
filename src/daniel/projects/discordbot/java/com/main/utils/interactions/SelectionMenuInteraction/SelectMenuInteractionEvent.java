package daniel.projects.discordbot.java.com.main.utils.interactions.SelectionMenuInteraction;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class SelectMenuInteractionEvent extends ListenerAdapter {


    @Override
    public void onSelectMenuInteraction(net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent event) {


        if(event.getComponentId().equals("Comandos")){


            if(event.getValues().get(0).equals("info")){

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Comandos de informação: ");
                embed.setDescription("Avatar, BotInfo, Ping, Help, Data, Userinfo, Serverinfo, ServerIcon,Userinfo, channelinfo");
                embed.setColor(Color.blue);

                event.replyEmbeds(embed.build()).setEphemeral(true).queue();
            }

            if(event.getValues().get(0).equals("mod")){
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Comandos de moderação:");
                embed.setDescription("Ban, kick, clear, warn");
                embed.setColor(Color.CYAN);

                event.replyEmbeds(embed.build()).setEphemeral(true).queue();

            }
            if(event.getValues().get(0).equals("fun")){


                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Comandos de diversão:");
                embed.setDescription("Piada, textimage, laranjo, kiss, hug, stonks e say, socar,mememonica");
                embed.setColor(Color.green);

                event.replyEmbeds(embed.build()).setEphemeral(true).queue();
            }


        }
    }
}
