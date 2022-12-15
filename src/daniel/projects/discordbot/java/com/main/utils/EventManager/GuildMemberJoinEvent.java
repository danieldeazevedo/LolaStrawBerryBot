package daniel.projects.discordbot.java.com.main.utils.EventManager;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static daniel.projects.discordbot.java.com.main.BotLauncher.jda;

public class GuildMemberJoinEvent extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent event) {

        if(event.getGuild().getId().equals("1037153377903181924")){

         JDA api = event.getJDA();
            TextChannel channel = api.getTextChannelById("1038620692410814527");

            channel.sendMessage("Novo membro: "+ event.getMember().getNickname() + " acabou de entrar!").queue();

        }

    }
}
