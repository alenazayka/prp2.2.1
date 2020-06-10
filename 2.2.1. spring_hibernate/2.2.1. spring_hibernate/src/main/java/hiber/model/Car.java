package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "car")
   private User owner;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "series")
    private int series;

    public Car() {}

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarName() {
        return name;
    }

    public void setCarName(String carName) {
        this.name = carName;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", series=" + series +
                ", owner=" + owner +
                '}';
    }
}
