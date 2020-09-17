//Kate Walker
import java.util.*;
public class SortColumns {
    public List<Integer> minDeletionSize(String [] S){
        List<Integer> colList = new ArrayList<Integer>();//making an Arraylist to add the unsorted column values to

        for(int j=0; j< S.length-1; j++){//loop to go through each string in the list
            if(S[j].length() < S[j+1].length()){//if the string and the string next to it have different lengths
                colList.add(-1);//add -1 to the list of columns to be deleted since the strings have to be the same length
            }
        }

        for(int i=0;i<S[0].length();i++){//loop to go through characters in each of columns in the array of strings

            for(int c=0;c<S.length-1;c++){//loop to go through the columns of the array of strings

                if(S[c].length()==S[c+1].length()){//if the length of the string in the column is equal to the length of the string in the next column
                    if(S[c].charAt(i)>S[c+1].charAt(i)){//check if the character value is greater than the value in the next column
                            colList.add(i);//if it is add it to the list of columns to be deleted
                            break;//break the loop
                        }
                    }
                }

        }

        return colList;
    }

    public static void main(String[] args) {
        SortColumns sc = new SortColumns();//making an object of the SortColumns class

        String [] a = {"cba","daf","ghi"};//defining the first array of strings
        System.out.println("List 1: " + Arrays.toString(a));//printing the first array
        System.out.println("Columns to be deleted: " + sc.minDeletionSize(a));//printing the first set of columns to be deleted

        String[] b = {"a","b"};//defining the second array of strings
        System.out.println("List 2: " + Arrays.toString(b));//printing the second array
        System.out.println("Columns to be deleted: " + sc.minDeletionSize(b));//printing the second set of columns to be deleted

        String[] c= {"zyx","wvu","tsr"};//defining the third array of strings
        System.out.println("List 3: " + Arrays.toString(c));//printing the third array
        System.out.println("Columns to be deleted: " + sc.minDeletionSize(c));//printing the third set of columns to be deleted

        String[] d = {"Captain","Marvel","saved", "the", "Avengers"};//defining the forth array of strings
        System.out.println("List 1: " + Arrays.toString(d));//printing the forth array
        System.out.println("Columns to be deleted: " + sc.minDeletionSize(d));//printing the forth set of columns to be deleted
    }

}
