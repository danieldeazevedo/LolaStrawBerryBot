package daniel.projects.discordbot.java.com.main.utils.commands.manager;

import daniel.projects.discordbot.java.com.main.utils.commands.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static daniel.projects.discordbot.java.com.main.BotLauncher.jda;

//sendo feito
public class CommandManager extends ListenerAdapter {

    public void CommandListener(){

        var LolaReply = MessageReceivedEvent.class;


        //Commands

        jda.addEventListener(new PingCommand());
        jda.addEventListener(new AvatarCommand());
        jda.addEventListener(new DataCommand());
        jda.addEventListener(new BotinfoCommand());
        jda.addEventListener(new HelpCommand());
        jda.addEventListener(new UserinfoCommand());
        jda.addEventListener(new ServerinfoCommand());
        jda.addEventListener(new PiadaCommand());
        jda.addEventListener(new ServericonCommand());
        jda.addEventListener(new MemeCommand());
        jda.addEventListener(new ClearCommand());
        jda.addEventListener(new DevInfoCommand());
        jda.addEventListener(new DadosCommand());
        jda.addEventListener(new ShutDownCommand());
    }

}
