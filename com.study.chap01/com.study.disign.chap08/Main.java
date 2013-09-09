import factory.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = Factory.getFactory("listfactory.ListFactory");
		Link joins = factory.createLink("�߾��Ϻ�", "http://www.joins.com");
		Link chosun = factory.createLink("�����Ϻ�", "http://www.chosun.com");
		
		Link naver = factory.createLink("���̹�", "http://www.naver.com");
		Link daum = factory.createLink("����", "http://www.daum.net");
		Link excite = factory.createLink("Excite", "http://www.excite.com");
		
		Tray traynews = factory.createTray("�Ź�");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray traysearch = factory.createTray("�˻�����!");
		traysearch.add(naver);
		traysearch.add(daum);
		traysearch.add(excite);
		
		Page page = factory.createPage("LinkPage", "��������");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}

}
