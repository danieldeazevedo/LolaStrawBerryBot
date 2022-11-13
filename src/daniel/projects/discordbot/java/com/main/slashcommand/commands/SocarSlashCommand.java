package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class SocarSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("socar")){

            var command_option_user = command.getOption("user").getAsUser();


           var list = new String[]{
                    "https://thumbs.gfycat.com/AgileImpassionedImpala-size_restricted.gif",
                    "https://media.tenor.com/images/6a807a94ca6a81cc4beb4a59cbab2331/tenor.gif",
                    "https://thumbs.gfycat.com/ClassicFeistyElectriceel-max-1mb.gif",
                    "https://i.pinimg.com/originals/85/bf/f8/85bff85d7795ebc755317b63ce4caa59.gif",
                    "http://25.media.tumblr.com/083ceb40702f8bf5465e0ce7cd5a1dd8/tumblr_mwf628OAJI1t10givo2_500.gif",
                    "https://media.tenor.com/images/8d3a12b8bda82aa904eaa27520cfdbf9/tenor.gif",
                    "https://pa1.narvii.com/5712/670b7764a8d32157ccc7b5fb04ff2f607242ff76_hq.gif",
                   "https://media1.giphy.com/media/14duI6o1KQF8qs/giphy.gif",
                   "https://i.pinimg.com/originals/be/f6/e7/bef6e79e7771085eb20789fd7f50c27f.gif",
                   "https://tenor.com/view/pokemon-lucario-pikachu-fight-gif-16544309",
                   "https://tenor.com/view/mega-lucario-fighting-pokemon-anime-attack-gif-17179431",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_16.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_77.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_91.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_41.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_65.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_24.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_100.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_73.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_34.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_102.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_69.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_64.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_63.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_51.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_48.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_88.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_0.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_81.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_12.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_20.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_40.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_58.gif",
                   "https://loritta.website/assets/img/actions/attack/generic/gif_109.gif",
                   "https://images-ext-2.discordapp.net/external/x09iBpY4_QXndj9W7Xsf0yTxn-y2Ch3n5M2sEuRG5U0/https/loritta.website/assets/img/actions/attack/generic/gif_101.gif",
                   "https://images-ext-1.discordapp.net/external/BNzv1u91s0RA_l80wLK-09B35d5fHV2rH8mmmbe2uv4/https/loritta.website/assets/img/actions/attack/generic/gif_60.gif",
                   "https://images-ext-1.discordapp.net/external/1NEwFaThpPimv8E_zEtFR-Tsxl1lJiRpOQmrkVcp6U4/https/loritta.website/assets/img/actions/attack/generic/gif_107.gif",
                   "https://images-ext-2.discordapp.net/external/MXAP-C4m6n2F55dX5aSsjgw1XozREPV_UGPe6p4yhFI/https/loritta.website/assets/img/actions/attack/generic/gif_46.gif",
                   "https://images-ext-1.discordapp.net/external/wl6q3_NCri657asIKeXD1o0-QynkdMSnMA3vpHIxFZw/https/loritta.website/assets/img/actions/attack/generic/gif_59.gif",
                   "https://images-ext-2.discordapp.net/external/wB33ybBE3MTnAyVMNq07DOoojcZerThzMGGrgdNTr-w/https/loritta.website/assets/img/actions/attack/generic/gif_105.gif"
            };

           var imgselect = list[new Random().nextInt(list.length)];

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Brigas infantis");
            embed.setDescription(command.getUser().getAsMention() + " está brigando com " +command_option_user.getAsMention());
            embed.setImage(imgselect);

            command.replyEmbeds(embed.build()).queue();
        }
    }
}
