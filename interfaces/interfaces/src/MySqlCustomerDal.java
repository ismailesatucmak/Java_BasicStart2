public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("MySql data eklendi.");
    }

    @Override
    public void repo() {
        System.out.println("Repo yazıldı.");
    }
}
