package daniel.projects.discordbot.java.com.main.utils.EventManager;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static daniel.projects.discordbot.java.com.main.BotLauncher.jda;

public class EventsListeners extends ListenerAdapter {

    public void EventListener(){

        //events
        jda.addEventListener(new ReadyEvent());
        jda.addEventListener(new ButtonClickEvent());
        jda.addEventListener(new BomDiaEvent());
        jda.addEventListener(new MentionEvent());
        jda.addEventListener(new GuildJoinEvent());
        jda.addEventListener(new GuildLeaveEvent());

    }
}
