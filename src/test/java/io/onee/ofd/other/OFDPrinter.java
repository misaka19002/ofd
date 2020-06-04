package io.onee.ofd.other;

public class OFDPrinter implements Printer<SimpleOFD> {
    
    @Override
    public String print(SimpleOFD ofd) {
        //todo impl
        return ofd.child.toString();
    }
    
}
