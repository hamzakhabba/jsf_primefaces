package com.emsi.web.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dtBasicView")
@ViewScoped
public class BasicView2 implements Serializable {

	private static final long serialVersionUID = 8613455680266393468L;
	private List<Car> cars;
	private Car selectedCar;

	@PostConstruct
	public void init() {
		cars = new ArrayList<Car>();
		for (int i = 0; i < 50; i++) {
			cars.add(new Car("id" + i, "brand" + i, i, null, i, false));
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Car getSelectedCar() {
		return selectedCar;
	}

	public void setSelectedCar(Car selectedCar) {
		this.selectedCar = selectedCar;
	}

	public void deleteCar() {
		cars.remove(selectedCar);
		selectedCar = null;
	}

}