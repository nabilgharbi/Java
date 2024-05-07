import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, I am Alfred, your loyal servant and personal assistant.";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s! Hope you are well", dayPeriod, name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Today is " + date.toString();
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Hello, I am not Alexis, I am Alfred.";
        } else {
            return "Hello, I am Alexis, your loyal servant and personal assistant.";
        }
    }
}