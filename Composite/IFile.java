package Composite;

import java.util.List;

public interface IFile {
	public boolean add(IFile composite);
	public boolean remove(IFile composite);
	public List<IFile> getChild();
	
	public void  display();
}
