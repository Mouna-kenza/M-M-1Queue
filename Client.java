package tp1;

public class Client {
protected int id;
protected double arrvT,servD ;
public Client(int id, double arrvT, double servD) {
		super();
		this.id = id;
		this.arrvT = arrvT;
		this.servD = servD;
	}
public int getId() {
	return id;
}

public double getArrvT() {
	return arrvT;
}

public double getServD() {
	return servD;
}


}
