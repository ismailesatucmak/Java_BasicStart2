public interface IEntitiyRepository <T extends IEntity> {
    void add(T entity);
    void delete(T entity);
    void  update(T entity);
}
