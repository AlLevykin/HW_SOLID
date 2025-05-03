package netology.eshop;

public enum Recipe{
    EXCLUSIVE("Эксклюзив"),
    BLACK ("Черный кофе"),
    IRISH ("Ирландский кофе"),
    BAILEYS ("Бейлис"),
    LATTE ("Латте"),
    ICE ("Глясе");

    private String name;
    Recipe(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
