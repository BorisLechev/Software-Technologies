import java.util.Scanner;

public class p06CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstCharArray = scanner.nextLine();
        String secondCharArray = scanner.nextLine();

        int minLength = Math.min(firstCharArray.length(), secondCharArray.length());

        boolean isFirst = false;
        boolean isSecond = false;

       if (firstCharArray.length() == secondCharArray.length()){
           for (int i = 0; i < firstCharArray.length(); i++) {
               if (firstCharArray.charAt(i) < secondCharArray.charAt(i)){
                  isFirst=true;
                  break;
               }else{
                   isSecond=true;
                   break;
               }
           }
       }else if (firstCharArray.length() < secondCharArray.length()){
           for (int i = 0; i < minLength; i++) {
               if (firstCharArray.charAt(i) < secondCharArray.charAt(i)){
                   isFirst=true;
                   break;
               }else{
                   isSecond=true;
                   break;
               }
           }
       }
       if (isFirst){
           System.out.println(firstCharArray.replace(" ", ""));
           System.out.println(secondCharArray.replace(" ", ""));
       } else{
           System.out.println(secondCharArray.replace(" ", ""));
           System.out.println(firstCharArray.replace(" ", ""));
       }
    }
}
