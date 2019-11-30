import java.util.ArrayList;
import java.util.List;

public class Parser {

    private String[]    argumentsReceived;
    private List<String> argumentsToReturn = new ArrayList<>();

    Parser(String[] args) {
        this.argumentsReceived = args;
    }

    public String     getArgumentsAtIndex(int index){
        if (this.argumentsToReturn != null){
            if (index < this.argumentsToReturn.size() && index >= 0){
                System.out.println(this.argumentsToReturn.get(index));
                return this.argumentsToReturn.get(index);
            }
        }
        return null;
    }

    public boolean parse(){
        if (this.argumentsReceived != null){
            for (int i = 0 ; i < this.argumentsReceived.length ; i++){
                if (this.argumentsReceived[i].equals("-p") && i + 1 < this.argumentsReceived.length){
                    this.argumentsToReturn.add(this.argumentsReceived[i + 1]);
                    return true;
                }
            }
        }
        return false;
    }
}
