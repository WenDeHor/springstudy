package com.springstudy.site.repository;

import com.springstudy.site.model.Meal;

import java.util.Collection;

public interface MealRepository {

    Meal save(Meal meal);

    boolean delete(int id);

    Meal get(int id);

    Collection<Meal> getAll();
}
