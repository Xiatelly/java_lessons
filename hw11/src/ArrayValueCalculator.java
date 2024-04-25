import com.sun.xml.internal.fastinfoset.util.StringArray;

public class ArrayValueCalculator {
    public static final String SIZE_EXCEPTION_TEXT = "Size of Array should be 4x4";

    public int doCalc(String[][] stringArray) throws ArraySizeException, ArrayDataException {
        if (stringArray.length != 4)
            throw new ArraySizeException(SIZE_EXCEPTION_TEXT);

        for (String[] row : stringArray){
            if(row.length != 4)
                throw new ArraySizeException(SIZE_EXCEPTION_TEXT);
        }
        int result = 0;
        for (int r = 0; r < stringArray.length; r++){
            for (int c = 0; c < stringArray[r].length; c++){
                String cell = stringArray[r][c];
                try {
                    int value = Integer.parseInt(cell);
                    result += value;
                }
                catch (NumberFormatException e){
                    throw new ArrayDataException(
                            String.format("Matrix cell[%d][%d] = '%s' can't be parse to number", r, c, cell));
                }
            }
        }
        return result;
    }
}
