package daniel.projects.discordbot.java.com.main.EventManager;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.Channel;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildLeaveEvent extends ListenerAdapter {

    @Override
    public void onGuildLeave(net.dv8tion.jda.api.events.guild.GuildLeaveEvent event) {


        JDA api = event.getJDA();
        User user = ((JDA) api).getUserById("935949770659340288"); // Acquire a reference to the User instance through the id
        user.openPrivateChannel().queue((channel) ->
        {
            // Send a private message to the user
            channel.sendMessageFormat("sai de um servidor **%s**", event.getGuild().getName() + " id do servidor: " + event.getGuild().getId() + " Total de membros: " + event.getGuild().getMembers().size() + " Dono do servidor: " + event.getGuild().getOwner().getNickname() + " id: " + event.getGuild().getOwnerId()).queue();
        });
    }

}