package homework;

import java.util.Date;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String city;

    public Room(long id, int price, int persons, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.hotelName = hotelName;
        this.city = cityName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return city != null ? city.equals(room.city) : room.city == null;

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", hotelName='" + hotelName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}