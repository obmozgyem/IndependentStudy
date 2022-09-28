package JavaBaseCourse.Level_8;

/**
 * Реализовать программу ArrayElementStatistic, которая отображает статистику: уникальный элемент в массиве и процент его повторений в этом же массиве.
 * Порядок отображения элементов равен порядку их в исходном массиве (т.е. сортировать элементы НЕ НУЖНО)!
 * Результат работы программы для данного массива:
 * 5=8.333333333333334%
 * 2=50.0%
 * 3=25.0%
 * 4=16.666666666666668%
 */


public class ArrayElementStatistic {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        
        int[] unique = new int [array.length];
        int [] counts = new int[array.length];
        int count =0;
        for (int i = 0; i < array.length; i++) {
            var element = array[i];
            var exists = false;
            for (int j= 0; j < count; j++) {
                if(element== array[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                var number = 1;
                for (int j = i+1; j < array.length; j++) {
                    if (element== array[j]) {
                        number++;
                    }
                    
                }
                unique[count] = element;
                counts[count]= number;
                count++;

            }


            
        }
        for (int i = 0; i < count; i++) {
            System.out.println(unique[i] + "=" +((double) counts[i]*100/ array.length) + "%");

        }
        
    }
}
