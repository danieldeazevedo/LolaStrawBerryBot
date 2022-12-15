package daniel.projects.discordbot.java.com.main.utils.interactions.ModalInteraction;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ModalInteractionEvent extends ListenerAdapter {

    @Override
    public void onModalInteraction(net.dv8tion.jda.api.events.interaction.ModalInteractionEvent event) {

        if (event.getModalId().equals("BugModMail")) {
            String subject = event.getValue("BugTheme").getAsString();
            String body = event.getValue("BugDesc").getAsString();


            event.reply("Obrigado por enviar e por ajudar a caçar bugs OwO").setEphemeral(true).queue();

            //SendBugToTeam

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Novo Bug reportado por: " + event.getUser().getName() + " id do usuário: " + event.getUser().getId());
            embed.addField("tema do bug: ", subject, true);
            embed.addField("Descrição do bug", body, true);

            JDA api = event.getJDA();
            TextChannel channel = api.getTextChannelById("1052364398322262096");

            channel.sendMessageEmbeds(embed.build()).queue();

        }
    }
}
