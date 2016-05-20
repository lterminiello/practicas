package Mobility; 
   
import jade.core.AID; 
import jade.core.Agent; 
import jade.core.PlatformID; 
 
import jade.core.behaviours.TickerBehaviour; 
@SuppressWarnings("serial") 
public class MobileAgent extends Agent { 
 
    @Override
    protected void setup() { 
        super.setup(); 
        addBehaviour(new MyTickerBehaviour(this, 1000)); 
   
        System.out.println("Hello World. I am an agent!"); 
        System.out.println("My LocalName: " + getAID().getLocalName()); 
        System.out.println("My Name: " + getAID().getName()); 
        System.out.println("My Address: " + getAID().getAddressesArray()[0]); 
    } 
   
    private class MyTickerBehaviour extends TickerBehaviour { 
        Agent agent; 
        // long interval; 
        int counter; 
   
        public MyTickerBehaviour(Agent agent, long interval) { 
            super(agent, interval); 
            this.agent = agent; 
            // this.interval = interval; 
        } 
   
        @Override
        protected void onTick() { 
            if (counter == 3) { 
                // move out 
                AID remoteAMS = new AID("ams@slave2", AID.ISGUID); 
                remoteAMS.addAddresses("http://slave2:7778/acc"); 
                PlatformID destination = new PlatformID(remoteAMS); 
                agent.doMove(destination); 
            } 
            if (counter == 10) { 
                // move back 
                AID remoteAMS = new AID("ams@slave1", AID.ISGUID); 
                remoteAMS.addAddresses("http://slave1:7778/acc"); 
                PlatformID destination = new PlatformID(remoteAMS); 
                agent.doMove(destination); 
            } 
            if (counter < 15) 
                System.out.println(counter++); 
            else
                agent.doDelete(); 
        } 
   
    } 
}