public class Database
{
    private static String database = "About 132,000,000 results (0.72 seconds) Search Results I'll be back - Wikipedia https://en.wikipedia.org/wiki/I%27ll_be_back I'll be back is a catchphrase associated with Arnold Schwarzenegger, which he first used in his role as the title character from the 1984 science fiction film The ... ‎History · ‎See also · ‎References · ‎External links Terminator-I'll be back - YouTube Video for I'll be back▶ 0:20 https:/www.youtube.com/watch?v=WgPePk3kGZkOct 10, // 2009 - Uploaded by Blaz3d&Daz3d i'll be back,she'll be back,i'm back NEW VERSION HERE: https://www.youtube.com/watch?v=yubso_i0ZCI. People also ask Who said I ll be back? Who said hasta la vista baby? When did the Terminator movies come out? What movie says get to the chopper? Feedback I'll be back - Arnold Schwarzenegger - The Terminator - YouTube Video for I'll be back▶ 0:04 https://www.youtube.com/watch?v=bgLfOrVJJMg Aug 12, 2010 - Uploaded by moviequotesoneliners I'll be back -   // // Arnold Schwarz enegger - The Terminator. I'll be back | Terminator Wiki | Fandom powered by Wikia terminator.wikia.com/wiki/I%27ll_be_back I'll be back. is a famous line from the Terminator franchise. It is said in some form in all... ";
    public static String[] arrayDatabase;

    public static String getDatabase()
    {
        return database;
    }

    public static void print()
    {
        System.out.println(getDatabase());
    }

    public static void printArrayDatabase()
    {
        for (String i: arrayDatabase)
        {
            System.out.println(i);
        }
        System.out.println(arrayDatabase.length);
    }

    public static String[] makeArray()
    {
        arrayDatabase = database.split(" ");
        return arrayDatabase;
    }

    public static String[] sendDatabase()
    {
        return arrayDatabase;
    }

    public static int getLength()
    {
        return arrayDatabase.length;
    }
}
