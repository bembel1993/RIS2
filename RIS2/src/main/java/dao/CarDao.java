package dao;

import entity.Car;
import entity.Company;

import java.util.List;

public interface CarDao {
    boolean addCar(Car car);
    boolean updateCar(Car car);
    boolean deleteCar(int id);
    List<Car> showCars();
   // Car findCarInList(Company company, String name);
    Car findCarByName(String name);
}