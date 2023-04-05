public class Programas extends Television{
private boolean namecanal, numcanal;

    public Programas(boolean namecanal, boolean numcanal, String color, String marca, int precio, int tamaño) {
        super(color, marca, precio, tamaño);
        this.namecanal = namecanal;
        this.numcanal = numcanal;
    }

    public boolean isNamecanal() {
        return namecanal;
    }

    public void setNamecanal(boolean namecanal) {
        this.namecanal = namecanal;
    }

    public boolean isNumcanal() {
        return numcanal;
    }

    public void setNumcanal(boolean numcanal) {
        this.numcanal = numcanal;
    }
  
}
