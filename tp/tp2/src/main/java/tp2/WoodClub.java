package tp2;

import tp2.introspection.IClub;

import javax.enterprise.event.Observes;

public class WoodClub implements IClub {
    private float poids = 10;

    @Override
    public float getPoids() {
        return this.poids;
    }

    /*
     * Reduit le poid  du club de 5 grammes .…
     */
    public void tropLourd(@Observes TropLourd event) {
        System.out.println(event.getMessage());
        this.poids -= 5;
    }
}
