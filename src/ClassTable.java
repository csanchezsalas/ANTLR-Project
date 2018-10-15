import java.util.Iterator;
import java.util.LinkedList;

public class ClassTable {
    public class Symbol {
        private String name;

        public Symbol(String n) {
            this.name = n;

        }
        public String getName() {
            return name;
        }

        @Override
        public String toString(){
            return "ID:"+this.name;
        }
    }

    // private int actualLevel = 0;
    private LinkedList<ClassTable.Symbol> table = new LinkedList<ClassTable.Symbol>();

    /**
     * Agrega un identificador a la Tabla
     */
    public int enter(String id) {
        if (!this.exists(id)) {
            table.add(new ClassTable.Symbol(id));
            return 0; //means id was succesfully inserted in table
        }
        else
            return 1; //means id exists already in table
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
