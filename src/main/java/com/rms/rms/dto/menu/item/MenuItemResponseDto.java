package com.rms.rms.dto.menu.item;

import com.rms.rms.enums.Category;
import com.rms.rms.enums.Course;
import com.rms.rms.enums.Currency;
import com.rms.rms.enums.Type;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MenuItemResponseDto {

    private Long id;
    private String name;
    private Double price;
    private Integer michelinStars;
    private Course course;
    private String description;
    private Type type;
    private Category category;
    private Boolean available;
    private Currency currency;
    private Double calories;
    private List<MenuItemIngredientResponseDto> menuItemIngredient;

}
