package response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class MarsRover {
    private Long id;
    String name;
    @JsonProperty("landing_date")
    private Date landingDate;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLandingDate() {
        return landingDate;
    }

    public void setLandingDate(Date landingDate) {
        this.landingDate = landingDate;
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", landingDate=" + landingDate +
                '}';
    }
}
