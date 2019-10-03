package n4_Elevator;

public class Elevador {
	
	private int currentFloor = 0;
	private int totalFloorsOfTheBuilding = 10;
	private int capacity = 10;
	private int numberOfPersons = 0;
	
	// constructor 
	public Elevador( int capacity, int totalFloorsOfTheBuilding ) {
		this.capacity = capacity;
		this.totalFloorsOfTheBuilding =  totalFloorsOfTheBuilding;
	}
	
	// getters and setters
	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getTotalFloorsOfTheBuilding() {
		return totalFloorsOfTheBuilding;
	}

	public void setTotalFloorsOfTheBuilding(int totalFloorsOfTheBuilding) {
		this.totalFloorsOfTheBuilding = totalFloorsOfTheBuilding;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}
	
	//methods
	public void entra() {
		if( this.numberOfPersons < this.capacity ) {
			this.numberOfPersons++;
		} else {
			System.out.println("Elevador cheio!");
		}
	}
	
	public void sai() {
		if( this.numberOfPersons > 0 ) {
			this.numberOfPersons--;
		} else {
			System.out.println("Elevador vazio!");
		}
	}
	
	public void sobe() {
		if ( this.currentFloor < this.totalFloorsOfTheBuilding ) {
			this.currentFloor++;
		} else {
			System.out.println("Impossivel Subir");
		}
	}
	
	public void desce() {
		if ( this.currentFloor > 0 ) {
			this.currentFloor--;
		} else {
			System.out.println("Impossivel Descer");
		}
	}
	
	

	@Override
	public String toString() {
		return "Elevador [currentFloor=" + currentFloor + ", totalFloorsOfTheBuilding=" + totalFloorsOfTheBuilding
				+ ", capacity=" + capacity + ", numberOfPersons=" + numberOfPersons + "]";
	}

}
