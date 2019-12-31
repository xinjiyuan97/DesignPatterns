package Observer;

import java.util.Observable;
import java.util.Observer;

public class MainClass implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("内容更新");
		System.out.println("标题为" + (String) arg);
	}
	
	public static void main(String[] args) {
		MyBlog blog = new MyBlog();
		MainClass listener = new MainClass();
		blog.addObserver(listener);
		
		blog.addArticle("Hello World!", "HW");
	}

}
