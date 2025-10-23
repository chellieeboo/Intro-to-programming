public class activity{
    public static void main(String[] args) {
        char ch = 'a';
        while (ch <= 'e'){
            System.out.print(ch);
           
            if (ch <= 'e') {
                  System.out.print(" ");
            }
            ch++;
           
        }
          System.out.println();
          

          int num = 1;
          char letter = 'A';
          while (num <= 5) {
              System.out.println(num + "" + letter);
              num++;
              letter++;                                                        
          }
}
}