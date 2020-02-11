package exam;


public class ReverseString
{
    public static String DemoReverseString(String strg)
    {
        if (strg.isEmpty())
            return strg;
        return DemoReverseString(strg.substring(1)) + strg.charAt(0);
    }

    public static void main(String[] args)
    {
        String str = "one_direction";
        ReverseString demo = new ReverseString();

        String revrstr = demo.DemoReverseString(str);

        System.out.println("Reverse of the string is: "+revrstr);
    }
}

