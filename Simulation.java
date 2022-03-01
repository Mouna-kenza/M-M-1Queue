package tp1;
public class Simulation {
	double lambda, mu;
	ListeEvents listeE;
	QueueClient queueC;
	double startS,dS,arrvT,endT,T;
	int i,id=0;
	final int max=60;
	int nbClient=0;
	public Simulation(double lambda, double mu) {
		this.lambda=lambda;
		this.mu=mu;
		queueC=new QueueClient();
		listeE=new ListeEvents();
		
	}
	
	public double expo(double taux) {
		T=-Math.log(Math.random())/taux;
		return T;
	}
	
	public void Simulate(double simLength) {
		double T=0;
		id=1; // 
		Event s1=new Event(nbClient+1,Event.arrv, T);
		listeE.addEvent(s1);
		do { 
		Event e= (Event) listeE.getE();
		listeE.removeE(0);
		T=e.getEventT();
		
		if(e.getType()== Event.arrv) {
			
			Client c2=new Client(nbClient+1,arrvT,expo(mu));
	    	queueC.AddClient(c2);
	    	dS=expo(mu);
	    	startS=endT;
	    	if(nbClient < max) {
	    		Event nextE= new Event(nbClient+1,Event.arrv, T+expo(lambda));
	    		listeE.addEvent(nextE);
	    		Client c3=new Client(nbClient+1,e.getEventT(),expo(mu));
	    		queueC.AddClient(c3);
	    		}
			else 
				if(!queueC.isEmpty()) {
					queueC.removeE(0);}
	    		if(!queueC.isEmpty()) {
	    			Client c4=new Client(nbClient+1,e.getEventT(),expo(mu));
		    		queueC.AddClient(c4);
	    		}
		}
		}
		while(T<simLength && nbClient <max || !listeE.isEmpty());
	} 
	


public static void main(String[] arg) {
	Simulation S=new Simulation(0.5,1);
	S.Simulate(1000);
}
}