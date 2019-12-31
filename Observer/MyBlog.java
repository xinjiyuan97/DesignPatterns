package Observer;

import java.util.*;
import java.util.Observable;

public class MyBlog extends Observable {
	private List<String> Articles = new LinkedList<String>();
	public void addArticle(String Article, String Title) {
		this.setChanged();
		Articles.add(Article);
		this.notifyObservers(Title);
	}
}
