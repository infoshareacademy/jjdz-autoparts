package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javatar.model.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class JsonParserAll {
	final String DEFAULT_URL = "http://infoshareacademycom.2find.ru/api/v2?lang=polish";
	HtmlReader reader = new HtmlReader();
	DataCarsBrands brands = null;
	DataCarsModels model = null;
	DataCarsEngineAndFuel engine = null;
	JsonDataAutopartCategories category = null;
	JsonDataAutopart part = null;

	public DataCarsBrands parseCarFile() {

		try {
			String readString = reader.getText(DEFAULT_URL);
			Gson gson = new GsonBuilder().create();

			brands = gson.fromJson(readString, DataCarsBrands.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return brands;
	}

	public DataCarsModels parseModelFile(String url) {

		try {
			String readString = reader.getText(url);
			Gson gson = new GsonBuilder().create();

			model = gson.fromJson(readString, DataCarsModels.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return model;
	}

	public DataCarsEngineAndFuel parseEngineFile(String url) {

		try {
			String readString = reader.getText(url);
			Gson gson = new GsonBuilder().create();

			engine = gson.fromJson(readString, DataCarsEngineAndFuel.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return engine;
	}

	public JsonDataAutopartCategories parseCategoryFile(String url) {

		try {
			String readString = reader.getText(url);
			Gson gson = new GsonBuilder().create();

			category = gson.fromJson(readString, JsonDataAutopartCategories.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return category;
	}

	public JsonDataAutopart parsePartFile(String url) {

		try {
			String readString = reader.getText(url);
			Gson gson = new GsonBuilder().create();

			part = gson.fromJson(readString, JsonDataAutopart.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return part;
	}

	public List<CarsEngineAndFuel> searchEngineTypeByTokens(DataCarsEngineAndFuel engines, String fuelType, String engineCapacity, String enginePower) {

		String fuel_txt = "";

		switch (fuelType) {
			case "P":
				fuel_txt = "benzyna";
				break;
			case "D":
				fuel_txt = "olej napędowy";
				break;
			default:
				fuel_txt = "Nie znaleziono";
				break;
		}

		String capacity_txt = engineCapacity.substring(0, engineCapacity.length() - 6);
		int power = Integer.parseInt(enginePower.split(",")[0]);
		int capacity = Integer.parseInt(capacity_txt);

		List<CarsEngineAndFuel> enginesList = engines.getData();

		final String finalFuel_txt = fuel_txt;
		List<CarsEngineAndFuel> blist = enginesList.stream()
				.filter(fuel -> Math.abs(fuel.getCcm() - capacity) <= 20)
				.filter(f -> f.getFuel().equals(finalFuel_txt))
				.filter(f -> Math.abs(f.getKw() - power) <= 20)
				.collect(Collectors.toList());

		System.out.println(blist.toString());
		System.out.println(blist.size());
		System.out.println(power);
		System.out.println(capacity);
		System.out.println(fuel_txt);
		return blist;
	}

}
