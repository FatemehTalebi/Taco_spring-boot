package com.technophaa.taco.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date createdAt = new Date();
    @ManyToMany()
    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public String toString() {
        return "Taco [id=" + id + ", name=" + name + ", createdAt=" + createdAt + ", ingredients=" + ingredients + "]";
    }

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Taco(Long id, String name, Date createdAt, List<Ingredient> ingredients) {
        super();
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.ingredients = ingredients;
    }

    public Taco() {
        super();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
