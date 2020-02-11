package exam;

public class Count
{
    public static void main(String[] args) {
        String str = "ones";
        int vowels=0,consonants=0;
        char inp[] = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(inp[i]=='a' || inp[i]=='e' || inp[i]=='i' || inp[i]=='o' || inp[i]=='u')
                vowels++;
        }
        System.out.print("Vowels: "+vowels);

        //System.out.println("");

        for(int i=0;i<str.length();i++){
            if(inp[i]!='a' && inp[i]!='e' && inp[i]!='i' && inp[i]!='o' && inp[i]!='u')
                consonants++;

        }
        System.out.print("Consonants: "+consonants);
    }


}
