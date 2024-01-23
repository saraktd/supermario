package servis.user;

import model.challeng.Challeng;
import model.level.Easy;
import model.level.Hard;
import model.level.Medium;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Long id;

    private List<Challeng> challengList = new ArrayList<>();

    public User() {
    }

    public User(String name, Long id, List<Challeng> challengList) {
        this.name = name;
        this.id = id;
        this.challengList = challengList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Challeng> getChallengList() {
        return challengList;
    }

    public void setChallengList(List<Challeng> challengList) {
        this.challengList = challengList;
    }

    public void add(Challeng challeng) {
        challengList.add(challeng);
    }

    public void remove(Challeng challeng) {
        challengList.remove(challeng);
    }

    public void addList(Challeng challeng) {
        challengList.add(challeng);
    }

}

