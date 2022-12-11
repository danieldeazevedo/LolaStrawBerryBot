package daniel.projects.discordbot.java.com.main.utils.interactions.ModalInteraction;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.MessageContextInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.UserContextInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ModalInteractionEvent extends ListenerAdapter {

    @Override
    public void onUserContextInteraction(UserContextInteractionEvent event) {

        if (event.getName().equals("Avatar")) {

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Comando de avatar");
            embed.setDescription("avatar de : " + event.getTarget().getAsMention());
            embed.setImage(event.getTarget().getAvatarUrl());
            embed.setColor(Color.RED);
            event.replyEmbeds(embed.build()).queue();
        }


        if(event.getName().equals("Informações")){


            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("<:cofee:1041332164194730044> Informações do usuário " + event.getTarget().getName());
            embed.addField("<a:aBlobTreta:1038811777208688750> Nome do usuário:", event.getTarget().getName(), false);
            embed.addField("<:emoji_8:1038820718902775818> Id da conta:", event.getTarget().getId(), false);
            embed.addField("<a:hack:1038811937611448370> Criou a conta em:", String.valueOf(event.getTarget().getTimeCreated().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))), false);
            embed.addField("<:manager:1041331548420591627> É um bot: ", String.valueOf(event.getTarget().isBot()), false);
            embed.setThumbnail(event.getTarget().getAvatarUrl());
            embed.setColor(Color.red);

            event.replyEmbeds(embed.build()).queue();
        }

        if (event.getName().equals("kiss")){

            //image
            String[] images = {
                    "https://images-ext-1.discordapp.net/external/NrPVoh3z1-4xTph_LuuDtXpyoF0vhIZWHLej7SThTRM/https/loritta.website/assets/img/actions/kiss/female_x_female/gif_348.gif",
                    "https://images-ext-2.discordapp.net/external/GK48tR5GCb4qFiv_6BvcM-iddrdEZ0edoo8FLFnRy5g/https/loritta.website/assets/img/actions/kiss/both/gif_285.gif",
                    "https://images-ext-1.discordapp.net/external/Q7ksjEKeMUiSqUYLWlfGFPfdo_jjnltRrmUrHiPOEHE/https/loritta. website/assets/img/actions/kiss/female_x_male/gif_389.gif",
                    "https://images-ext-2.discordapp.net/external/Rsg3zP8cZgj0INAAwg-rHiEDJPu4mBFCU32DbtDuT5k/https/loritta.website/assets/img/actions/kiss/male_x_female/gif_296.gif",
                    "https://images-ext-2.discordapp.net/external/tP7MqFi2NOayhp44-ejY9-hxMUbYOQkUi4-b2wNmWCs/https/loritta.website/assets/img/actions/kiss/male_x_female/gif_290.gif?format=png",
                    "https://images-ext-1.discordapp.net/external/sHDT0l9qsf3jdqNbIMwIqCNTfr710QA9DGDw8Kcohvo/https/loritta.website/assets/img/actions/kiss/female_x_female/gif_341.gif",
                    "https://images-ext-1.discordapp.net/external/b790vBk2cSgfnovO2TytBJI6_aJmP9HS0YoQ4zMvyk4/https/loritta.website/assets/img/actions/kiss/female_x_male/gif_380.gif",
                    "https://images-ext-2.discordapp.net/external/i1rKa0jZdn6c9ZhbWUYTD2xo5ve6UapuaR2IaUx6esg/https/loritta.website/assets/img/actions/kiss/male_x_female/gif_288.gif"

            };

            var imgselect = images[new Random().nextInt(images.length)];



            //embed

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("beijihos");
            embed.setDescription(event.getUser().getAsMention() + "está beijando " + event.getTarget().getAsMention());
            embed.setImage(imgselect);
            embed.setColor(Color.red);


            event.replyEmbeds(embed.build()).queue();

        }

        if(event.getName().equals("hug")){


            String[] imgList = {

                    "https://images-ext-1.discordapp.net/external/zoz_eHNvudeLHvd7tlR5hgiXb-zu2jTBgHxf2HJzWmc/https/loritta.website/assets/img/actions/hug/female_x_female/gif_133.gif",
                    "https://images-ext-1.discordapp.net/external/Kz4-KrDw-pazGbTLzb4nsT88rfbXIdomPzWrRGWmOTk/https/loritta.website/assets/img/actions/hug/female_x_female/gif_134.gif?width=500&height=246",
                    "https://images-ext-2.discordapp.net/external/UIu3d9TirYzPVhK-pSEdeGYB4gYKS10klARf5vSV12I/https/loritta.website/assets/img/actions/hug/male_x_male/gif_128.gif",
                    "https://images-ext-2.discordapp.net/external/xSg5k011llAeqT52sxKgWM7zYAPSpDDYXFuDWdzEECw/https/loritta.website/assets/img/actions/hug/female_x_male/gif_158.gif",
                    "https://images-ext-1.discordapp.net/external/9Tywqa7HsbZdZZrkWRTeTDI0UlEfD3ZCiJna0WjnnDQ/https/loritta.website/assets/img/actions/hug/female_x_female/gif_146.gif",
                    "https://images-ext-2.discordapp.net/external/Q_4kYIBt278zFgHNxvtv4vDgWC12KyZIVYCwhv-aZPs/https/loritta.website/assets/img/actions/hug/female_x_male/gif_157.gif",
                    "https://images-ext-1.discordapp.net/external/XhwEqWBHrdRYrD2OKML-7PeWh_3McLbWqNIhtv6evww/https/loritta.website/assets/img/actions/hug/male_x_female/gif_122.gif",
                    "https://images-ext-1.discordapp.net/external/qZ5s_hsI8-hYaiowkIw1cpXBrWY1AfWUlUG7QM7hR1U/https/loritta.website/assets/img/actions/hug/generic/gif_171.gif",
                    "https://images-ext-1.discordapp.net/external/-4juZ8PH_wYvZHD5rEV_v1DtY18jpfqb4YncV1I1WbU/https/loritta.website/assets/img/actions/hug/male_x_female/gif_123.gif?width=500&height=247",
                    "https://images-ext-2.discordapp.net/external/cnEih3yJkUI_7xzeyLoX6XJivjkk40oRtNeWcXq82IE/https/loritta.website/assets/img/actions/hug/female_x_female/gif_136.gif",
                    "https://images-ext-1.discordapp.net/external/Y21bMEyTeuMVVoL2aoJN36UIAZDdYKiKEzt1mR-Bx2g/https/loritta.website/assets/img/actions/hug/female_x_female/gif_139.gif?width=500&height=246",
                    "https://images-ext-2.discordapp.net/external/JLH2JKl9aS20zUAk4q4JKY1iIwMpSFVI4cvjPTu8SOE/https/loritta.website/assets/img/actions/hug/male_x_female/gif_121.gif",
                    "https://images-ext-1.discordapp.net/external/pwAi5N2-s82_9n0Ifk7cLBNkQbCT8CyYVisB8dJbiFQ/https/i.some-random-api.ml/zSKMG85bIg.gif"

            };

            var imgSelect = imgList[new Random().nextInt(imgList.length)];


            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Abraços");
            embed.setDescription(event.getUser().getAsMention() + "está abraçando " + event.getTarget().getAsMention());
            embed.setImage(imgSelect);
            embed.setColor(Color.YELLOW);

            event.replyEmbeds(embed.build()).queue();

        }

        if(event.getTarget().equals("socar")){



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
            embed.setDescription(event.getUser().getAsMention() + " está brigando com " + event.getTarget().getAsMention());
            embed.setImage(imgselect);

            event.replyEmbeds(embed.build()).queue();
        }
        }


    @Override
    public void onMessageContextInteraction(MessageContextInteractionEvent event) {

    }

}
