package sample.weapon.Adapter;

import sample.weapon.weapon.Shuriken;
import sample.weapon.weapon.Pistol;


    public class Adapter extends Shuriken {
        Pistol pistol;

        public Adapter(Pistol pistol){
            this.pistol = pistol;
        }
    }