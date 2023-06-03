public class TripeMoreArray {
    public static void main(String[] args) {
        cubeArray();

        System.out.println();

        nDimensionalArray();
    }

    public static void cubeArray()
    {
        // Cube, three-dimensional array
        String[][][] cubeNames = new String[2][][];

        String[][][] cubeNames2 = new String[][][]{
                {
                        {"Viktoria", "Julia", "Yanina"},
                        {"Maksym", "Ivan", "Ruslan"},
                        {"Aleksey", "Pavel", "Olga", "Archil"}
                }
        };

        for (int outerDimension = 0; outerDimension < cubeNames2.length; outerDimension++)
        {
            for (int innerDimension = 0; innerDimension < cubeNames2[outerDimension].length; innerDimension++)
            {
                for (int finalDimension = 0; finalDimension < cubeNames2[outerDimension][innerDimension].length; finalDimension++)
                {
                    System.out.print(cubeNames2[outerDimension][innerDimension][finalDimension] + " - ");
                }
                System.out.println();
            }
        }
    }

    public static void nDimensionalArray()
    {
        // three-dimensional+ array
        int[][][][] fourDimensionalArray = new int[][][][]{
                {
                        {
                                {1, 2, 3},
                                {4, 5, 6}
                        }
                }
        };

        for (int dm1 = 0; dm1 < fourDimensionalArray.length; dm1++)
        {
            for (int dm2 = 0; dm2 < fourDimensionalArray[dm1].length; dm2++)
            {
                for (int dm3 = 0; dm3 < fourDimensionalArray[dm1][dm2].length; dm3++)
                {
                    for (int dm4 = 0; dm4 < fourDimensionalArray[dm1][dm2][dm3].length; dm4++)
                    {
                        System.out.println(fourDimensionalArray[dm1][dm2][dm3][dm4] + " ");
                    }
                }
            }
        }
    }
}