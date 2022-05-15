package service;

import entity.Car;
import entity.Company;

import java.util.List;

public interface CarService {
    boolean addCar(Car car);
    boolean updateCar(Car car);
    boolean deleteCar(int id);
    List<Car> showCar();
  //  Car findCarInList(Company company, String name);
    Car findCarByName(String name);
}
