package exam;

    public class Pattern
    {
        public static void main(String[] args)
        {
            for (int i = 0; i < 5; i++)
            {

                // inner loop to handle number spaces

                for (int j = 5 - i; j > 1; j--)
                {

                    System.out.print(" ");
                }

                //  inner loop to handle number of columns

                for (int j = 0; j <= i; j++) {

                    System.out.print("* ");
                }


                System.out.println();
            }
        }
    }

