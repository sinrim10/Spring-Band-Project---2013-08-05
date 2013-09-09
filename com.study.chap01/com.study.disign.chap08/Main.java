import factory.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = Factory.getFactory("listfactory.ListFactory");
		Link joins = factory.createLink("중앙일보", "http://www.joins.com");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com");
		
		Link naver = factory.createLink("네이버", "http://www.naver.com");
		Link daum = factory.createLink("다음", "http://www.daum.net");
		Link excite = factory.createLink("Excite", "http://www.excite.com");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray traysearch = factory.createTray("검색엔진!");
		traysearch.add(naver);
		traysearch.add(daum);
		traysearch.add(excite);
		
		Page page = factory.createPage("LinkPage", "영진닷컴");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}

}
