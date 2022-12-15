package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class PesquisarSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("pesquisar")) {
            var SearchContext = command.getOption("pesquisa").getAsString();
            var Url = "https://www.google.com/search?q=" + SearchContext;
            var ImgUrl = "https://www.google.com/search?q=" + SearchContext + "&tbm=isch&ved=2ahUKEwiDnsSkqpftAhUPHLkGHbG5Cu0Q2-cCegQIABAA&oq=" + SearchContext + "&gs_lcp=CgNpbWcQAzoHCCMQ6gIQJzoECCMQJzoECAAQQzoFCAAQsQM6BwgAELEDEEM6AggAOgQIABAeOgYIABAIEB46BAgAEBhQ1nRY56kBYIyrAWgCcAB4AIABnAKIAf0bkgEFMC45LjiYAQCgAQGqAQtnd3Mtd2l6LWltZ7ABCsABAQ&sclient=img&ei=mfe6X8PtGo-45OUPsfOq6A4&bih=649&biw=1366&hl=pt-BR";

            command.reply("Aqui estão o resultados de sua pesquisa!").addActionRow(
                    Button.link(Url, "PesquisaUrl"),
                    Button.link(ImgUrl, "ImgUrl")
            ).queue();

        }
    }
}
