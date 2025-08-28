package Assignment_Day9;

import java.util.*;

class City {
    String name;
    int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{name='" + name + "', population=" + population + "}";
    }
}

public class Problem9 {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Guntur", 8419000));
        cities.add(new City("Vijayawada", 13960000));
        cities.add(new City("Hyderabad", 8982000));

        System.out.println("Before sorting:");
        cities.forEach(System.out::println);

       
        Comparator<City> populationComparator = (c1, c2) -> Integer.compare(c2.population, c1.population);
        Collections.sort(cities, populationComparator);

        System.out.println("After sorting by population in descending order:");
        cities.forEach(System.out::println);
    }
}