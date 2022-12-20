package daniel.projects.discordbot.java.com.main.utils.DiscordManager;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.channel.ChannelCreateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Channels extends ListenerAdapter {

    @Override
    public void onChannelCreate(ChannelCreateEvent event) {
        var channeld = event;


    }


    public TextChannel Channel(TextChannel channel) {

     Guilds guilds = new Guilds();



        return channel;
    }
}
