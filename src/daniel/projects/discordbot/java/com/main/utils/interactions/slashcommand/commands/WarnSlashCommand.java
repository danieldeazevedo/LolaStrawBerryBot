package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class WarnSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("warn")) {

            var user_warn = command.getOption("user").getAsUser();
            var warn_reason = command.getOption("reason").getAsString();
            var bot_perm = command.getGuild().getSelfMember();

            if (user_warn.equals(command.getUser())) {

                command.reply("Você não pode se auto-punir ^-^").queue();
            } else {

                if (!bot_perm.hasPermission(Permission.KICK_MEMBERS)) {

                    command.reply("Eu não tenho a permisão expulsar usuários para executar esse comando").queue();
                } else {

                    if (!command.getMember().hasPermission(Permission.KICK_MEMBERS)) {


                        command.reply("Você não tem a permisão de `expulsar membros` para executar este comando!").queue();


                    } else {

                        command.reply("o usuário " + user_warn.getAsMention() + " foi avisado por " + command.getUser().getAsMention() + " pelo motivo: `" + warn_reason + "`").queue();

                        JDA api = command.getJDA();
                        User user = ((JDA) api).getUserById(user_warn.getId()); // Acquire a reference to the User instance through the id
                        user.openPrivateChannel().queue((channel) ->
                        {
                            channel.sendMessage("voce foi avisado pelo motivo: `" + warn_reason + "` pelo usuário: " + command.getUser().getAsTag()).queue();

                        });
                    }
                }

            }
        }
    }
}
