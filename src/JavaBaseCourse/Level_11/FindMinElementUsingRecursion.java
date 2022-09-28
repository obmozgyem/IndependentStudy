package JavaBaseCourse.Level_11;


public class FindMinElementUsingRecursion {
    public static void main(String[] args) {
        int[] array = {-1, 2, 8, 11, 505};
        System.out.println(findMin(array));
        System.out.println(findMin2(array, 1, array[0]));
        System.out.println(findMin3(array, 0));
    }

    // Iterative
    private static int findMin(int[] array) {
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;


    }

    private static int findMin2(int[] array, int i, int min) {

        if (i == array.length) {
            return min;
        }  else
                if (array[i] < min) {
                    return findMin2(array, i + 1, array[i]);
                }

             else{
                return findMin2(array, i + 1, min);
            }


        }

    private static int findMin3(int[] array, int i ) {
        if(i == array.length-1) {
            return  array[array.length-1];
        } else  {
            var min = findMin3(array, i+1);
            if (array[i] < min) {
            return array[i];
            } else {
                return min;
            }
        }

    }

    }

