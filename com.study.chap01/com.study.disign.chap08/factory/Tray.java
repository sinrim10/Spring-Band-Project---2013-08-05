package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item{

	protected List<Item> tray = new ArrayList<Item>();
	
	public Tray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}
	public void add(Item item){
		tray.add(item);
	}
}
