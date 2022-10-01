import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.interaction.SlashCommandInteraction;




public class DiscordMain {
    public static void main(String[] args) {
        String token = "token";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();


        //slashCommand
        api.addSlashCommandCreateListener(event -> {
                    SlashCommandInteraction slashCommandInteraction = event.getSlashCommandInteraction();
                    if (slashCommandInteraction.getCommandName().equals("ping")) {
                        slashCommandInteraction.createImmediateResponder()
                                .setContent("Pong!!!")
                                .respond();
                    }
                });

             System.out.println("The bot is ready to go!!");
             System.out.println("This is for java beginners");

    }

}
