package pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class CharacterPojo {
    /*
    https://api.got.show/api/map/characters
     */
    private String message;
    private List<Object> data;
    private List<String> titles;
    private List<String> books;
    private int _id;
    private boolean male;
    private String house;
    private String slug;
    private String name;
    private int createdAt;
    private int updatedAt;
    private int __v;

}
