package daniel.projects.discordbot.java.com.main.utils.commands;


import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.TimeFormat;

import static sun.awt.util.PerformanceLogger.getStartTime;

public class DevInfoCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent command) {

        String[] args = command.getMessage().getContentRaw().split(" ");
        if(args[0].equalsIgnoreCase("$"+"devcommand")) {

            command.getMessage().reply("Uptime: " + TimeFormat.RELATIVE.format(getStartTime())).queue();
        }

    }
}
