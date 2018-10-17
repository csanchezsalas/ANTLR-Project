import org.antlr.v4.runtime.Token;

import java.util.Iterator;
import java.util.LinkedList;

public class SymbolTable {

    public class Symbol {
        private String name;
        private String type;
        private int level;
        private boolean isArray;

        public Symbol(String n, String t, int l, boolean f) { // definir si es arreglo o no
            this.name = n;
            this.type = t;
            this.level = l;
            this.isArray = f;
        }

        public int getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
        public boolean getIsArray() {
            return isArray;
        }

        @Override
        public String toString(){
            return "ID: "+this.name+", Type: "+this.type+", Level: "+this.level+", isArray?: "+this.isArray+"\n";
        }
    }

    private int actualLevel = 0;
    private LinkedList<Symbol> table = new LinkedList<Symbol>();

    /**
     * Agrega un identificador a la Tabla
     */
    public int enter(String id, String tipo, boolean isArray) {
        if (!this.exists(id,actualLevel)) {
            table.add(new Symbol(id, tipo, actualLevel, isArray));
            return 0; //means id was succesfully inserted in table
        }
        else
            return 1; //means id exists already in table
    }

    public boolean exists(String id, int level){
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            Symbol aux = (Symbol) i.next();
            if (aux.getName().equals(id))
                return true;
            if (aux.getLevel() != level)
                break;
        }
        return false;
    }

    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public Symbol retrieve(String id) {
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            Symbol aux = (Symbol)i.next();
            if ( aux.getName().equals(id) )
                return aux;
        }
        return null;
    }

    /**
     * Agrega un nuevo nivel de identificadores a la tabla
     * El más “profundo”
     */
    public void openScope() {
        this.actualLevel++;
    }

    /**
     * Elimina el más profundo nivel de identificadores de la tabla.
     * Se borran todos los campos de la tabla asociados con el nivel
     */
    public void closeScope() {
        for (int i=table.size()-1; i>=0;i--)
            if (table.get(i).getLevel()==this.actualLevel)
                table.remove(i);
            else
                break;
        this.actualLevel--;
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
