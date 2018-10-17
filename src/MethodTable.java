import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MethodTable {
    public class Symbol {
        private String name;
        private String returnType;
        private int length;
        private ArrayList<String> typesList;
        private ArrayList<String> identifiersList;
        private ArrayList<String> isArray;

        public Symbol(String name, String returnType, int length, ArrayList<String> typesList, ArrayList<String> identifiersList, ArrayList<String> isArray) {
            this.name = name;
            this.returnType = returnType;
            this.length = length;
            this.typesList = typesList;
            this.identifiersList = identifiersList;
            this.isArray = isArray;
        }

        public String getReturnType() {
            return returnType;
        }

        public void setReturnType(String returnType) {
            this.returnType = returnType;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public ArrayList<String> getTypesList() {
            return typesList;
        }

        public void setTypesList(ArrayList<String> typesList) {
            this.typesList = typesList;
        }

        public ArrayList<String> getIdentifiersList() {
            return identifiersList;
        }

        public void setIdentifiersList(ArrayList<String> identifiersList) {
            this.identifiersList = identifiersList;
        }

        public ArrayList<String> getIsArray() {
            return isArray;
        }

        public void setIsArray(ArrayList<String> isArray) {
            this.isArray = isArray;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


        @Override
        public String toString(){
            ArrayList<String> typesParams = getTypesList();
            String result = "";
            String result2 = "";
            String result3 = "";
            if(typesParams!= null){
                for(int i=0; i<=typesParams.size()-1; i++){
                    result+= " "+typesParams.get(i);
                }
                for(int i=0; i<=identifiersList.size()-1; i++){
                    result2+= " "+identifiersList.get(i);
                }
                for(int i=0; i<=isArray.size()-1; i++){
                    result3+= " "+isArray.get(i);
                }
                return "ID: "+this.name+", Type: "+this.returnType+ ", typesParamsList: "+result+ ", idParamsList: "+result2 + ", isArrayParamsList: "+result3 + ", cantidad: "+ this.length+"\n";

            }
            else{
                return "ID: "+this.name+", Type: "+this.returnType + ", no parameters";
            }

        }

    }

    // private int actualLevel = 0;
    private LinkedList<MethodTable.Symbol> table = new LinkedList<MethodTable.Symbol>();

    /**
     * Agrega un identificador a la Tabla
     */
    public int enter(String id, String returnType, int length, ArrayList<String> typesList, ArrayList<String> identifiersList, ArrayList<String> isArray) {
        if (!this.exists(id)) {
            table.add(new MethodTable.Symbol(id, returnType, length, typesList, identifiersList, isArray));
            return 0; //means id was succesfully inserted in table
        }
        else
            return 1; //means id exists already in table
    }

    public boolean exists(String id){
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            MethodTable.Symbol aux = (MethodTable.Symbol) i.next();
            if (aux.getName().equals(id))
                return true;
        }
        return false;
    }

    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public MethodTable.Symbol retrieve(String id) {
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            MethodTable.Symbol aux = (MethodTable.Symbol)i.next();
            if ( aux.getName().equals(id) )
                return aux;
        }
        return null;
    }



    @Override
    public String toString() {
        String result="";
        for (Iterator i = table.descendingIterator(); i.hasNext(); )
            result += i.next().toString()+"\n";
        if(table.size() == 0){
            return " ++ EMPTY TABLE ++";
        }
        else
            return result;
    }
}
