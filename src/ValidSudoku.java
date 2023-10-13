import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class ValidSudoku {

    public static void main(String[] args) {
        char [][] board=
                {{'5','3','.','.','7','.','.','.','.'}, {'6','5','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','.'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','1','.','.','8','.','.','7','9'},
                        };

        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board) {

        Set<Character> hasSet=new HashSet<>();

        for(char [] subArray :board){

            for(char ch: subArray){

                if(ch=='.'){
                    continue;
                }
                if(hasSet.contains(ch)){
                    return false;
                }else{
                    hasSet.add(ch);
                }

            }
            hasSet.clear();
        }

        hasSet.clear();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }

                if(hasSet.contains(board[j][i])){
                    return false;
                }else{
                    hasSet.add(board[j][i]);
                }
            }
            hasSet.clear();

        }

//        int[] numbers = new int[9];
//        int loopNo = 1;
//
//        int iBegin = 0;
//        int iEnd = 3;
//        int jBegin = 0;
//        int jEnd = 3;
//        for (int k = 0; k < 9; k++) {
//            for (int i = iBegin; i < iEnd; i++) {
//                for (int j = jBegin; j < jEnd; j++) {
//                    if (board[i][j] != '.') {
//                        int num = Character.getNumericValue(board[i][j]) - 1;
//                        if (numbers[num] == loopNo)
//                            return false;
//                        else
//                            numbers[num] = loopNo;
//                    }
//                }
//            }
//            loopNo++;
//            iBegin = ((k + 1) / 3) * 3;
//            iEnd = iBegin + 3;
//            jBegin = ((k + 1) % 3) * 3;
//            jEnd = jBegin + 3;
//        }

        hasSet.clear();
        for(int k=0;k<7;k++){
            for(int i=k; i<k+3; i++) {
                for(int j=k; j<k+3; j++) {
                    if(board[j][i]=='.'){
                        continue;
                    }
                    if(hasSet.contains(board[j][i])){
                        return false;
                    }else{
                        hasSet.add(board[j][i]);
                    }
                }
                hasSet.clear();
            }

        }

        hasSet.clear();

        for(int k=0;k<7;k++){
            for(int i=k; i<k+3; i++) {
                for(int j=k; j<k+3; j++) {
                    if(board[i][j]=='.'){
                        continue;
                    }
                    if(hasSet.contains(board[i][j])){
                        return false;
                    }else{
                        hasSet.add(board[i][j]);
                    }
                }
                hasSet.clear();
            }

        }

        return true;

    }

}
