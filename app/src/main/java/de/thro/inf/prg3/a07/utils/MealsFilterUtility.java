package de.thro.inf.prg3.a07.utils;

import java.util.LinkedList;
import java.util.List;

import de.thro.inf.prg3.a07.model.Meal;

public abstract class MealsFilterUtility {
	private MealsFilterUtility(){

	}
	public static List<Meal> filterForVegetarian(List<Meal> mealisToFilter){
		List<Meal> result = new LinkedList<>();
		for(Meal m : mealisToFilter){
			if(m.isVegetarian()){
				result.add(m);
			}
		}
		return result;
	}
}
