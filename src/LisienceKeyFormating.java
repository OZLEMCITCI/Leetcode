public class LisienceKeyFormating {


    public static void main(String[] args) {
        //System.out.println(licenseKeyFormatting("2-5g-3-J",2));//"2-5G-3J"
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",4));//"2-5g-3-J"
        //System.out.println(licenseKeyFormatting("r",1));
//
//        String s = "some text";
//        String k="";
//        s.substring(0,4);
//        System.out.println(s); // still printing "some text"
//        k= s.substring(0,4);
//        System.out.println(k); // prints "some"
    }
    public static String licenseKeyFormatting(String s, int k) {


        String newString=s.replace("-","").toUpperCase();

        if(newString.length()<k){
            return newString;
        }

        int remaining=newString.length()%k;

        String   firstString=newString.substring(0,remaining);
        StringBuilder  secondPart= new StringBuilder(newString.substring(remaining));

        StringBuilder secondPartReformating=new StringBuilder();

        if(secondPart.length()==k){
            secondPartReformating=secondPart.append("-");
        }else{
            for(int i=0;i<secondPart.length()-(k-1);i=i+k){
             secondPartReformating.append(secondPart.substring(i,i+k)+"-");
            }
        }


        return firstString.length()==0?
                String.valueOf(secondPartReformating).substring(0,secondPartReformating.length()-1)
                :firstString+"-"+ secondPartReformating.substring(0,secondPartReformating.length()-1);

    }

//    public static String licenseKeyFormatting2(String s, int k) {
//
//
//        String newString=s.replace("-","").toUpperCase();
//
//        if(newString.length()<k){
//            return newString;
//        }
//
//        int remaining=newString.length()%k;
//
//        String   firstString=newString.substring(0,remaining);
//
//        StringBuilder  secondPart= new StringBuilder(newString.substring(remaining));
//
//        StringBuilder secondPartReformating=new StringBuilder();
//
//        if(secondPart.length()==k){
//            secondPartReformating=secondPart.append("-");
//        }else{
//            for(int i=0;i<secondPart.length()-(k-1);i=i+k){
//                secondPartReformating.append(secondPart.substring(i,i+k)+"-");
//            }
//        }
//
//
//        return firstString.length()==0?
//                String.valueOf(secondPartReformating).substring(0,secondPartReformating.length()-1)
//                :firstString+"-"+ secondPartReformating.substring(0,secondPartReformating.length()-1);
//
//    }
}
