package exercices.tp.entity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class AbstractProductBuilder<T extends Product>
{
	protected double price;
	protected int test;

	/*private Class<T> type;

	public AbstractProductBuilder() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}*/

	public AbstractProductBuilder<T> price(double price)
	{
		this.price = price;
		return this;
	}

	public abstract T build();
	/*public T build() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		return (T) type.getConstructors()[0].newInstance(this);
	}*/
}
