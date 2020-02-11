package exam;

public class Count
{
    public static void main(String[] args) {
        String str = "ones";
        int vowels=0,consonants=0;
        char inp[] = str.toCharArray();

        System.out.print("Vowels: ");
        for(int i=0;i<str.length();i++){
            if(inp[i]=='a' || inp[i]=='e' || inp[i]=='i' || inp[i]=='o' || inp[i]=='u')
                vowels++;
        }

        //System.out.println("");

        System.out.print("Consonants: ");
        for(int i=0;i<str.length();i++){
            if(inp[i]!='a' && inp[i]!='e' && inp[i]!='i' && inp[i]!='o' && inp[i]!='u')
                consonants++;
            System.out.println("Consonants="+consonants+"\nVowels="+vowels);
        }
    }


}
