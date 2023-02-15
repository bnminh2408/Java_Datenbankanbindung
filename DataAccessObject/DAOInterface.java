package DataAccessObject;

import java.util.ArrayList;

public interface DAOInterface<T> {

	public void insert(T t);

	//public int update(T t);

	public void delete(T t);

	public ArrayList<T> selectAll();

	public T selectById(T t);

}
