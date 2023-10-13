public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int numberOfElements=mat.length * mat[0].length;

        int capacity=r*c;
         int[][] newMat=new int [r][c];

         int rowNumber=0;
         int colNumber=0;

        if(numberOfElements!=capacity){
            return mat;
        }else{
            for(int[] row:mat){
                for(int i:row){
                    newMat[rowNumber][colNumber]=i;
                    if(colNumber<c){
                        colNumber++;
                        continue;
                    }
                    colNumber=0;
                    rowNumber++;
                }

            }
        }

        return newMat;

    }
}
