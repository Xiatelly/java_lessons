import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.DatatypeConverter;


public class StringListHexModifier implements StringListModifier{
    @Override
    public List<String> modify(List<String> src) {
        List<String> resultList = new ArrayList<>();
        for (String srcString : src){
            try {
                byte[] byteArray = DatatypeConverter.parseHexBinary(srcString);
                resultList.add(new String(byteArray));
            }
            catch (IllegalArgumentException e) {
                resultList.add(srcString);
            }
        }
        return resultList;
    }
}