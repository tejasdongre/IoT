
import com.example.tejasad.iot.*;

import org.alljoyn.bus.BusException;
import org.alljoyn.bus.annotation.BusMethod;
import org.alljoyn.bus.annotation.BusProperty;
import org.alljoyn.bus.annotation.BusSignal;

import java.lang.String;

@BusInterface(name = "com.example.tejasad.interface.name")
public interface AllJoynBusInterface {

    @BusMethod
    public String TestMethod(String iStr) throws BusException;

    @BusSignal
    public void MySignal(String inStr) throw BusException;

    @BusProperty
    public String GetMyProperty() throws  BusException;

    @BusProperty
    public void SetMyProperty(String myProperty) throws BusException;


}