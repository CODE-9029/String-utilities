import java.util.ArrayList;
public class StringUtilities
{
    private int x;
    private ArrayList<Integer> marklist;
    public StringUtilities()
    {
        // 初始化实例变量
        x = 0;
        marklist = new ArrayList<Integer>();
    }

    public void judgeInputString(String string){
        if (string == "quit" || string =="Quit" || string =="QUIT"){
            return;
        }else if(string.length() < 7){
            System.out.println("Too short");
        }else if(string.length() > 7){
            System.out.println("Too long");
        }else{
            System.out.println(string.substring(2,5));
        }
    }
    
    public boolean isPalindrome(String string){
    int count = 0;
    for(int i = 0;i < string.length();i++){
        if(string.charAt(i)==string.charAt(string.length()-i-1)){
        count++;
        }
    }
    return count == string.length();
    }
    
    public int getPositionOfSubstring(String toBeSearched, String toBeFound){
    int count = 0;
    int k = -1;
    for(int i = 0;i < toBeSearched.length();i++){
        if (toBeSearched.charAt(i)==toBeFound.charAt(0)){
            for (int j = 0;j < toBeFound.length();j++){
                if (toBeSearched.charAt(i+j)==toBeFound.charAt(j)){
                    count++;
                    if(count == toBeFound.length()){
                        k = i;
                    }
                }
            }
        }
    }
    return k;
    }
    
    public void printAllPositionsOfSubstring(String toBeSearched, String toBeFound){
    int count = 0;
    for(int i = 0;i < toBeSearched.length();i++){
        if (toBeSearched.charAt(i)==toBeFound.charAt(0)){
            for (int j = 0;j < toBeFound.length();j++){
                if (toBeSearched.charAt(i+j)==toBeFound.charAt(j)){
                    count++;
                    if(count == toBeFound.length()){
                        System.out.println(i);
                        count=0;
                    }
                }
            }
        }
    }
    }
    
    public int[] getAllPositionsOfSubstring(String toBeSearched, String toBeFound){
    int[] store;
    int count = 0;
    int x = 0;
    for(int i = 0;i < toBeSearched.length();i++){
        if (toBeSearched.charAt(i)==toBeFound.charAt(0)){
            for (int j = 0;j < toBeFound.length();j++){
                if (toBeSearched.charAt(i+j)==toBeFound.charAt(j)){
                    count++;
                    if(count == toBeFound.length()){
                        marklist.add(i);
                        count=0;
                    }
                }
            }
        }
    }
    store = new int[marklist.size()];
    while(marklist.size() > 0){
        store[x] = marklist.remove(0);
        x++;
    }
    return store;
    }
}
