package library;

import java.util.List;

public class Librarian extends User {
	private String positions;
	private String tasks;

	public Librarian(int ID,String name, String role,char gender,String positions, String tasks) {
		super(ID, name, role, gender);
		this.positions= positions;
		this.tasks= tasks;
	}
	public String getPositions(){
		return positions;	
	}
	public String getTasks() {
		return tasks;
	}
	public void setPositions(String positions) {
		this.positions= positions;
	}
	public void setTasks(String tasks) {
		this.tasks= tasks;
	}
	public void displayAll() {
		System.out.println();
	}
	public void sortLetter(List<LibraryItem> listShelf) {
		int size = listShelf.size();
		for (int i=0; i<size-1; i++) {
			int min=i;
			LibraryItem temp; 
			
			for (int j=i+1; j<size;j++) {
				if(listShelf.get(j).getTitle().compareToIgnoreCase(listShelf.get(min).getTitle())<0){
					min=j;
					
				}
			}
			temp = listShelf.get(i);
			listShelf.set(i, listShelf.get(min));
			listShelf.set(min,temp);
			
		}
		
	}
	
}
