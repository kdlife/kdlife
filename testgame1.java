import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class testgame1 {

    public static final int INPUT_CHARACTERS = 27; // общее колво символов

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите число L"); // длинна одного символа  , грубо говоря 4 символа в строке  это одна буква
        int L=4;;// L = in.nextInt();
        System.out.println("Вы ввели L" +"    "+ L);
     //   in.nextLine();
        System.out.println("ВВедите число H");
        int H= 5; //H = in.nextInt();
        System.out.println("Вы ввели H" +"    "+ H);// высота  одного символа
        in.nextLine(); // если нету считования строки, программа проскакивает счтитование переменной Т
        System.out.println("ВВедите Строку T");
        String T = "";
        T = in.nextLine();
        
        System.out.println("Вы ввели T" +"    "+ T);
        String ROWS = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### # # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## # # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       # # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  " ; 		 // ввели одну длинную строку, последовательно соежиненные /*       	
    /*
 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### 
# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # 
### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## 
# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       
# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  
    */
        
        
        //   for (int i = 0; i < H; i++) {
     //       ROWS += in.nextLine();                      
     //   }
        T = T.toUpperCase();// делаем все  символы заглавными

        StringBuilder res = new StringBuilder(); // создаем стритг бтлдер
        for (int row = 0; row < H; row++) {  // делаем проход для каждой строки
            for (char ch : T.toCharArray()) { // переводим строку в массив Char
                int position = ch < 65 || ch > 90 ? 26 : ch - 65; //  теранарный оператор если верно то 26, если нет то ch-65 // тут сравнивается кодовое знанчение символа Ch  все завглавные симводы находлятся в промежутке А-65 и Z - 90 . иначе выводится 27 символ (в нашем случае вопрос).
                int start = (L * INPUT_CHARACTERS) * row + position * L; // ноходим начальный символ в строке ROWS
                res.append(ROWS.substring(start, start + L));//выводим символы  от и до
            }
            res.append("\n");// при увеличани H  на 1 вставляем перехож на новую строку
        }

        System.out.println(res);
    }
}