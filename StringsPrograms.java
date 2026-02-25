// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Java Program to Reverse a String
class Main {
    public static void main(String[] args) {
        
        String str = "madAm";
        System.out.println("Try programiz.pro");
        reverseString(str);
		
		char ch = 'a';
        char chreplace = 'b';
        printChatater("Pankej", ch, chreplace);
    }
    
    public static void reverseString(String str){
        char[] ch = str.toCharArray();
        //if (str.length()%2==0){
            int j = str.length();
            for(int i=0; i<str.length()/2; i++){
                char temp = ch[i];
                ch[i] = ch[j-1];
                ch[j-1] = temp;
                //str.rechplace(str.charAt(i), str.charAt(j-1));
                j--;
                 System.out.println("---"+ i+"----"+j );
            }
        //}
         System.out.println(new String(ch));
    }
	
	
	 static void printChatater(String str, char ch, char chreplace){
       // char [] charry = str.toCharArray();
       //for (char c : charry){
        //     if(c == ch)
        //      System.out.println("pringthing char: "+ c);
        // }
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i));
            if(str.charAt(i)==ch){
                System.out.println("replcing char in String" +str +": "+ str.replace(str.charAt(i), chreplace));
            }
        }
	 }
}