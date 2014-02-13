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
        String toReturn="";
        textReceived=textReceived.trim();
        String[] toSearch=textReceived.split("\\s+");
        for(int i=0;i<toSearch.length;i++){
            if((toSearch[i].compareTo(" ")!=0)&&(toSearch[i]!=null)&&(toSearch[i].compareTo("")!=0)){
                if(wordExists(toSearch[i]))
                    toReturn+=("\n"+toSearch[i]+" exists in database");
                else
                    toReturn+=("\n"+toSearch[i]+" does not exist in database");
            }
        }
        return toReturn;
    }

    public String enter(String textReceived){
        String toReturn="";
        textReceived=textReceived.trim();
        String[] stringsToAdd=textReceived.split("\\s+");
        for(int i=0;i<stringsToAdd.length;i++) {
            System.out.println("{"+stringsToAdd[i]+"}");
            if((stringsToAdd[i].compareTo(" ")!=0)&&(stringsToAdd[i].compareTo("")!=0)&&(stringsToAdd[i]!=null)){
                if(!wordExists(stringsToAdd[i])){
                    list.add(stringsToAdd[i]);
                    toReturn+=("\n Added "+ stringsToAdd[i]);
                    }
                else{
                    toReturn+=("\n "+stringsToAdd[i]+" already exists");
                    }
            }
        }

        return toReturn;
    }
    public boolean wordExists(String wordToTest){
        boolean exists=false;
        for(int i=0;i<list.size();i++){
            if(wordToTest.equalsIgnoreCase(list.get(i))==true)
                 exists=true;
        }
        return exists;
    }
}