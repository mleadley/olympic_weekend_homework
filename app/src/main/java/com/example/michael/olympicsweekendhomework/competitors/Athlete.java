package com.example.michael.olympicsweekendhomework.competitors;

import com.example.michael.olympicsweekendhomework.SkillType;

import java.util.*;

/**
 * Created by michael on 15/09/2017.
 */

public class Athlete implements Competitor {
    private String name;
    private String country;
    private Map<SkillType,Integer> skills;

    public Athlete(String name, String country, Map<SkillType, Integer> skills) {
        this.name = name;
        this.country = country;
        this.skills = skills;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public Map<SkillType, Integer> getSkills() {
        return skills;
    }

    @Override
    public int getSkill(SkillType skill) {
        return skills.get(skill);
    }
}