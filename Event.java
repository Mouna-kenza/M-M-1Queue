package tp1;

public class Event {
final static int arrv=0;
final static int dep=1;
protected int type,id;
protected double eventT;
public Event(int id,int type, double eventT) {
	super();
	this.type = type;
	this.eventT = eventT;
	this.id= id;
}
public int getType() {
	return type;
}

public double getEventT() {
	return eventT;
}
public int getId() {
	return id;
}

}
