package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Random;

public class MemeSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("meme")){

            var MemeList = new String[]{
                    "https://i.pinimg.com/736x/81/a1/14/81a1147fb0af970e2b11cff143d59d04.jpg",
                    "https://cdn.dicionariopopular.com/imagens/36bafc5d6430961d86b8b1a083ee771d.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSumsS7yvwVOpRAsKA20UU_M077-vacxMNSeA&usqp=CAU",
                    "https://i.pinimg.com/474x/b3/4a/a1/b34aa18d0a9214eedd4c13345fc4d51e.jpg",
                    "https://cdn.joke4fun.com/media/posts/00000/9l8jl7m8p2de.jpg",
                    "http://s2.glbimg.com/Jl2vCZlESREZmtp1RENV5cO-u2U=/smart/e.glbimg.com/og/ed/f/original/2016/12/16/14925604_196079117466646_3860275518828428943_n-400x400.png",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7RF0C1wJXN1yYRS8_4wbonKRP8rK01iKq_A&usqp=CAU",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQG_rCtrXCZDJi3nPPR5-PyBrIbuZvXHHSLA&usqp=CAU",
                    "https://cdn.dicionariopopular.com/imagens/cafbe07867c53ad097a4d2ef374c01e8.jpg",
                    "https://4.bp.blogspot.com/-elGirTA_948/XRqaXXY-cEI/AAAAAAAAbzw/DMmIcsPbgzcaGYvH45PQOK23JTn0_uJeQCLcBGAs/s640/MEMES%2BENGRA%25C3%2587ADOS%2B%2B%25285%2529.jpg",
                    "https://cdn.dicionariopopular.com/imagens/image-213.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSb2EFi2Vay931P0TxlX9hxv4Jae29XMeK07w&usqp=CAU",
                    "https://i.pinimg.com/474x/16/e3/b1/16e3b12ec721548ce16d85a309fb8051.jpg"


            };


            var ListSelect = MemeList[new Random().nextInt(MemeList.length)];


            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Memes aleatórios");
            embed.setImage(ListSelect);
            embed.setColor(Color.GREEN);

            command.replyEmbeds(embed.build()).queue();


        }

    }
}
