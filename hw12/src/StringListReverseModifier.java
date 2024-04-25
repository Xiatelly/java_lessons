import java.util.ArrayList;
import java.util.List;

public class StringListReverseModifier implements StringListModifier{
    @Override
    public List<String> modify(List<String> src) {
        List<String> resultList = new ArrayList<>();
        for (String srcString : src){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(srcString);
            stringBuilder.reverse();
            resultList.add(stringBuilder.toString());
        }

        return resultList;
    }
}
