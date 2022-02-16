package alfredBot;

import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hola, encantado de verte. ¿Como estas?";
    }
    
    public String guestGreeting(String name) {
        return String.format( "Hola, %s. Encantado de conocerte", name );
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format( "Actualmente es " + date );
    }
    
    public String respondBeforeAlexis(String conversation) {
        if( conversation.indexOf("Alexis") > 0 ){
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        }

        else if( conversation.indexOf("Alfred") > 0 ){
            return "A su servicio. Como desee, naturalmente";
        }

        else{
            return "Bien. Y con eso, me retiraré";
        }
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    public String guestGreeting( String name, String date2 ) {
        Date date = new Date();
        if( date.hour > 19 ){
            return String.format( "Buenas noches, %s. Encantado de conocerte", name );
        }

        else if( date.hour > 13 ){
            return String.format( "Buenas tardes, %s. Encantado de conocerte", name );
        }

        else{
            return String.format( "Buenos dias, %s. Encantado de conocerte", name );
        }
    }
}