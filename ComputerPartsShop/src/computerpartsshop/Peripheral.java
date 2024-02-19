/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computerpartsshop;

/**
 *
 * @author arets
 */
public class Peripheral extends ComputerPart {
    
      private String connectionType;

    public Peripheral() {
    }

    public Peripheral(int partId, String name, double price, String connectionType) {
        super(partId, name, price);
        this.connectionType = connectionType;
   
    }

    public Peripheral(int partId, String name, double price) {
        super(partId, name, price);
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

@Override
public String toString() {
    return "Peripheral : " + "partId : '" + getPartId() + '\'' + ", name : '" + getName() + '\'' + ", price : " + getPrice() + ", connectionType : '" + connectionType + '\'' + '}';
}
    
}
