package objects;
import java.util.ArrayList;
import java.util.List;

public abstract class ContentStorage {
     private final List<Content> contentList = new ArrayList<Content>();
     List<Content> getContent(){
          return contentList;
     }
     void addItem(Content content){

     }
}
