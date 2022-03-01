package tp1;

import java.util.Vector;

public class QueueClient {
	Vector<Client> ClientsQ;
	
	public QueueClient() {
		ClientsQ= new Vector<>();
	
	}
	public void AddClient(Client e) {
		ClientsQ.add(e);
	}
	public void removeE(int removeIndex) {
		ClientsQ.remove(removeIndex);
	}
	public boolean isEmpty() {
		return ClientsQ.isEmpty();
		 
	}
	}
