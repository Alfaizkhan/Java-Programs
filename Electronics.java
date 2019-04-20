
package electronics;
import java.lang.String;
interface ElectronicDevice
{
   public void setOn();
   public void setOff();
}
interface Cordless extends ElectronicDevice
{
    void setCall();
}
interface CommunicationDevice extends Cordless
{
  void setCommunicate();
}

interface Digitalcamera extends ElectronicDevice
{
   
   void Setclickphoto();
   
}
interface storagedevice extends ElectronicDevice
{
	void setstorage();
}

class Smartphone implements Digitalcamera,CommunicationDevice
{
    void setChat()
    {
        System.out.println("Chating through Whatsapp");
    }

    @Override
    public void Setclickphoto() {
        System.out.println("Click photo with camera app");
    }

    @Override
    public void setOn() {
        System.out.println("On button");
    }

    @Override
    public void setOff() {
        System.out.println("off button");
    }

    @Override
    public void setCommunicate() {
        System.out.println("Whatsapp");
    }

    @Override
    public void setCall() {
        System.out.println("call");
    }
    
    public void setstorage() {
    	System.out.println("Storage");
    }
    

    
}

public class Electronics {

    public static void main(String[] args) {
      
        Smartphone LG = new Smartphone() ;
        LG.Setclickphoto();
        LG.setChat();
        LG.setOn();
        LG.setOff();
        LG.setCommunicate();
        LG.setCall();
        LG.setstorage();
    }
    
}
