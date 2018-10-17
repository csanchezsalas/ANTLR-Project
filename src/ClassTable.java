import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ClassTable {
    public class Symbol {
        private String name;
        private ArrayList<String> attributes;
        private ArrayList<String> typesList;
        public ArrayList<String> isArray;
        public Symbol(String n, ArrayList<String> attributes, ArrayList<String> typesList, ArrayList<String> isArray) {
            this.name = n;
            this.attributes = attributes;
            this.typesList = typesList;
            this.isArray = isArray;
        }

        public ArrayList<String> getIsArray() {
            return isArray;
        }

        public void setIsArray(ArrayList<String> isArray) {
            this.isArray = isArray;
        }

        public ArrayList<String> getAttributes() {
            return attributes;
        }
        public void setAttributes(ArrayList<String> attributes) {
            this.attributes = attributes;
        }

        public ArrayList<String> getTypesList() {
            return typesList;
        }

        public void setTypesList(ArrayList<String> typesList) {
            this.typesList = typesList;
        }
        public String getName() {
            return name;
        }

        @Override
        public String toString(){

            String result = "";
            String result2 = "";
            String result3 = "";
            if(this.typesList!= null){
                for(int i=0; i<=typesList.size()-1; i++){
                    result+= " "+typesList.get(i);
                }
                for(int i=0; i<=attributes.size()-1; i++){
                    result2+= " "+attributes.get(i);
                }
                for(int i=0; i<=isArray.size()-1; i++){
                    result3+= " "+isArray.get(i);
                }
                return "ID: "+this.name+ ", attributesList: "+result+ ", typesParamsList: "+result2 + ", isArrayAttributeList: "+result3+"\n";

            }
            else{
                return "ID: "+this.name+ ", no attributes to display";
            }
        }
    }

    // private int actualLevel = 0;
    private LinkedList<ClassTable.Symbol> table = new LinkedList<ClassTable.Symbol>();

    /**
     * Agrega un identificador a la Tabla
     */
    public int enter(String id, ArrayList<String> attributes, ArrayList<String> typesList, ArrayList<String> isArray) {
        if (!this.exists(id)) {
            table.add(new ClassTable.Symbol(id, attributes, typesList, isArray));
            return 0; //means id was succesfully inserted in table
        }
        else
            return 1; //means id exists already in table
    }
    public int setClassAttr(String id, ArrayList<String> attributes, ArrayList<String> typesList, ArrayList<String> isArray){
        ClassTable.Symbol aux = retrieve(id);
        int index = table.indexOf(aux); // obtengo índice de obj en la tabla
        table.get(index).setAttributes(attributes);
        table.get(index).setTypesList(typesList);
        table.get(index).setIsArray(isArray);

        return 0;
    }


    public boolean exists(String id){
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            ClassTable.Symbol aux = (ClassTable.Symbol) i.next();
            if (aux.getName().equals(id))
                return true;
        }
        return false;
    }

    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public ClassTable.Symbol retrieve(String id) {
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            ClassTable.Symbol aux = (ClassTable.Symbol)i.next();
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
