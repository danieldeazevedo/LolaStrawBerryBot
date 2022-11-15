package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class KickSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("kick")){
            var user_kick = command.getOption("user").getAsUser();
            var kick_reason = command.getOption("reason").getAsString();

            if(!command.getMember().hasPermission(Permission.KICK_MEMBERS)){

                command.reply("<:tuqui:1038820935387598988>|Você não tem permisão `KICK_MEMBERS` para executar este comando").queue();
            }

            command.getGuild().kick(user_kick, kick_reason).complete();
            command.reply("O usuário: `" + user_kick.getName()+ "` foi expulso por: " + command.getUser().getAsMention()).queue();

        }

    }
}
