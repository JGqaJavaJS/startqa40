package datasetup;

public class DataCommonDTO {

    UserDto user;
    CarDTO[] cars;

    public DataCommonDTO() {
    }

    public DataCommonDTO(UserDto user, CarDTO[] cars) {
        this.user = user;
        this.cars = cars;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public CarDTO[] getCars() {
        return cars;
    }

    public void setCars(CarDTO[] cars) {
        this.cars = cars;
    }
}
