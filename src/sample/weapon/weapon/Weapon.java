package sample.weapon.weapon;

import sample.weapon.parametrs.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.*;

@XmlSeeAlso({Knife.class, Knuckles.class, Pistol.class, Rifle.class, Shuriken.class, Spear.class})
public abstract class Weapon implements Serializable {
    protected String weaponType;
    protected String weaponModel;
    protected Range range;

    protected Weapon(String weaponType, String weaponModel, Range range) {
        this.weaponType = weaponType;
        this.weaponModel = weaponModel;
        this.range = range;
    }

    public String getXML() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Weapon.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        marshaller.marshal(this, sw);
        return sw.toString();
    }


    public abstract Weapon create(String weaponModel, Range range);

    public String getWeaponType() {
        return weaponType;
    }

    public String getWeaponModel() {
        return weaponModel;
    }

    public void setWeaponType(String vehicleType) {
        this.weaponType = vehicleType;
    }

    public void setWeaponModel(String vehicleModel) {
        this.weaponModel = vehicleModel;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public String getRange() {
        if (range != null)
            return range.getRange();
        return "1";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
