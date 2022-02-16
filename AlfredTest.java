package alfredBot;

public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis( "¡Alexis! Toca algunos beats low-fi." );
        String alfredTest = alfredBot.respondBeforeAlexis( "No puedo encontrar mi yo-yo. Quizás Alfred sepa dónde está" );
        String notRelevantTest = alfredBot.respondBeforeAlexis( "Quizás de eso se trata Batman. No de ganar. Si no que de fallar..." );
        
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}