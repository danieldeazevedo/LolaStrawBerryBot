package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class BallSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("8ball")){

            String[] respostas = {
                    "Sim",
                    "Não",
                    "Talvez",
                    "Eu não sei, tente de novo",
                    "Quem sabe?",
                    "Isso é um mistério",
                    "Não posso te contar",
                    "Meu informante disse que não",
                    "Provavelmente",
                    "Me pergunte mais tarde!",
                    "Claro que não!",
                    "Não conte comigo para isso",
                    "Dúvido muito",
                    "NUNCA",
                    "Não Quero Responder Agora Tou No Zipzop",
                    "Mais e Claro",
                    "Certeza Que Sim",
                    "COM CERTEZA",
                    "Modo Vidente Está Desligado(mentira e preguica mesmo ;-;)",
                    "E eu quem tem que saber?",
                    "Sei não, preguiça bateu",
                    "Sinto muito mas..... NÃO"

            };

            var resposta = respostas[new Random().nextInt(respostas.length)];

            command.reply(resposta).queue();
        }
    }
}
