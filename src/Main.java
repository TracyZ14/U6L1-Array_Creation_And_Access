public class Main
{
    public static void main(String[] args)
    {
        int[] heights = new int[3];
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;

        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String swapName1 = alphabeticalNames[1];
        String swapName2 = alphabeticalNames[2];
        alphabeticalNames[1] = swapName2;
        alphabeticalNames[2] = swapName1;
        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);

        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {(array1[0] + array2[0]), (array1[1] * array2[1])};
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        String[] introduction = {"hello", "my", "name", "is", "Tom"};
        int foundIdx = findInMiddle(introduction, "m");
        System.out.println(foundIdx);

        int[] list = {3, 7, 2, 9, 8};
        int result = mystery(list);
        System.out.println(result);

        double[] grades = {50, 70, 89};
        grades[1] += 4.5;
        /*
        grades[3] = 95;
        */

        double[] arr = {0.4, 1.7, 1.9, 3.7};
        System.out.println(mystery(arr, 0));
        System.out.println(mystery(arr, 1));
        System.out.println(mystery(arr, 2));
        System.out.println(mystery(arr, 3));
        /*
        System.out.println(mystery(arr, 4));
        */
    }

    public static int findInMiddle(String[] arr, String find)
    {
        return arr[arr.length / 2].indexOf(find);
    }

    public static int mystery(int[] arr)
    {
        return arr[1] + (arr[3] / 2);
    }

    public static boolean mystery(double[] list, int num)
    {
        return list[num] - num < 0;
    }
}