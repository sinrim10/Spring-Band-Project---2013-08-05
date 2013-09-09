package listfactory;

import java.util.Iterator;

import factory.Item;
import factory.Tray;

public class ListTray extends Tray{

	public ListTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption+"\n");
		buffer.append("<ul>\n");
		Iterator<Item> it = tray.iterator();
		while(it.hasNext()){
			Item item = (Item)it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("</li>\n");
		return buffer.toString();

	}

}
