package Composite;

import java.util.List;

public class File implements IFile {
    private String name;
    
    public File(String name) {
    	this.name = name;
    }
    
	@Override
	public boolean add(IFile composite) {
		return false;
	}

	@Override
	public boolean remove(IFile composite) {
		return false;
	}

	@Override
	public List<IFile> getChild() {
		return null;
	}

	@Override
	public void display() {
		System.out.println(name);
	}

}
