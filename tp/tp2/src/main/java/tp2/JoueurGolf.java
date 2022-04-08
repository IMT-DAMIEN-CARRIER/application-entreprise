package tp2;

import tp2.introspection.IClub;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class JoueurGolf {
    @Inject
    private IClub club;

    @Inject
    private Event<TropLourd> event;

    public JoueurGolf(){}

    public float poidClub() {
        return club.getPoids();
    }

    public void signaleClubTropLourd() {
        TropLourd payLoad = new TropLourd();
        payLoad.setMessage("Club a changer .....");
        event.fire(payLoad);
    }
}
