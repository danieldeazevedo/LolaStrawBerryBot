package daniel.projects.discordbot.java.com.main.utils.EventManager;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.awt.*;
import java.util.Random;

public class ButtonClickEvent extends ListenerAdapter {
    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {

        if (event.getUser().equals(event.getUser())) {

            if (event.getComponentId().equals("HelpInformationCmd")) {

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Comandos de informação: ");
                embed.setDescription("Avatar, BotInfo, Ping, Help, Data, Userinfo, Serverinfo, ServerIcon,Userinfo, channelinfo");
                embed.setColor(Color.blue);

                event.replyEmbeds(embed.build()).queue();
            }

            if (event.getComponentId().equals("HelpFunCmd")) {

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Comandos de diversão:");
                embed.setDescription("Piada, textimage, laranjo, kiss, hug, stonks e say, socar,mememonica");
                embed.setColor(Color.green);

                event.replyEmbeds(embed.build()).setEphemeral(true).queue();

            }

            if (event.getComponentId().equals("HelpAdmCmd")) {
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Comandos de moderação:");
                embed.setDescription("Ban, kick, clear, warn");
                embed.setColor(Color.CYAN);

                event.replyEmbeds(embed.build()).queue();
            }

            if (event.getComponentId().equals("HelpCommand")) {


                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Central de ajuda da Lola");
                embed.setDescription("Precisa de suporte? Entre no meu servidor de suporte: https://discord.gg/gHVaDtuEBY");
                embed.addField("Veja meu comandos clicando nos butões abaixo! use os comandos em /", "Caso tenha algum bug ou erro denuncie no meu servidor de suporte https://discord.gg/gHVaDtuEBY", true);

                event.replyEmbeds(embed.build()).addActionRow(
                        net.dv8tion.jda.api.interactions.components.buttons.Button.primary("HelpInformationCmd", "Informações")
                ).addActionRow(Button.primary("HelpFunCmd", "Diverções")).setEphemeral(true).queue();


            }

            if (event.getComponentId().equals("AdvcInfo")) {


                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Informações avançadas");
                embed.addField("Versão da lola:", "7.4.0-alpha", true);
                embed.addField("Versão do JDA: ", "5.0.0.alpha21", true);
                embed.addField("Versão do java: ", "8", true);
                embed.addField("Versão do JDK", "17", true);

                event.replyEmbeds(embed.build()).queue();
            }

            if (event.getComponentId().equals("kissbutton")) {

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
                embed.setDescription(event.getUser().getAsMention() + "está retribuindo os beijos");
                embed.setImage(imgselect);
                embed.setColor(Color.red);

            }

            if (event.getComponentId().equals("hugbutton")) {

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
                embed.setDescription(event.getUser().getAsMention() + "está retribuindo o abraço");
                embed.setImage(imgSelect);
                embed.setColor(Color.YELLOW);

                event.replyEmbeds(embed.build()).addActionRow(
                        Button.primary("hugbutton", "retribuir")
                ).queue();

            }

        }else {
            event.reply("voce não é " + event.getUser().getAsMention() + " para poder clicar aqui").queue();
        }
    }
}
