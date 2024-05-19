import java.util.ArrayList;
import java.util.List;

public class StringListOddModifier implements StringListModifier {
    @Override
    public List<String> modify(List<String> src) {
        List<String> resultList = new ArrayList<>();
        for (String srcString : src) {
            if (srcString.length() % 2 != 0)
                resultList.add(srcString.concat("_"));
            else
                resultList.add(srcString);
        }
        return resultList;
    }
}
