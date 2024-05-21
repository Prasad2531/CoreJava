package org.example.code.recursion.strings;

public class RecursionStrings {
    static void skip(String up,String down){
        if(down.isEmpty()){
            System.out.println(up);
            return;
        }
        char ch = down.charAt(0);
        if(ch=='a'){
            skip(up,down.substring(1));
        }else{
            skip(up+ch,down.substring(1));
        }
    }
    static String skip2(String down){
        if(down.isEmpty()){
            return "";
        }
        char ch = down.charAt(0);
        if(ch=='a'){
            return skip2(down.substring(1));//don't add the character just return
        }else{
            return ch + skip2(down.substring(1));//return with character added
        }
    }
    //skip word apple from string
    static String skipApple(String down){
        if(down.isEmpty()){
            return "";
        }
        if(down.startsWith("apple")){
            return skipApple(down.substring(5));//don't add the character just return
        }else{
            return down.charAt(0) + skipApple(down.substring(1));//return with character added
        }
    }
    static String skipAppNotApple(String down){
        if(down.isEmpty()){
            return "";
        }
        if(down.startsWith("app") && !down.startsWith("apple") ){
            return skipAppNotApple(down.substring(3));//don't add the character just return
        }else{
            return down.charAt(0) + skipAppNotApple(down.substring(1));//return with character added
        }
    }
    //Replace all pi with 3.14 in String
    static String replacePI(String str){
        if(str.isEmpty() || str.length()==1){
            return str;
        }
        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            return "3.14"+ replacePI(str.substring(2));
        }
        return str.charAt(0)+replacePI(str.substring(1));
    }
    public static void main(String[] args) {
        skip("","bacdaaefg");
        System.out.println(skip2("bacdaaefg"));
        System.out.println(skipApple("abcappledef"));
        System.out.println(skipAppNotApple("abcappappledeappf"));
        System.out.println(replacePI("pppiiiipip"));

    }
}
