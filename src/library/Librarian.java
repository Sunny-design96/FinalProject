package library;

import java.util.List;

public class Librarian extends User {
	private String positions;
	private String tasks;
	//create constructor
	public Librarian(int ID,String name, String role,char gender,String positions, String tasks) {
		super(ID, name, role, gender);
		this.positions= positions;
		this.tasks= tasks;
	}
	//create accessor method
	public String getPositions(){
		return positions;	
	}
	public String getTasks() {
		return tasks;
	}
	//create mutator method
	public void setPositions(String positions) {
		this.positions= positions;
	}
	public void setTasks(String tasks) {
		this.tasks= tasks;
	}
	public void displayAll() {
		System.out.println();
	}
	public void sortLetter(List<LibraryItem> listShelf) {//create method to sort algorithm
		int size = listShelf.size();//method to determine the size of the list
		for (int i=0; i<size-1; i++) {//create loop to iterate through the list
			int min=i;//store the index of the smallest element
			LibraryItem temp; //temporary storage for swapping
			
			for (int j=i+1; j<size;j++) {
				
				if(listShelf.get(j).getTitle().compareToIgnoreCase(listShelf.get(min).getTitle())<0){
					min=j;//update min to the indexof the smaller element
					
				}
			}
			//swap the smallest item with the item at the current index (i)
			temp = listShelf.get(i);
			listShelf.set(i, listShelf.get(min));
			listShelf.set(min,temp);
			
		}
		
	}
	
}
