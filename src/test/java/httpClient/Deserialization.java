package httpClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.junit.Test;
import pojo.CharPojo;
import pojo.CharacterPojo;
import pojo.HousesPojo;
import pojo.LocationPojo;
import pojo.star_wars.PeoplePojo;
import pojo.star_wars.PlanetsPojo;
import pojo.star_wars.StarshipsPojo;

import java.io.IOException;

public class Deserialization {

    @Test
    public void getCharacter() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/map/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        CharacterPojo character = objectMapper.readValue(response.getEntity().getContent(), CharacterPojo.class);

        System.out.println(character.getData());
    }

    @Test
    public void getHouses() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/houses");

        ObjectMapper objectMapper = new ObjectMapper();
        HousesPojo[] houses = objectMapper.readValue(response.getEntity().getContent(), HousesPojo[].class);

        for (HousesPojo house : houses) {
            System.out.println(house.getName());
        }
    }

    @Test
    public void bookChar() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characters/");

        ObjectMapper objectMapper = new ObjectMapper();
        CharPojo[] books = objectMapper.readValue(response.getEntity().getContent(), CharPojo[].class);

        for (CharPojo book : books) {
            System.out.println(book.getName());
        }
    }

    @Test
    public void getLocation() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characterlocations");

        ObjectMapper objectMapper = new ObjectMapper();
        LocationPojo location = objectMapper.readValue(response.getEntity().getContent(), LocationPojo.class);

        System.out.println(location.getData());
    }


    @Test
    public void getPlanets() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/planets?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        PlanetsPojo star = objectMapper.readValue(response.getEntity().getContent(), PlanetsPojo.class);

        System.out.println(star.getResults());
    }


    @Test
    public void getStarships() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/starships/?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        StarshipsPojo starship = objectMapper.readValue(response.getEntity().getContent(), StarshipsPojo.class);

        System.out.println(starship.getResults());
    }

    @Test
    public void getPeople() throws IOException {

        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/people/?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        PeoplePojo people = objectMapper.readValue(response.getEntity().getContent(), PeoplePojo.class);

        System.out.println(people.getResults());
    }

        }








