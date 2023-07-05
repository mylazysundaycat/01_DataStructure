import java.util.Scanner;

public class testest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] strArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int strArrLength = strArr.length;
        String pan = sc.nextLine();
        int sum = 0;

        for(int i=0; i<pan.length(); i++) {
            for(int j=0; j<strArrLength; j++){
                if(String.valueOf(pan.charAt(i)).equlasIgnoreCase(strArr[j])){
                    strArr[j]="";
                    sum++;
                }
            }
        }


        if(sum==strArrLength){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }



    }
}