// Count vowels
// Reverse string
// Check palindrome
// Convert uppercase
// Count words
// Replace spaces with _
// Handle null string exception

public class StringAnalyzerSystem {
    String str;

    StringAnalyzerSystem(String str) {
        this.str = str;
    }

    void countVowels(){
        try {
            if(str == null){
                throw new NullPointerException("String is null");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return;
        }
        int count=0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println("Number of vowels =" +count); 
    }

    void reverseString(){
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string = " + reversed);
    }

    void checkPalindrome(){
        String reversed= "";
        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    void convertUppercase(){
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase string = " + uppercase);
    }

    void countWords(){
        String[] words = str.split(" ");
        System.out.println("Number of words = " + words.length);
    }

    void replaceSpaces(){
        String replaced = str.replace(" ", "_");
        System.out.println("String with spaces replaced = " + replaced);
    }

    public static void main(String[] args) {
        StringAnalyzerSystem analyzer = new StringAnalyzerSystem("hello world");
        analyzer.countVowels();
        analyzer.reverseString();
        analyzer.checkPalindrome();
        analyzer.convertUppercase();
        analyzer.countWords();
        analyzer.replaceSpaces();
    }
}
