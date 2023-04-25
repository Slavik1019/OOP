import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;


//ver 1.0
public class App {
    public static void main(String[] args) throws Exception{
        /*Market market = new Market();
        OrdinaryClient client1 = new OrdinaryClient("Boris");
        OrdinaryClient client2 = new OrdinaryClient("Dasha");
        SpetialClient client3 = new SpetialClient("Egor", 1101);
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.update();*/
        /**Создание экземпляров класса Маркет и имитация поведения покупателей*/
        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 10);
        iActorBehaviour item3 = new ActionClient("Sergei", "April_15%", 3);
        iActorBehaviour item4 = new OrdinaryClient("Semen");
        iActorBehaviour item5 = new ActionClient("Max", "April_5%", 3);
        
        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);        
        market.acceptToMarket(item4);
        market.acceptToMarket(item5); 
        market.update();
        market.returnZak();
    }

}