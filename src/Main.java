public class Main {
    public static void main(String[] args) {

        //Deklaration und Initialisierung
        //Passwörter
        final String password = "LilaBlume";
        final int code = 7721;

        //Kreditwürdigkeit
        final double cash = 150;

        //Registrierte Personennamen
        final String cardFirstName = "John";
        final String cardSecondName = "Doe";

        //Tatsächlichen Personeninformationen
        String personPasswordInput = "LilaBlume";
        String cardName = "John Doe";
        String guestName= "John Doe";
        String guestFirstName = "John";
        String guestSecondName = "Doe";

        //Passwort prüfen
        System.out.println("\n\nWie lautet das geheime Passwort? ");
        System.out.println("--> " + password + " <--");
        if (password.equals(personPasswordInput)) {
            System.out.println("Das Passwort ist korrekt, sie dürfen weiter zum geheimen Sicherheitskorridor.");
        }else {
            System.out.println("Das Passwort ist nicht korrekt, Bitte versuchen sie es noch einmal.");
        }

        //Code prüfen
        System.out.println("\n\nWie lautet der Code?");
        System.out.println("--> " + code + " <--");
        if (code == 7721){
            System.out.println("Der Code ist korrekt. Sie dürfen eintreten.");
        }else{
            System.out.println("Der Code ist nicht korrekt. Bitte versuchen sie es erneut.");
        }

        //Kreditwürdigkeit prüfen
        System.out.println("\n\nWie viel Cash haben sie bei sich?");
        System.out.println("--> " + cash + " <--");
        if (cash >= 100 && cash <= 200){
            System.out.println("Sie dürfen im Clubraum 1 feiern. Viel Spass!");
        }else if (cash >= 500 && cash < 1000){
            System.out.println("Sie dürfen im Clubraum 2 oder Clubraum 3 feiern. Viel Spass!");
        }else if (cash >1000){
            System.out.println("Sie dürfen im VIP Raum feiern. Viel Spass!");
        }else{
            System.out.println("Tut mir Leid, sie dürfen keines der Räume betreten! Vielleicht bei nächsten mal.");
        }

        //Überprüfen des Namens (equals() überprüft String auf inhaltliche Gleichheit equalsIgnoreCase() auch, ignoriert aber Groß- und Kleinschreibung)
        System.out.println("\n\nZeigen sie mir bitte ihre Kreditkarte.");
        System.out.println("Name auf der Kreditkarte: \n--> " + guestName + " <--");
        if (cardFirstName.equalsIgnoreCase(guestFirstName) && cardSecondName.equalsIgnoreCase(guestSecondName)){
            System.out.println("Herzlich Willkommen " + guestName + ". Ich wünsche ihnen viel Spass im VIP Bereich!");
        }else {
            System.out.println("Der Name stimmt nicht überein. Die Polizei wird gerufen. Bitte verlassen sie den Club!");
        }
//        if (cardName.equals(guestName) || cardName.equals(guestName)) {
//            System.out.println("Herzlich Willkommen " + guestName + ". Ich wünsche ihnen viel Spass im VIP Bereich!");
//        }


    }
}