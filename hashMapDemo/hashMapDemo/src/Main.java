import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("pencil","kalem");

        for (String item : sozluk.keySet()){
            System.out.println("Eleman-"+item+ "Deger-"+sozluk.get(item));
        }


        //sozluk.remove("table");
        //sozluk.clear();
        System.out.println(sozluk.size());
        System.out.println(sozluk.get("table"));

    }
}