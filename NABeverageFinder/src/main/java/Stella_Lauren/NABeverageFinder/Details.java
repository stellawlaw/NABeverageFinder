package Stella_Lauren.NABeverageFinder;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Details {
    @OneToOne
    private Place place;
    private String streetAddress;
    private String cityAddress;
    private String phone;
    private String hours;
    private String distance;
    private String ETA;
    private String website;
    private String picture;
    @OneToMany
    private Set<Beverages> beverages;


    @Id
    @GeneratedValue
    private Long id;
    protected Details(){}

    public Details(Place place, String streetAddress, String cityAddress, String phone, String hours, String distance, String ETA, String website, String picture, Beverages... beverages) {
        this.place = place;
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.phone = phone;
        this.hours = hours;
        this.distance = distance;
        this.ETA = ETA;
        this.website = website;
        this.picture = picture;
        this.beverages = Set.of(beverages);
    }
}
