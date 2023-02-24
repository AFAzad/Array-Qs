public class Permutation{
    public static void printPerm(String str, String prem, int inx){
        if(str.length() ==0){
            System.out.println(prem);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPerm(newStr, prem+currChar, inx+1);

        }
    }
    public static void main(String[] args){
        String str = "ABC";
        printPerm(str,"", 0);
    }
}