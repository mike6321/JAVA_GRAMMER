package me.choi;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter
@EqualsAndHashCode
public class Member {
    private String name;

    private int age;

    public boolean isSame(Member member) {
        return this.age == member.age;
    }


}
