public class AlfredTest {

    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes(); // Make an instance of AlfredQuotes to access all of it's methods.

        String testGreeting = alfredBot.basicGreeting();

        String testGuestGreeting = alfredBot.guestGreeting("John Smith", "morning");

        String testDateAnnounce = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis("Hello, I am not Alexis, I am Alfred.");

        String alfredTest = alfredBot.respondBeforeAlexis("Hello, hoe.");

        String notRelevantTest = alfredBot.respondBeforeAlexis("I am confused!");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnounce);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}