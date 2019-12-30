package Composite;

import java.util.LinkedList;
import java.util.List;

public class Directory implements IFile {
	private String name;
	private List<IFile> child;
	
	public Directory(String name) {
		this.name = name;
		child = new LinkedList<IFile>();
	}
	
	@Override
	public boolean add(IFile composite) {
		child.add(composite);
		return true;
	}

	@Override
	public boolean remove(IFile composite) {
		child.remove(composite);
		return true;
	}

	@Override
	public List<IFile> getChild() {
		return child;
	}

	@Override
	public void display() {
		System.out.println(name);
		for (IFile file: child) 
			file.display();
	}

}
