public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[8]);
        } catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        } catch (Exception e){
            System.out.println("Hata!!"+e);
        } finally {
            System.out.println("Burası her türlü çalışır.");
        }




    }
}