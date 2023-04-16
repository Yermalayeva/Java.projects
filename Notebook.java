public class Notebook {
    private String name;
    private Integer amountRam;
    private Integer amountRom;
    private String operatingSystem;
    private String color;
    private Double price;

    Notebook(String name, Integer amountRam, Integer amountRom, String operatingSystem, String color, Double price){
        this.name = name;
        this.amountRam = amountRam;
        this.amountRom = amountRom;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.price = price; 
    }
    public String getName(){
        return name;
    }
    public Integer getRam() {
        return amountRam;
    }

    public Integer getRom() {
        return amountRom;
    }

    public String getOs() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "[" + name + "] " + "\\Объём ОЗУ: " + amountRam +
                "ГБ\\ Объём ЖД: " + amountRom + "ГБ\\ ОС: " + operatingSystem + "\\ Цвет: " +
                color + "\\ Цена: " + price +"руб\\";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook note = (Notebook) obj;
        return name.equals(note.name) && amountRam.equals(note.amountRam) &&
                amountRom.equals(note.amountRom) && operatingSystem.equals(note.operatingSystem) && color.equals(note.color);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + amountRam.hashCode() + amountRom.hashCode() +
                operatingSystem.hashCode() + color.hashCode();
    }
}

