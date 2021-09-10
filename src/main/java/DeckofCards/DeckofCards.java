package DeckofCards;
import java.util.Random;
public class DeckofCards extends Cards {

    public static void main(String[] args) {
        distribute();
        printcard();
    }
    public static void distribute()
    {
        for(int i = 0; i< Cards.PLAYERS; i++)
        {
            for (int j = 0; j< Cards.CARDS; j++)
            {
                String s1= Cards.getRandom(Cards.suit);
                String s2= Cards.getRandom(Cards.rank);
                Cards.Playercard[i][j]=s1.concat(s2);
            }
        }
    }

    public static void printcard()
    {
        for(int i = 0; i< Cards.PLAYERS; i++)
        {
            int c=i+1;
            System.out.println("\n\n Player "+c+" cards:");
            for (int j = 0; j< Cards.CARDS; j++)
            {
                System.out.print(Cards.Playercard[i][j]+" ");
            }
        }
    }


    }

