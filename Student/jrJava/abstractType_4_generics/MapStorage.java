package jrJava.abstractType_4_generics;

public class MapStorage<K, V> {

	private String key;
	private Integer value;
	
	public void put(String key, Integer value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {return key;}
	public Integer getValue() {return value;}
	
	
}
