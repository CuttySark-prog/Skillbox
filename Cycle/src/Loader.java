public class Loader
{
    public static void main (String[] args)

    {
        //do... while сначала делает, потом "думает"\проверяет условие
        // while сначала проверяет условие, затем делает или не делает

        Integer TicketNumber = 200000;
        do
            {
                System.out.println( TicketNumber );
                TicketNumber = TicketNumber+1;
            }
        while ( TicketNumber <= 210000);


    }


}
