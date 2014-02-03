package cavalett.taylor.Search_App;
import java.util.ArrayList;
/**
 * Created by taylorcavaletto on 2/2/14.
 */
public class Database_Functions {
    ArrayList<String> list;
    public Database_Functions(){
        list=new ArrayList<String>();
    }
    public String search(String textReceived){
        String toReturn=null;
        String[] toSearch=textReceived.split("\\s+");
        for(int i=0;i<toSearch.length;i++){
            if(!wordExists(toSearch[i]))
                toReturn+=("\n"+toSearch[i]+" exists in database");
            else
                toReturn+=("\n"+toSearch[i]+" does not exist in database");
        }
        return toReturn;
    }

    public String enter(String textReceived){
        String toReturn=null;
        String[] stringsToAdd=textReceived.split("\\s+");
        for(int i=0;i<stringsToAdd.length;i++) {
            if(!wordExists(stringsToAdd[i])){
                list.add(stringsToAdd[i]);
                toReturn+=("\n Added "+ stringsToAdd[i]);
                }
            else{
                toReturn+=("\n"+stringsToAdd[i]+" already exists");
            }
        }

        return toReturn;
    }
    public boolean wordExists(String wordToTest){
        boolean exists=false;
        for(int i=0;i<list.size();i++){
            if(wordToTest.compareTo(list.get(i))==0)
                 exists=true;
        }
        return exists;
    }
}
